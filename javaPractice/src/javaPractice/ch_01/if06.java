package javaPractice.ch_01;

import java.util.Scanner;

public class if06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ǥ���մϴ�. \n �� ���Դϱ�?");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <= 5) { // 3, 4, 5��
			System.out.println("�̰��� ���Դϴ�.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("�̰��� �����Դϴ�.");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("�̰��� �����Դϴ�.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("�̰��� �ܿ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է� ���Դϴ�.");
		}
	}

}
