package javaPractice.ch_09_test;

import java.util.Scanner;

public class MemberInsert extends Member{
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
		// TODO Auto-generated constructor stub
	}

	Scanner stdIn = new Scanner(System.in);
	
	
	
	
	
	public void updateAddInfo() {
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸� �ϽǷ��� N�� �Է��� �ֽʽÿ�.>>>");
		String Info = stdIn.nextLine();
		if(Info.equals("Y")) {
			System.out.println("�ּҸ� �Է��� �ֽʽÿ�.>>>");
			String address = stdIn.nextLine();
			setAddress(address);
			System.out.println("�̸��� �Է��� �ֽʽÿ�.>>>");
			String email = stdIn.nextLine();	
			setEmail(email);
		}
		
	}
	
	public void printMemberInfo() {
		System.out.println(toString());
	}
	
	public void login() {
		System.out.println("�α��� ������ �Է��� �ּ���.");
		System.out.println("");
		System.out.println("���̵� �Է��� �ּ��� >>>");
		String memberID = stdIn.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ��� >>>");
		String password = stdIn.nextLine();
		
		if(getMemberID().equals(memberID) && getPassword().equals(password)) {
			System.out.println("�α����� �Ǿ����ϴ�.");		
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			login();
		}
		
	}

}
