package javaPractice.ch_01;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� >>>");
		int age;
		// 1) ������ ����
		age = input.nextInt();//
		
		// 2) ���ڿ��� �Է� ���� �Ŀ� ����
		/*Stirng tmp;
		 * tmp = input.nextLine();
		 * age = Integer.parseInt(tmp);*/
		
		if (age <= 8) { // 0 8
			System.out.println("�����Դϴ�.");
			System.out.println("���ƿ���� ����˴ϴ�.");
		}
		else if (age <= 13) {// 9 ~ 13
			System.out.println("����Դϴ�.");
			System.out.println("��̿���� ����˴ϴ�.");
		}
		else if (age <= 19) { // 14 ~ 19
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ����� ����˴ϴ�.");
		}
		else { // 
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");
	}

}
