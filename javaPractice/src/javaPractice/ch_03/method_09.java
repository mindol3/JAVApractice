package javaPractice.ch_03;

public class method_09 {
	/*메서드 호출 방식
	 * 1. 값에 의한 호출
	 *  값에 의한 메서드 호출 방식은 메서드 호출 시에 값이 복사되어 전달.
	 *  메서드의 매개변수 타입이 기본형 데이터 일때 값에 의한 호출을 함.*/
	
	/* 메서드 increase() 호출 시에 n 이라는 매개변수가 메모리에 생성되어
	 * var1의 값인 100이 복사 되어 처리.
	 * 메서드 실행이 종료되면 매개변수 n은 메모리에서 소멸.
	 * 이 처럼 값에 의한 호출은 호출시 매개변수로 전달되는 값이 복사되어 전달.
	 * 따라서 var1의 값은 변하지 않음.*/
	public int increase(int n) {
		++n;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		method_09 val = new method_09();
		int result = val.increase(var1);
		System.out.println("var1: " + var1 + ", result: " + result);

	}

}
