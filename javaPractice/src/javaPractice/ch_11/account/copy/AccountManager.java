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
	private Connection connection = null;
	
	public AccountManager() {
		getConnection();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	private void getConnection() { // ��� ����
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
	public void disConnect() { // ���� ����. ���� ����ÿ� ���.
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private boolean isAccount(int id) { // ������ ���°� �ִ���
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
		//���� ����.
		// ���� �������� ������ ���� ��ȣ�� �����ϴ��� Ȯ��
		Statement statement = null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " ���°� �����մϴ�.");
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

	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.println("���� ��ȣ: ");
		account.setId(stdIn.nextInt());
		int id = account.getId();
		
		System.out.println("�̸�: ");
		account.setName(stdIn.next());
		
		System.out.println("�Աݾ�: ");
		account.setBalance(stdIn.nextLong());
		if(insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�.");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�");
		}
//		if(!isAccount(id)) {
//			list.add(account);
//			
//			System.out.println("���°� �����Ǿ����ϴ�.");
//			System.out.println(list.toString() + "\t");
//		}
//		else {
//			System.out.println(id + " ���¹�ȣ�� ����� �Դϴ�.");
//		}
	}
	private ArrayList<Account> selectAll(){
		// ��ü ���� ����
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
	
	
	void deposit() { // �Ա�
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
//		for(Account account : list) {
//			if(account.getId() == id) {// ������ ���°� �ִٸ�.
//				account.setBalance(money + account.getBalance());
//				System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
//				return;
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		Account account = findAccount(id);
		if(account != null) {
			account.setBalance(money + account.getBalance());
			System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
		}
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
		ArrayList<Account> list = selectAll();
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
