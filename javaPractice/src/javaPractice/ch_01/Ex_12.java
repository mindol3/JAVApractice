package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*while, break를 사용하여 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성합니다.
		 * 만약 사용자가 음수를 입력하면 break에 의하여 반복 루프가 종료되게 합니다.*/
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int count = 0;
		while(true) {
			System.out.print("점수를 입력하세요:");
			int grade = scanner.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count ++;
		}
		System.out.println("평균은 " + total / (double) count);
	}

}
