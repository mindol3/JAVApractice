package javaPractice.ch_03;

public class method_07 {
	/*�Ű� ������ 2�� ����ϴ� �޼���*/
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("����� : " + c);
	}
	
	//�Ű� ������ ���ڿ��� �޴� �޼��� ����.
	public void print1(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
		method_07 method = new method_07();
		
		// �޼��� ȣ��
		method.print(10, 20);
		// method.print(10, 30.0f); �Ǽ��� �ȴ�
		method.print(num1, num2);
		
		method.print1("�ȳ��ϼ���.");
	}

}
