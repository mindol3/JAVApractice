package javaPractice.ch_03;

import java.util.Scanner;

public class method_02 {
	/*메서드 사용의 장점
	 * 1. 코드 반복을 줄일 수 있음.
	 * 대부분의 프로그램은 어떤 코드를 반복해서 사용.
	 * 반복되는 코드를 방치하면 유지보수하는 사람은 반복되는 코드로 불편을 느끼게 되고,
	 * 코드가 반복되면 기억하고 불편을 느끼게 됨.
	 * 또 코드를 개선하거나 유지보수할 때 여러 가지 부분을 수정해야 하는문제가 발생
	 * Don't repeat yourself (DRY, 반복하지마라) 원칙을 지키는 대표적인 방법이 바로 '메서드를 활용하는것'
	 * 
	 * 2. 더 높은 추상화를 할 수 있다.
	 * 프로그램 내부에 있는 코드를 하나하나 신경 쓴다면 프로그램을 제대로 만들 수 없음.
	 * 함수를 활용하면 세부 코드를 하나하나 신경 쓰지 않아도, '메서드 이름' 만으로 원하는 처리를 할 수 있음
	 * 
	 * 3.메서드를 만들면 1)소스가 줄어들어서 main 메서드의 기본 로직을 읽기 쉽고 2)재사용 가능*/
	static int max(int a, int b, int c) { // a, b, c의 최대값을 반환
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드는 왜 필요한가?
		
				// 3명의 신장, 체중, 나이의 최대값을 구해서 표시
				Scanner stdIn = new Scanner(System.in);
				
				int[] height = new int[3]; // 신장
				int[] weight = new int[3]; // 체중
				int[] age = new int[3];    // 나이
				
				for ( int i = 0; i < 3; i++) {		//입력
					System.out.print("[" + (i + 1) + "] ");
					System.out.print("신장:"); 			height[i] = stdIn.nextInt( );
					System.out.print("	체중:"); 		weight[i] = stdIn.nextInt( );
					System.out.print("	나이:"); 		age[i]	  = stdIn.nextInt( );
				}
				
				
				int maxHeight = max(height[0], height[1], height[2]); // 신장의 최대값
				int maxWeight = max(weight[0], weight[1], weight[2]); // 체중의 최대값
				int maxAge = max(age[0], age[1], age[2]); // 나이의 최대값
				
				
				
				System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
				System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
				System.out.println("나이의 최대값은 " + maxAge    + "입니다.");
			}
	}


