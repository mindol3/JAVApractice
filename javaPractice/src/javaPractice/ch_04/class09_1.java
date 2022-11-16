package javaPractice.ch_04;

class MyMath_B {
	/*
	 * ������ ���� �� Ŭ���� �޼���� �ν��Ͻ� �޼����� �����ε�
	 * ���� �ε��� ���
	 * �Ű������� Ÿ�԰� ������ ������ �Ǳ� ������ static�ʹ� ������*/
	int a, b;
	// �ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	int add() {
		System.out.println("static add() ����");
		return a + b;
	} // a, b�� �ν��Ͻ� ����
	
	int subtract() {
		return a - b;
	}
	
	int multiply() {
		return a * b;
	}
	
	double divide() {
		return a / b;
	}
	// �ν��Ͻ������� ������� �Ű����������� �۾��� ����. a, b�� ��������
	static int add (int a, int b) {
		System.out.println("add() ����");
		return a + b;
	}
	
	static int subtract(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static double divide(double a, double b) {
		return a / b;
	}
	
	
	
}
public class class09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ�����޼��� ȣ��
		System.out.println(MyMath_B.add(200, 100)); // 300
		System.out.println(MyMath_B.subtract(200, 100)); // 100
		System.out.println(MyMath_B.multiply(200, 100)); // 20000
		System.out.println(MyMath_B.divide(200.0, 100.0)); // 2.0
		
		
		MyMath_B mm = new MyMath_B();
		mm.a = 200;
		mm.b = 100;
		// �ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������.
		System.out.println(mm.add()); // 300
		System.out.println(mm.subtract()); // 100
		System.out.println(mm.multiply()); // 20000
		System.out.println(mm.divide()); // 2.0
		
		
	}

}
