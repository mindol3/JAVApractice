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
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		a = scanner.nextInt();
//		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
//		b = scanner.nextInt();
//		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
//		c = scanner.nextInt();
//		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
//		d = scanner.nextInt();
//		
//		sum = a + b + c + d;
//		
//		System.out.print(" �հ� ==>" + sum);
//		int num[] = new int[4];
//		int sum =;
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		num[0] = scanner.nextInt();
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		num[1] = scanner.nextInt();
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		num[2] = scanner.nextInt();
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		num[3] = scanner.nextInt();
//		
//		sum = num[0] + num[1] + num[2] + num[3];
//		
//		System.out.print(" �հ� ==> " + sum);
		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(i+1 +"��° ���ڸ� �Է��ϼ��� :");
//			num[i] = scanner.nextInt();
//		}
//		sum = num[0] + num[1] + num[2] + num[3];
		
//		System.out.print(" �հ� ==> " + sum);
		int num[] = new int[4];
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 +"��° ���ڸ� �Է��ϼ��� :");
			num[i] = scanner.nextInt();
		}
		for(int j = 0; j < num.length; j++) {
			sum += num[j];
		}
		System.out.print(" �հ� ==> " + sum);
	}

}
