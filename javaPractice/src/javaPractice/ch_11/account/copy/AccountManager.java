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
	private Connection connection = null;
	
	public AccountManager() {
		getConnection();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	private void getConnection() { // 디비 연결
		try {
			String url = "jdbc:mariadb://localhost:5000/account_sample";
			String user = "root";
			String password = "1234";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			this.connection =DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void disConnect() { // 연결 해제. 서비스 종료시에 사용.
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private boolean isAccount(int id) { // 동일한 계좌가 있는지
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id + "'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
//			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	private boolean insertAccount(Account account) {
		//계좌 생성.
		// 계좌 생성전에 동일한 계좌 번호가 존재하는지 확인
		Statement statement = null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " 계좌가 존재합니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)"
					, account.getId(), account.getName(), account.getBalance());
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
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
		if(insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다");
		}
//		if(!isAccount(id)) {
//			list.add(account);
//			
//			System.out.println("계좌가 개설되었습니다.");
//			System.out.println(list.toString() + "\t");
//		}
//		else {
//			System.out.println(id + " 계좌번호는 사용중 입니다.");
//		}
	}
	private ArrayList<Account> selectAll(){
		// 전체 정보 전달
		Statement statement = null;
		ArrayList<Account> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM account ";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				
				Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getInt("balance"));
				list.add(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	void deposit() { // 입금
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("입금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
//		for(Account account : list) {
//			if(account.getId() == id) {// 동일한 계좌가 있다면.
//				account.setBalance(money + account.getBalance());
//				System.out.println("입금완료 되었습니다.");
//				return;
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다.");
		Account account = findAccount(id);
		if(account != null) {
			account.setBalance(money + account.getBalance());
			System.out.println("입금완료 되었습니다.");
		}
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
		ArrayList<Account> list = selectAll();
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
