package javaPractice.ch_01;

public class MyOper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리곱
		System.out.println(true && true); // t 1 * 1 = 1
		System.out.println(true && false); // f 1 * 0 = 0
		System.out.println(false && true); // f 0 * 1 = 0
		System.out.println(false && false); // f 0 * 0 = 0
		
		// 논리합
		System.out.println( true || true); // t 1 + 1 = 2
		System.out.println( true || false); // t 1 + 0 = 1
		System.out.println( false || true); // t 0 + 1 = 1
		System.out.println( false || false); // f 0 + 0 = 0
	}

}
