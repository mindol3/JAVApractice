package javaPractice.ch_01;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교 연산자
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b); // f
		System.out.println(a != b); // t
		
		// 문자열의 경우 equlas() 메서드를 이용해서 값을 비교
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); // f
		System.out.println(c1.equals("Hello JAVA!")); // t
		
		// == 은 객체의 주소값을 비교
		System.out.println(c1 == ("Hello java!")); // f
		System.out.println(c1 == ("Hello JAVA!")); // t
	}

}
