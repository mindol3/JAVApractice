package javaPractice.ch_05;

class Myparent {
	void pDisplay() {
		System.out.println("Super: Parent's Display ");
	}
}

class MyChild extends Myparent {
	
	// ���� Ŭ������ �޼��带 �������Ѵ�
	@Override
	public void pDisplay() {
		// ���е� ���� Ŭ������ �޼��带 super�� ȣ���Ѵ�
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
		c.pDisplay(); // �����ǵ� ���� Ŭ������ �޼��带 ȣ���Ѵ�
		/*Super: Parent's Display
		Sub Class: Parent's Display*/
	}

}
