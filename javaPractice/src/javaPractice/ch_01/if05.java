package javaPractice.ch_01;

import java.util.Scanner;

public class if05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.print("���̵� �Է��� �ּ���:");
		id = input.nextLine();
		
		if (id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.print("��й�ȣ�� �Է��� �ּ���:");
			password = input.nextLine();
			if (password.equals("abc123")) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		else {
			System.out.println("���̵� ����ġ");
		}
		input.close();
	}

}
