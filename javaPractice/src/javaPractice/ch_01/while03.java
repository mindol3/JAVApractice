package javaPractice.ch_01;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		String answer = "Y"; // while�� ���۵� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
//		
//		while (answer.equals("Y")) {
//			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
//			answer = scanner.nextLine(); //������� ������ �޽��ϴ�.
//			
//			if (answer.equals("Y")) {
//				++count;
//				System.out.println("������ " + count + "�� ����߽��ϴ�.");
//			}
//		}
//		System.out.println("�������");
		for (String answer = "Y"; answer.equals("Y") || answer.equals("y");) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
			answer = scanner.nextLine();// ������� ������ �޽��ϴ�
			
			if (answer.equals("Y") || answer.equals("y")) {
				++count;
				System.out.println("������ " + count + "�� ����߽��ϴ�.");
			}
			scanner.close();
		}
		System.out.println("�������");
	}

}
