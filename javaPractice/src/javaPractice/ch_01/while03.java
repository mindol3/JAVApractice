package javaPractice.ch_01;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		String answer = "Y"; // while이 시작될 수 있도록 응답 값을 초기화
		int count = 0;
//		
//		while (answer.equals("Y")) {
//			System.out.println("음악을 재생하시겠습니까?(Y)");
//			answer = scanner.nextLine(); //사용자의 응답을 받습니다.
//			
//			if (answer.equals("Y")) {
//				++count;
//				System.out.println("음악을 " + count + "번 재생했습니다.");
//			}
//		}
//		System.out.println("재생종료");
		for (String answer = "Y"; answer.equals("Y") || answer.equals("y");) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = scanner.nextLine();// 사용자의 응답을 받습니다
			
			if (answer.equals("Y") || answer.equals("y")) {
				++count;
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
			scanner.close();
		}
		System.out.println("재생종료");
	}

}
