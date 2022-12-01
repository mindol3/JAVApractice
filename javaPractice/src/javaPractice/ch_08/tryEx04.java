package javaPractice.ch_08;

import java.util.Scanner;

class member extends Exception {
	public member(String msg) {
		super(msg);
	}
	// 예외가 발생할 시에 로그로 남기는 코드
	public member(String msg, String memberID, String password) {
		super(msg);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		
	}
}

// 로그인 정보가 틀린 경우를 사용자 정의 예외클래스를 만들어서 예외처리 할 것
public class tryEx04 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws member {
		if(this.memberID.equals(memberID) && this.password.equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		else {
			throw new member("로그인 정보가 정확하지 않습니다.");
		}
	}
	
	public void login() {
		String memberID, password;
		Boolean answer;
		System.out.println("로그인 정보를 입력해 주세요.");
		do {
			System.out.println("아이디를 입력해 주세요 >>>");
			memberID = stdIn.nextLine();
			System.out.println("비밀번호를 입력해 주세요 >>>");
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
