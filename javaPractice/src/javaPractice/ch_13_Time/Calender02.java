package javaPractice.ch_13_Time;

import java.util.Calendar;

public class Calender02 {
	// get() �޼���� ���� ��������
	
	public static String getDayToStr(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return days[day = 1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		// Calendar Ŭ�������� �����͸� �������� get() �޼��带 ���.
		// get() �޼����� ��ȯŸ���� int�̸�, ������ ���� ��(MONTH) ��ȯ�� ���� ������ 1�� ���� ���� ��ȯ.
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // ���� ������ 1���� ���� ��ȯ.  
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + date + "��"); // ���� ��¥ ��ȯ
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // ������ ��ȯ �ϴµ�, ��ȯ Ÿ���� ����.
		// 1 = �Ͽ���, 2 = ������, 7 = �����
		System.out.println("������ " + getDayToStr(calendar.get(Calendar.DAY_OF_WEEK)) + "�����Դϴ�.");
		System.out.print("�̹� �⵵���� ������ �� ��°�ΰ�? : ");
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // �̹� �⵵�� ��ĥ����
		
		System.out.print("�̹� ���� ��ĥ���� �ִ°�? : ");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
	}

}
