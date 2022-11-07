package javaPractice.ch_02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		int a, b, c, d;
//		int sum;
//		
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		a = scanner.nextInt();
//		System.out.print("2번째 숫자를 입력하세요 : ");
//		b = scanner.nextInt();
//		System.out.print("3번째 숫자를 입력하세요 : ");
//		c = scanner.nextInt();
//		System.out.print("4번째 숫자를 입력하세요 : ");
//		d = scanner.nextInt();
//		
//		sum = a + b + c + d;
//		
//		System.out.print(" 합계 ==>" + sum);
//		int num[] = new int[4];
//		int sum =;
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		num[0] = scanner.nextInt();
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		num[1] = scanner.nextInt();
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		num[2] = scanner.nextInt();
//		System.out.print("1번째 숫자를 입력하세요 : ");
//		num[3] = scanner.nextInt();
//		
//		sum = num[0] + num[1] + num[2] + num[3];
//		
//		System.out.print(" 합계 ==> " + sum);
		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(i+1 +"번째 숫자를 입력하세요 :");
//			num[i] = scanner.nextInt();
//		}
//		sum = num[0] + num[1] + num[2] + num[3];
		
//		System.out.print(" 합계 ==> " + sum);
		int num[] = new int[4];
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 +"번째 숫자를 입력하세요 :");
			num[i] = scanner.nextInt();
		}
		for(int j = 0; j < num.length; j++) {
			sum += num[j];
		}
		System.out.print(" 합계 ==> " + sum);
	}

}
