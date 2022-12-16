package javaPractice.ch_13_Time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTime01 {
	/* with() �޼���� TemporalAdjusters Ÿ���� ���ڷ� ������ Ư�� ��¥�� ����
	 	firstDayOfYear() : �⵵�� ù ��° ��
	 	lastDayOfYear() : �⵵�� ������ ��
	 	firstDayOfMonth() : ���� ù ��° ��
	 	lastDayOfMonth() : ���� ������ ��
	 	firstInMonth(DayOfWeek dayOfWeek) : ���� ù ��° ����
	 	lastInMonth(DayOfWeek dayOfWeek) : ���� ������ ����
	 	next(DayOfWeek dayOfWeek) : ���ƿ��� ����
	 	nextOrSame(DayOfWeek dayOfWeek) : ������ ������ ���ƿ��� ����
	 	previous(DayOfWeek dayOfWeek) : ���� ����
	 	previousOrSame(DayOfWeek dayOfWeek) : ������ ������ ���� ����
	 */
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2022-12-16T15:11:28.509124300
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear()); // �⵵�� ù ��° ��
		System.out.println("������ ù ��° �� : " + new_ldt); // ������ ù ��° �� : 2022-01-01T15:12:24.514755800
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear()); // �⵵�� ������ ��
		System.out.println("������ ������ �� : " + new_ldt); // ������ ������ �� : 2022-12-31T15:12:53.825759100
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth()); // ���� ù ��° ��
		System.out.println("�̹� ���� ù��° �� : " + new_ldt); // �̹� ���� ù��° �� : 2022-12-01T15:13:32.311331
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth()); // ���� ������ ��
		System.out.println("�̹� ���� ������ �� : " + new_ldt); // �̹� ���� ������ �� : 2022-12-31T15:13:55.829474600
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // ���� ù ��° ����
		System.out.println("�̹����� ù��° ������ : " + new_ldt); // �̹����� ù��° ������ : 2022-12-05T15:16:17.581234100
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // ���� ������ ����
		System.out.println("�̹����� ������ �Ͽ��� : " + new_ldt); // �̹����� ������ �Ͽ��� : 2022-12-25T15:16:17.581234100
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // ���ƿ��� ����
		System.out.println("���ƿ��� �ݿ��� : " + new_ldt); // ���ƿ��� �ݿ��� : 2022-12-23T15:17:13.004706200
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); // ������ ������ ���ƿ��� ����
		System.out.println("������ ������ ���� �ݿ��� : " + new_ldt); // ������ ������ ���� �ݿ��� : 2022-12-16T15:18:13.556117400
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // ���� ����
		System.out.println("���� ������ : " + new_ldt); // ���� ������ : 2022-12-12T15:18:55.175635800
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // ������ ������ ���� ����
		System.out.println("������ ������ ���� ������ : " + new_ldt); // ������ ������ ���� ������ : 2022-12-12T15:19:24.536853400
		
	}

}
