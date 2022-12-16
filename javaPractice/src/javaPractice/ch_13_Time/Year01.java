package javaPractice.ch_13_Time;

import java.time.LocalDate;

public class Year01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1900�� ���� 2100����� ������ ��������, �� ������ �˾ƺ��� �ڵ�.
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1;
		int count = 0; // ������ Ƚ���� ����
		
		for (int i = 1900; i <= 2100; i++) {
			localDate1 = localDate.withYear(i); // ���� i�� ����.
			if(localDate1.isLeapYear()) { // isLeapYear() �޼���� �����̸� true ��ȯ.
				System.out.println(localDate1.getYear() + "�� �����Դϴ�. ");
				count ++; // ������ ��� 1�� ����
			}
		}
		System.out.println("1900����� 2100����� ������ ��" + count + "�� �ֽ��ϴ�.");
	}

}
