package javaPractice.ch_13_Time;

import java.util.Calendar;

/*
	Calendar Ŭ������ �޷��� ǥ���� Ŭ�����Դϴ�.
	Calendar Ŭ������ ����ؼ� ���� �ð��� �������� �����ϼ���
	
	������:
	2022�� 12�� 16��
	�ݿ��� ����
	11�� 10�� 58��
 * */

public class Ex01 {
	
	public static String Week(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return days[day = 5];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // ��
		int month = now.get(Calendar.MONTH) + 1; // ��
		int day = now.get(Calendar.DATE); // ��
		String strWeek = Week(now.get(Calendar.DAY_OF_WEEK)); // ����
		String strAmPm = null; // ���� / ����
		int hour = now.get(Calendar.HOUR); // ��
		int minute = now.get(Calendar.MINUTE); // ��
		int second = now.get(Calendar.SECOND); // ��
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
	}

}
