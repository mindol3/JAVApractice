package javaPractice.ch_13_Time;

import java.time.LocalDate;

public class Time04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Ŭ�������� ���� �� �����ϱ�
		  �� Ŭ�������� �ʵ� ���餷�� Ư�� ������ ������ �� �ִ� �޼��尡 ����
		  withYear(int) �� ����, withMonth(int) �� ����, withDayOfYear(int) ���� �� ����, withDayOfMonth(int) ���� �� ���� 
		 **/
		
		// ��¥�� �����ϴ� �ڵ�
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2022-12-16

		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// ���� 1999�� ���� 8���� ���� ���� 33�Ϸ� ����
		System.out.println(new_ld); // 1999-02-02
		
		
	}

}
