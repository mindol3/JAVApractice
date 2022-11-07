package javaPractice.ch_01;

import java.util.Scanner;

public class if06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("계절을 표시합니다. \n 몇 월입니까?");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <= 5) { // 3, 4, 5월
			System.out.println("이것은 봄입니다.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("이것은 여름입니다.");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("이것은 가을입니다.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("이것은 겨울입니다.");
		}
		else {
			System.out.println("잘못된 입력 값입니다.");
		}
	}

}
