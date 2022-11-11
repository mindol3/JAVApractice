package javaPractice.ch_03;

public class method_07 {
	/*매개 변수를 2개 사용하는 메서드*/
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("결과값 : " + c);
	}
	
	//매개 변수로 문자열을 받는 메서드 선언.
	public void print1(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// 사용할 메서드가 있는 클래스의 인스턴스 선언
		method_07 method = new method_07();
		
		// 메서드 호출
		method.print(10, 20);
		// method.print(10, 30.0f); 실수라 안댐
		method.print(num1, num2);
		
		method.print1("안녕하세요.");
	}

}
