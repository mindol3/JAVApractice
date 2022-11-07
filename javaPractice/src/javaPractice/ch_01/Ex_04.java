package javaPractice.ch_01;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자로 부터 두 개의 정수를 입력받아서
		 * 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를
		 * 계산하여 화면에 출력하는 프로그램을 작성하시오
		 * 큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자)를 사용하시오.*/
		int a = 10;
		int b = 20;
		
		System.out.println(a + b); // 30
		System.out.println(a - b); // -10
		System.out.println(a * b); // 200
		System.out.println((a + b) / 2.0); // 15.0
		System.out.println(a > b ? a : b);
		System.out.println(a < b ? a : b);
		
		
	}

}
