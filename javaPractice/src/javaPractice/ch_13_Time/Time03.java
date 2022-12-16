package javaPractice.ch_13_Time;

import java.time.LocalDateTime;

public class Time03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ð��� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
		// minusHours(long) �ð�����, minusMinutes(long) �� ����, minusSeconds(long) �� ����, minusNanos(long) ���� �� ����
		// plusHours(long) �ð� ���ϱ�, plusMinutes(long) �� ������, plusSeconds(long) �� ���ϱ�, plusNanos(long) ���� �� ���ϱ�

		LocalDateTime localDateTime = LocalDateTime.now(); // ���� �ð�
		System.out.println("���� �ð� : " + localDateTime); // ���� �ð� : 2022-12-16T14:10:06.819958200
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		// 5�ð��� ����, 30���� ���ϰ�, 4�ʸ� ��.
		System.out.println("���� �ð� : " + localDateTime1); // ���� �ð� : 2022-12-16T09:41:14.458333500
		
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		// ld2 ������ 24�ð��� ��.
		System.out.println("�ڵ� ���� �ð� : " + localDateTime2); // �ڵ� ���� �ð� : 2022-12-15T09:41:56.060107300
	}

}
