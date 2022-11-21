package javaPractice.ch_05;

class Myparent {
	void pDisplay() {
		System.out.println("Super: Parent's Display ");
	}
}

class MyChild extends Myparent {
	
	// 상위 클래스의 메서드를 재정의한다
	@Override
	public void pDisplay() {
		// 은닉된 상위 클래스의 메서드를 super로 호출한다
		super.pDisplay();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
}

public class Inheritance05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild c = new MyChild();
		c.pDisplay(); // 재정의된 하위 클래스의 메서드를 호출한다
		/*Super: Parent's Display
		Sub Class: Parent's Display*/
	}

}
