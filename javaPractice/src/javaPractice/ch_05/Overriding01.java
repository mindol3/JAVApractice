package javaPractice.ch_05;

class Student2 {
	void learn() {
		System.out.println("����");
	}
	
	void eat() {
		System.out.println("��Ա�");
	}
	
	void say() {
		System.out.println("���ϱ�");
	}
}

class Leader extends Student2{
	void lead() {
		
	}
	// �������̵��� �ڼ� Ŭ�������� �θ� Ŭ�����κ��� �������� �޼��带 �ٽ� �ۼ��ϴ� ��

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("�����Բ� �λ�"); // �������̵�
		//super.say(); // �θ�Ŭ������ �޼��� ����
	}
	
}

public class Overriding01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader = new Leader();
		leader.eat(); // ��� ���� �޼��� ���
		leader.say(); // ���� ���̵��� �޼��� ���
		
	}

}
