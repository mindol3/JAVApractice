package javaPractice.ch_09_test;

import java.util.Scanner;

// ��Ϳ� ���� ���ظ� ���� ���� ��� �޼���

public class Recur {
	// ���� ��� �޼���
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int x = stdIn.nextInt();
		
		recur(x);
	}

}
