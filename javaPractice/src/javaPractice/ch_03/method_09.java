package javaPractice.ch_03;

public class method_09 {
	/*�޼��� ȣ�� ���
	 * 1. ���� ���� ȣ��
	 *  ���� ���� �޼��� ȣ�� ����� �޼��� ȣ�� �ÿ� ���� ����Ǿ� ����.
	 *  �޼����� �Ű����� Ÿ���� �⺻�� ������ �϶� ���� ���� ȣ���� ��.*/
	
	/* �޼��� increase() ȣ�� �ÿ� n �̶�� �Ű������� �޸𸮿� �����Ǿ�
	 * var1�� ���� 100�� ���� �Ǿ� ó��.
	 * �޼��� ������ ����Ǹ� �Ű����� n�� �޸𸮿��� �Ҹ�.
	 * �� ó�� ���� ���� ȣ���� ȣ��� �Ű������� ���޵Ǵ� ���� ����Ǿ� ����.
	 * ���� var1�� ���� ������ ����.*/
	public int increase(int n) {
		++n;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		method_09 val = new method_09();
		int result = val.increase(var1);
		System.out.println("var1: " + var1 + ", result: " + result);

	}

}
