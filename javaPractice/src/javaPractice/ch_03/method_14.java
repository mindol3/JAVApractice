package javaPractice.ch_03;

public class method_14 {
	/*�޼��� �����ε�
	 * C, ���̽� ����. �Ű������� Ÿ�� Ȥ�� ������ �ٸ��� ���� �̸��� ���� �޼��带 ������ �� �� ����.
	 * 
	 * C++, ���̽㿡 �ִ� �⺻�� ����� �ڹٿ� ����.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreet(); // �ȳ��ϼ���
		printGreet("�ȳ�~!"); // �ȳ�~!
		printGreet("�Ѽ�", "�� �����̳���?"); // �Ѽ���! �� �����̳���?
		printGreet(3); // �ȳ��ϼ���. 3��° ���°ų׿�.

	}
	
	public static void printGreet() {
		System.out.println("printGreet() �ż��尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���");
	}
	
	public static void printGreet(String greeting) {
		//���� �̸��� �޼��尡 ������ �Ű������� ����
		System.out.println("printGreet(String greeting) �ż��尡 ����˴ϴ�.");
		System.out.println(greeting);
	}
	
	public static void printGreet(String name, String greeting) {
		// �Ű������� ���ڿ��� �޼��尡 ������ ������ �ٸ�
		System.out.println("printGreet(String name, String greeting) �ż��尡 ����˴ϴ�.");
		System.out.println(name + "��!" + greeting);
	}
	
	public static void printGreet(int cnt) {
		// �Ű������� �ϳ��� �ż��尡 ������ ������ Ÿ���� �ٸ�
		System.out.println("printGreet(int cnt) �ż��尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���." + cnt + "��° ���°ų׿�.");
	}

}
