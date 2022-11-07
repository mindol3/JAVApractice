package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*do while 문을 사용해서 사용자로 부터 월의 번호를 입력받는 프로그램을 작성해 보세요.
		 * 사용자가 올바른 월 번호를 입력할 때 까지 반복을 계속합니다.
		 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다.*/
		Scanner scanner = new Scanner(System.in);
//		int month;
//		
//		do {
//			System.out.print("올바른 월을 입력하세요 [1-12]");
//			month = scanner.nextInt();
//		}while (month < 1 || month > 12);
//		System.out.println("사용자가 입력한 월은" + month + "입니다.");
		
		//Ex_10 문제를 do while문으로 변화 
		int sum = 0, value;	
		do {
			System.out.print("정수를 입력하세요: ");
			value = scanner.nextInt();		
			if(value >=0) {
				sum += value;			
			}
		}while (value >= 0); 
			System.out.println("정수의 합계는" + sum + "입니다.");
		
	}

}
