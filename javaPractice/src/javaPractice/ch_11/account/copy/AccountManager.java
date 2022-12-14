package javaPractice.ch_11.account.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {
	private final String ERROR_NOT_FIND_ID = "입력하신 계좌번호는 존재하지 않는 번호 입니다.";
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
	
	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.println("계좌 번호: ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.println("이름: ");
		account.setName(stdIn.next());
		
		System.out.println("입금액: ");
		account.setBalance(stdIn.nextLong());
		if(accountDAO.insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다");
		}
		
	}

	
	void deposit() { // 입금
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("입금액: ");
		long money = stdIn.nextLong();
		
//		boolean account = updateBalance(id, money, true);
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
//			account.setBalance(money + account.getBalance());
			System.out.println("입금완료 되었습니다.");
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
	}
	void withdraw() {
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		Account accountt = accountDAO.selectOne(id);
		System.out.println("계좌번호\t성명\t잔액");
		System.out.println(accountt.getId() + "\t" + accountt.getName() + "\t" + accountt.getBalance());

		System.out.println("출금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if(account.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("출금완료 되었습니다.");
			}
			return;
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");			
		}
	}
	void inquire() { // 잔액 조회
		System.out.print("계좌번호: ");
		int id = stdIn.nextInt();
		Account account = accountDAO.selectOne(id);
		// 해당 계좌 찾기
//		for(Account account : list) {
			if(account != null) {
				System.out.println("계좌번호\t성명\t잔액");
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//				System.out.println(account.toString());
			
//			}
		}
			else {
				System.out.println("해당 계좌번호가 존재하지 않습니다.");
			}
	}
	void display() { // 출력
		ArrayList<Account> list = accountDAO.selectAll();
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
//			System.out.println(account);
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
//	private boolean isAccount(int id) {
//		return (findAccountTraverse(id) == null) ? false : true;
//	}
}
