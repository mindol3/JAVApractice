package javaPractice.ch_03;

public class method_08 {
	/* 리턴 타입이 있는 메서드*/
	public int add(int a, int b) {
		int c = a + b;
		return c;
		// return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야 함.
		// return 3.5; // 리턴 타입과 다른 데이터형을 반환하면 오류가 발생
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		method_08 method = new method_08();
		result = method.add(num1, num2);
		
		System.out.println("두수의 합은 " + result); // 메서드의 반환 값을 저장해서 출력 // 변수를 여러번 사용할거 아니면 만들지말고 아래방법 선호																				  
		System.out.println("두수의 합은 " + method.add(num1, num2)); // 메서드의 반환 값을 바로 출력
	}

}
