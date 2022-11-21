package javaPractice.ch_05;
/*
 final 변수 :
 final 메서드 : 내용을 더 이상 변경할 수 없는 메서드. 오버라이딩 불가
 final 클래스 : 내용을 더 이상 변경할 수 없는 클래스. 상속 불가
 */

final class FinalClass {
	final int number = 4; // 상수
}

class Parents // extends FinalClass //에러발생 상속이 불가한 클래스
{
	final void finalMethod() { // 오버라이딩 불가한 메서드
		System.out.println("상속 불가한 메소드");
	}
}

class Son extends Parents {
	// void finalMethod() {} // 에러발생 오버라이딩 불가한 메서드
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalClass member1 = new FinalClass();
		 System.out.println(member1.number);
		 Parents p = new Parents();
		 p.finalMethod();
		 // member1.number = 5; // 상수는 변경이 불가능
	}

}
