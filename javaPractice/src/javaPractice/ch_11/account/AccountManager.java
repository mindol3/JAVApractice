package javaPractice.ch_11.account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private final String ERROR_NOT_FIND_ID = "�Է��Ͻ� ���¹�ȣ�� �������� �ʴ� ��ȣ �Դϴ�.";
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.println("���� ��ȣ: ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.println("�̸�: ");
		account.setName(stdIn.next());
		
		System.out.println("�Աݾ�: ");
		account.setBalance(stdIn.nextLong());
		if(!isAccount(id)) {
			list.add(account);
			
			System.out.println("���°� �����Ǿ����ϴ�.");
			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println(id + " ���¹�ȣ�� ����� �Դϴ�.");
		}
	}
	void deposit() { // �Ա�
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		for(Account account : list) {
			if(account.getId() == id) {// ������ ���°� �ִٸ�.
				account.setBalance(money + account.getBalance());
				System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
//		Account account = findAccount(id);
//		if(account != null) {
//			account.setBalance(money + account.getBalance());
//			System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
//		}
	}
	void withdraw() {
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("��ݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		for(Account account : list) {
			if(account.getId() == id) {// ������ ���°� �ִٸ�.
				if(account.getBalance() < money){
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("��ݿϷ� �Ǿ����ϴ�.");
				}
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	void inquire() { // �ܾ� ��ȸ
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		// �ش� ���� ã��
		for(Account account : list) {
			if(account.getId() == id) {// ������ ���°��ִٸ�
//				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				System.out.println(account.toString());
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	void display() { // ���
		for (Account account : list) {
//			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			System.out.println(account);
		}
	}
	private Account findAccountTraverse(int id) {
		// �ش� ���� ã��
		for(Account account : list) {
			if (account.getId() == id) { // ������ ���°� �ֵ���
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) { // �Ա�, ���, ��ȸ�ÿ� ���� ã��
		Account account = findAccountTraverse(id);
		if(account == null) {
			System.out.println(ERROR_NOT_FIND_ID);
		}
		return account;
	}
	private boolean isAccount(int id) {
		return (findAccountTraverse(id) == null) ? false : true;
	}
}
