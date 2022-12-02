package javaPractice.ch_09_test;

import java.util.Scanner;

// 재귀에 대한 이해를 돕는 순수 재귀 메서드

public class Recur {
	// 순수 재귀 메서드
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
		
		System.out.println("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		recur(x);
	}

}
