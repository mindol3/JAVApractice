package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*������ �Էµ� ������,
		 * ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * while���� ���, break ������� �� ��*/
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int value = 0; // while���� ������ 1) ó���� ���� �Ǿ�� �ϰ� 2) �տ� ������ ��ġ�� �ʾƾ� ��.
		
		while (value >= 0) {
			sum += value;
			System.out.print("������ �Է��ϼ���: ");
			value = scanner.nextInt();
		}
		System.out.println("������ �հ��" + sum + "�Դϴ�.");
	}

}
