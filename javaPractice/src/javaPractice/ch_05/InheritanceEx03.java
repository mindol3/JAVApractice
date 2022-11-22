package javaPractice.ch_05;

class Circle {
	protected int radius; // 반지름
	public Circle (int radius) {
		this.radius = radius;
	}
}

// 원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스를 작성해 보자.

class Pizza extends Circle {
	String kind;
	Pizza(String kind, int radius){
		super(radius);
		this.kind = kind;
	}
	
	void print() {
		System.out.println("피자의 종류 : " + kind + " , " + "피자의 크기 : " + (radius * 2));
	}
}
public class InheritanceEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); // 피자의 종류 : Pepperoni, 피자의 크기 : 20
	}

}
