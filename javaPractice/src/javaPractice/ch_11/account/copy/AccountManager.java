package javaPractice.ch_11.account.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {
	private final String ERROR_NOT_FIND_ID = "�Է��Ͻ� ���¹�ȣ�� �������� �ʴ� ��ȣ �Դϴ�.";
	private ArrayList<Account> list;
	private Scanner stdIn;
	private AccountDAO accountDAO;
//	private Connection connection = null;
	
	public AccountManager() {
//		getConnection();
		accountDAO = new AccountDAO();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	public void disConnect() {
		accountDAO.disConnect();
	}
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.println("���� ��ȣ: ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.println("�̸�: ");
		account.setName(stdIn.next());
		
		System.out.println("�Աݾ�: ");
		account.setBalance(stdIn.nextLong());
		if(accountDAO.insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�.");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�");
		}
		
	}

	
	void deposit() { // �Ա�
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdIn.nextLong();
		
//		boolean account = updateBalance(id, money, true);
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
//			account.setBalance(money + account.getBalance());
			System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	void withdraw() {
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		Account accountt = accountDAO.selectOne(id);
		System.out.println("���¹�ȣ\t����\t�ܾ�");
		System.out.println(accountt.getId() + "\t" + accountt.getName() + "\t" + accountt.getBalance());

		System.out.println("��ݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if(account.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("��ݿϷ� �Ǿ����ϴ�.");
			}
			return;
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");			
		}
	}
	void inquire() { // �ܾ� ��ȸ
		System.out.print("���¹�ȣ: ");
		int id = stdIn.nextInt();
		Account account = accountDAO.selectOne(id);
		// �ش� ���� ã��
//		for(Account account : list) {
			if(account != null) {
				System.out.println("���¹�ȣ\t����\t�ܾ�");
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//				System.out.println(account.toString());
			
//			}
		}
			else {
				System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
			}
	}
	void display() { // ���
		ArrayList<Account> list = accountDAO.selectAll();
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//			System.out.println(account);
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
//	private boolean isAccount(int id) {
//		return (findAccountTraverse(id) == null) ? false : true;
//	}
}
