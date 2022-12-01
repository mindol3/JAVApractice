package javaPractice.ch_08;

import java.util.Scanner;

public class trycatch07 {
	private static final Scanner in = new Scanner(System.in);
	
	public static void input() {
		int age = 0;
		
		try {
			System.out.println("나이 = ");
			age = Integer.parseInt(in.nextLine());
		}
		catch (NumberFormatException ex) {
			System.out.println("오류 발생 = " + ex.getMessage());
			return;
		}
		finally {
			System.out.printf("나이 = %d세\n", age);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Start!!!");
		input();
		System.out.println("Main Method End!!!");
	}

}
