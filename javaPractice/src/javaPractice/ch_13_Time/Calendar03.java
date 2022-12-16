package javaPractice.ch_13_Time;

import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set() ���� ��¥ �����ϱ�
		// set() �޼���� Calendar �ν��Ͻ��� ���� ������ �� ���.
		// �� ���� �Ķ���͸� �ʿ�� �ϸ� ù ��° �Ķ���ʹ� �ٲ�� �� �׸�, �ι�° �Ķ���ʹ� �ٲ� ���� ����
		// set(�ٲ�� �� �׸�, �ٲ� ��);
		// set(��, ��, ��);
		
		// D-day�� ���ϴ� �ڵ�
		Calendar today = Calendar.getInstance(); // ���� ��¥�� ��Ÿ���� �񱳷� �� �� ����ϴ� ��ü
		Calendar endOfYear = Calendar.getInstance(); // ���� ��¥�� ������ ��ü.
		Calendar christmas = Calendar.getInstance(); // ũ�������� ��¥�� ������ ��ü
		
		endOfYear.set(Calendar.MONTH, 11); // endofYear ��ü�� ���� 12���� ����.
		endOfYear.set(Calendar.DATE, 31); // endofYear ��ü�� ���� 31�Ϸ� ����.
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); // �������� ���� �ʸ� ��.
		System.out.println("�������� ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��"); // �������� ��������� �ʸ� �Ϸ� ��ȯ
		
		christmas.set(2022, 11, 25); // 2022�� 12�� 25��. ���� -1 �� �Է�.
		diff = christmas.getTimeInMillis() - today.getTimeInMillis(); // ũ������������ ���� �ʸ� ��.
		System.out.println("ũ������������ ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��"); // ũ���������� ��������� �ʸ� �Ϸ� ��ȯ
		
	}

}
