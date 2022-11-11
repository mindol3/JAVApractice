package javaPractice.ch_03;

import java.util.Random;
import java.util.Scanner;

public class method_13 {
	/*
	 * 인수(매개변수)가 없는 매서드
	 * 암산연습*/
	static Scanner stdIn = new Scanner(System.in); // 두 메서드에서 사용하기 위해 클래스 변수로 선언
	
	// 지속 여부의 확인
	static boolean confirmRetry() { // 매개변수를 전달받지 않는 메서드
		int cont;
		do {
			System.out.print("다시 한번? <Yes-1/No-0> : ");
			cont = stdIn.nextInt( );
		} while ( cont != 0 && cont != 1);
		return cont == 1; // cont가 1이면 true, 아니면 false
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		System.out.println("암산 트레이닝!!");
		do {
			//random.nextInt(n) : 0 ~ (n - 1) 까지의 정수를 랜덤으로 반환
			int x = rand.nextInt(900) + 100;	// 3자릿수의 수
			int y = rand.nextInt(900) + 100;	// 3자릿수의 수
			int z = rand.nextInt(900) + 100;	// 3자릿수의 수
		while (true) {
			System.out.print( x + " + " + y + " + " + z + " = ");
			int k = stdIn.nextInt( );
			if ( k == x + y + z)
				break;
			System.out.println("틀렸습니다!!");
			
		}
	}while (confirmRetry());
	} 
}
