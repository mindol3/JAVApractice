package javaPractice.ch_13_Time;

import java.util.Calendar;

/*
	Calendar 클래스는 달력을 표현한 클래스입니다.
	Calendar 클래스를 사용해서 현재 시간이 나오도록 구현하세요
	
	실행결과:
	2022년 12월 16일
	금요일 오전
	11시 10분 58초
 * */

public class Ex01 {
	
	public static String Week(int day) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		return days[day = 5];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH) + 1; // 월
		int day = now.get(Calendar.DATE); // 일
		String strWeek = Week(now.get(Calendar.DAY_OF_WEEK)); // 요일
		String strAmPm = null; // 오전 / 오후
		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}

}
