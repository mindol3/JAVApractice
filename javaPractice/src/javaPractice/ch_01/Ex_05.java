package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����ڿ��� �Է¹��� ������ �������,
		 * 0����, �������� �˷��ִ� �ڵ带 �ϼ��ϼ���.*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int num = stdIn.nextInt();
		if (num > 0) {
			System.out.println("�̰��� ����Դϴ�.");
		}
		else if (num == 0) {
			System.out.println("�̰��� 0�Դϴ�.");
		}
		else {
			System.out.println("�̰��� �����Դϴ�.");
		}
		stdIn.close();
	}

}
