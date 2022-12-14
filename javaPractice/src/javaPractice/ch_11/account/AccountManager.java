package javaPractice.ch_11.account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private final String ERROR_NOT_FIND_ID = "입력하신 계좌번호는 존재하지 않는 번호 입니다.";
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.println("계좌 번호: ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.println("이름: ");
		account.setName(stdIn.next());
		
		System.out.println("입금액: ");
		account.setBalance(stdIn.nextLong());
		if(!isAccount(id)) {
			list.add(account);
			
			System.out.println("계좌가 개설되었습니다.");
			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println(id + " 계좌번호는 사용중 입니다.");
		}
	}
	void deposit() { // 입금
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("입금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		for(Account account : list) {
			if(account.getId() == id) {// 동일한 계좌가 있다면.
				account.setBalance(money + account.getBalance());
				System.out.println("입금완료 되었습니다.");
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다.");
//		Account account = findAccount(id);
//		if(account != null) {
//			account.setBalance(money + account.getBalance());
//			System.out.println("입금완료 되었습니다.");
//		}
	}
	void withdraw() {
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("출금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		for(Account account : list) {
			if(account.getId() == id) {// 동일한 계좌가 있다면.
				if(account.getBalance() < money){
					System.out.println("잔액이 부족합니다.");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("출금완료 되었습니다.");
				}
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다.");
	}
	void inquire() { // 잔액 조회
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		// 해당 계좌 찾기
		for(Account account : list) {
			if(account.getId() == id) {// 동일한 계좌가있다면
//				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				System.out.println(account.toString());
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다.");
	}
	void display() { // 출력
		for (Account account : list) {
//			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			System.out.println(account);
		}
	}
	private Account findAccountTraverse(int id) {
		// 해당 계좌 찾기
		for(Account account : list) {
			if (account.getId() == id) { // 동일한 계좌가 있따면
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) { // 입금, 출금, 조회시에 계좌 찾기
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
