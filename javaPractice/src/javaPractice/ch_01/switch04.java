package javaPractice.ch_01;

import java.util.Scanner;

public class switch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오.");
		int grade = scanner.nextInt();
		grade =grade / 10 * 10;
		switch (grade) {
		case 90 : case 100 :
			System.out.println("A");
			break;
		case 80 :
			System.out.println("B");
			break;
		case 70 :
			System.out.println("C");
			break;
		case 60 :
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		scanner.close();
//		if ( grade >= 90 ) {
//			System.out.println("A입니다.");
//		}
//		else if ( grade >= 80 ) {
//			System.out.println("B입니다.");
//		}
//		else if ( grade >= 70 ) {
//			System.out.println("C입니다.");
//		}
//		else if ( grade >= 60 ) {
//			System.out.println("D입니다.");
//		}
//		else {
//			System.out.println("F입니다.");
//		}
	}

}
