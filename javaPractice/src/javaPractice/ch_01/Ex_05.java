package javaPractice.ch_01;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자에게 입력받은 정수가 양수인지,
		 * 0인지, 음수인지 알려주는 코드를 완성하세요.*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int num = stdIn.nextInt();
		if (num > 0) {
			System.out.println("이것은 양수입니다.");
		}
		else if (num == 0) {
			System.out.println("이것은 0입니다.");
		}
		else {
			System.out.println("이것은 음수입니다.");
		}
		stdIn.close();
	}

}
