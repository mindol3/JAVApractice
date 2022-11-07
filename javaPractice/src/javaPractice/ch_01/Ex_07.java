package javaPractice.ch_01;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 1부터 100까지의 정수 중에서
		// 3의 배수의 총합을 구하는 코드를 작성해 보세요.
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
		
		sum = 0;
		for (int i = 3; i <= 100; i+=3) {
			sum += i;
		}
		System.out.println("3의 배수의 합: " + sum);
	}

}
