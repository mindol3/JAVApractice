package javaPractice.ch_05;

class Circle {
	protected int radius; // ������
	public Circle (int radius) {
		this.radius = radius;
	}
}

// ���� ��Ÿ���� Circle Ŭ������ ��ӹ޾Ƽ� ���ڸ� ��Ÿ���� Pizza Ŭ������ �ۼ��� ����.

class Pizza extends Circle {
	String kind;
	Pizza(String kind, int radius){
		super(radius);
		this.kind = kind;
	}
	
	void print() {
		System.out.println("������ ���� : " + kind + " , " + "������ ũ�� : " + (radius * 2));
	}
}
public class InheritanceEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); // ������ ���� : Pepperoni, ������ ũ�� : 20
	}

}
