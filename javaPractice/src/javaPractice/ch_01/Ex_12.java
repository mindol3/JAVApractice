package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*while, break�� ����Ͽ� ����ڰ� �Է��� �������� ����� ���� ���α׷��� �ۼ��մϴ�.
		 * ���� ����ڰ� ������ �Է��ϸ� break�� ���Ͽ� �ݺ� ������ ����ǰ� �մϴ�.*/
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int count = 0;
		while(true) {
			System.out.print("������ �Է��ϼ���:");
			int grade = scanner.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count ++;
		}
		System.out.println("����� " + total / (double) count);
	}

}
