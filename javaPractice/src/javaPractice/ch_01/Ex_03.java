package javaPractice.ch_01;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*������ ���� �ڸ� ���ϴ� ������ �ڵ�.
		 * ���� value�� ���� 356�̶�� 300�� ���ü� �ֵ��� �ڵ� �ۼ�. ��� �����ڸ� ���*/
		
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println((value / 100) * 100);
	}

}
