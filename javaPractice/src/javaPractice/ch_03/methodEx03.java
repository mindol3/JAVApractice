package javaPractice.ch_03;

import java.util.Scanner;

public class methodEx03 {
	/* 우하변이 직각인 직각삼각형을 표시하세요.
	 * 별이 출력되는 부분은 putStars() 메서드를 저으이해서 구현하세요.
	 * 몇 단 : 4
	 * */
	static void putStars(int n, int total) {
		for (int i = 1; i <= total; i++) {
			if(i <= total - n) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int total = stdIn.nextInt();
		
		for (int i = 1; i <= total; i++) {
			//putStars() 메서드 호출
			putStars(i, total);
			System.out.println();
		}
	}

}
