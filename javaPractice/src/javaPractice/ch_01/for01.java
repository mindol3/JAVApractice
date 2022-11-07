package javaPractice.ch_01;

public class for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 총 합을 담을                                                                                                                                                                                                변수
		for (int i = 1; i <= 10; i++) {
			System.out.println("i =" + i + ", sum = "+ (sum += i));
		}
	}

}
