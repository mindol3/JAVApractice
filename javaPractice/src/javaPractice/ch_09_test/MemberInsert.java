package javaPractice.ch_09_test;

import java.util.Scanner;

public class MemberInsert extends Member{
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
		// TODO Auto-generated constructor stub
	}

	Scanner stdIn = new Scanner(System.in);
	
	
	
	
	
	public void updateAddInfo() {
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.println("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요.>>>");
		String Info = stdIn.nextLine();
		if(Info.equals("Y")) {
			System.out.println("주소를 입력해 주십시요.>>>");
			String address = stdIn.nextLine();
			setAddress(address);
			System.out.println("이메일 입력해 주십시요.>>>");
			String email = stdIn.nextLine();	
			setEmail(email);
		}
		
	}
	
	public void printMemberInfo() {
		System.out.println(toString());
	}
	
	public void login() {
		System.out.println("로그인 정보를 입력해 주세요.");
		System.out.println("");
		System.out.println("아이디를 입력해 주세요 >>>");
		String memberID = stdIn.nextLine();
		System.out.println("비밀번호를 입력해 주세요 >>>");
		String password = stdIn.nextLine();
		
		if(getMemberID().equals(memberID) && getPassword().equals(password)) {
			System.out.println("로그인이 되었습니다.");		
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			login();
		}
		
	}

}
