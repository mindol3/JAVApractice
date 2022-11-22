package javaPractice.ch_05;

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent3 Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class Inheritance10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent3 parent = new Child3();
		Child3 child = new Child3();
		
		// ���� ���� �켱
		System.out.println("p.x = " + parent.x);
		// �������̵� �켱
		parent.method();
		
		// ���� ���� �켱
		System.out.println("c.x = " + child.x);
		// �������̵� �켱
		child.method();
	}

}
