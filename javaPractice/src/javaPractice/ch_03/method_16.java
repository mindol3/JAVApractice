package javaPractice.ch_03;

public class method_16 {
	/* ���� ���� ���ڿ� �Ϲ� ���ڸ� ȥ�� ���.
	 * ���� ������
	 * 1. ���� ���� ���ڰ� ���� �����ʿ� �־�� ��.
	 * 2. ���ÿ� 2���� ���� ���� ���� ����� �ȵ�.*/
	
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("�輺ȣ", 98, 85, 88);
		test("����ȣ", 90, 95, 92);
		test("���¼�", 80, 98, 95);
	}

}
