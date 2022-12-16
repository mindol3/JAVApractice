package javaPractice.ch_13_Time;

import java.time.LocalDateTime;

public class Time03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간을 더하고 빼는 메서드를 확인하는 코드
		// minusHours(long) 시간빼기, minusMinutes(long) 분 빼기, minusSeconds(long) 초 빼기, minusNanos(long) 나노 초 빼기
		// plusHours(long) 시간 더하기, plusMinutes(long) 분 다히기, plusSeconds(long) 초 더하기, plusNanos(long) 나노 초 더하기

		LocalDateTime localDateTime = LocalDateTime.now(); // 현재 시간
		System.out.println("현재 시간 : " + localDateTime); // 현재 시간 : 2022-12-16T14:10:06.819958200
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		// 5시간을 빼고, 30분을 더하고, 4초를 뺌.
		System.out.println("변경 시간 : " + localDateTime1); // 변경 시간 : 2022-12-16T09:41:14.458333500
		
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		// ld2 값에서 24시간을 뺌.
		System.out.println("자동 변경 시간 : " + localDateTime2); // 자동 변경 시간 : 2022-12-15T09:41:56.060107300
	}

}
