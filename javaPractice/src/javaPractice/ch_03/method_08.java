package javaPractice.ch_03;

public class method_08 {
	/* ���� Ÿ���� �ִ� �޼���*/
	public int add(int a, int b) {
		int c = a + b;
		return c;
		// return ������ ��ġ�ϴ� �����ʹ� �ݵ�� �޼����� ���� Ÿ�԰� ��ġ�ؾ� ��.
		// return 3.5; // ���� Ÿ�԰� �ٸ� ���������� ��ȯ�ϸ� ������ �߻�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		method_08 method = new method_08();
		result = method.add(num1, num2);
		
		System.out.println("�μ��� ���� " + result); // �޼����� ��ȯ ���� �����ؼ� ��� // ������ ������ ����Ұ� �ƴϸ� ���������� �Ʒ���� ��ȣ																				  
		System.out.println("�μ��� ���� " + method.add(num1, num2)); // �޼����� ��ȯ ���� �ٷ� ���
	}

}
