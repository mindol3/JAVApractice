package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자에게 성적을 입력받아
		 * if문을 사용해서 학점을 출력하는 코드를 완성하세요.
		 * 입력은 0 ~ 100까지 입력이 됩니다.
		 * 기준은 아래와 같습니다.
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F :  0 ~ 59*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("점수를 입력하시오.");
		int grade = stdIn.nextInt();
		if ( grade >= 90 ) {
			System.out.println("A입니다.");
		}
		else if ( grade >= 80 ) {
			System.out.println("B입니다.");
		}
		else if ( grade >= 70 ) {
			System.out.println("C입니다.");
		}
		else if ( grade >= 60 ) {
			System.out.println("D입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
	}

}
