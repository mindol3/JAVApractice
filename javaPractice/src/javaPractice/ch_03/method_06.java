package javaPractice.ch_03;

public class method_06 {
	/* �Ű� ������ �ִ� �޼���.
	 * �Ű� ������ �޼��� ȣ��� �޸𸮿� �����ǰ�, ȣ�� �� ���� �� �Ҹ�.*/
	public void print(int a) {
		System.out.println("�����: " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 22;
		int result = 0;
		
		// ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
		method_06 method = new method_06();
		method.print(10);
		method.print(b);
		method.print(result);
	}

}
