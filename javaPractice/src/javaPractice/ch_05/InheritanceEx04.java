package javaPractice.ch_05;

class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("���� �� ����");
	}
	
	void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
	
//	void walk() {
//		System.out.println("���� �� �ֽ��ϴ�");
//	}
}

public class InheritanceEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk(); // ���� �� ����
		bird.fly(); // ���� �� ����
		bird.sing(); // �뷡 �θ� �� ����
	}

}
