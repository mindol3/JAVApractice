package javaPractice.ch_08;

import java.util.Scanner;

class member extends Exception {
	public member(String msg) {
		super(msg);
	}
	// ���ܰ� �߻��� �ÿ� �α׷� ����� �ڵ�
	public member(String msg, String memberID, String password) {
		super(msg);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		
	}
}

// �α��� ������ Ʋ�� ��츦 ����� ���� ����Ŭ������ ���� ����ó�� �� ��
public class tryEx04 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws member {
		if(this.memberID.equals(memberID) && this.password.equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			return true;
		}
		else {
			throw new member("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
		}
	}
	
	public void login() {
		String memberID, password;
		Boolean answer;
		System.out.println("�α��� ������ �Է��� �ּ���.");
		do {
			System.out.println("���̵� �Է��� �ּ��� >>>");
			memberID = stdIn.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ��� >>>");
			password = stdIn.nextLine();
			try {
				answer = confirmLogin(memberID, password);
			}
			catch (member e) {
				System.out.println(e.getMessage());
				answer = false;
			}
		}
		while (!answer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tryEx04 ex = new tryEx04();
		ex.login();
	}

}
