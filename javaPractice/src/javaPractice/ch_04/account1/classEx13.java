package javaPractice.ch_04.account1;

import java.util.Scanner;

/*
 idx 클래스 변수를 추가해서 배열 저장 및 배열 순회에 관한 부분을 수정해서
 for문의 반복을 최소화 하세요.*/

public class classEx13 {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				
				
			}
			else if (selectNo == 2) {
				
			}
			else if (selectNo == 3) {
				
			}
			else if (selectNo == 4) {
				
			}
			else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
