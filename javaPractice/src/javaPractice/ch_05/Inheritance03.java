package javaPractice.ch_05;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);  // this는 객체기준
		System.out.println("super.x = " + super.x); // 부모클래스의 변수
	}
}

public class Inheritance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
