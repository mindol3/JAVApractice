package javaPractice.ch_03;

public class method_10 {
	/*������ ���� ȣ�� ���
	 * �Ű������� Ÿ���� ������ Ÿ���� �� ���.
	 * ������ ���� ȣ���� �޼��� ȣ�� �� ���� �������� ��ġ�� �Ű������� ����.
	 * 
	 * ���� ���� ȿ���� �޸𸮿� ������ ���� ���� �� ���
	 * ������ ���� ȣ���� �޸��� �ּҸ� �ѱ�� ������ ���� �������� ����*/
	public void increase(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] refArray = {100, 800, 1000};
		
		method_10 ref = new method_10();
		
		System.out.println("�޼��� ȣ�� ��");
		for(int i = 0; i < refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);
		}
	}

}
