package javaPractice.ch_13_Time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTime01 {
	/* with() 메서드는 TemporalAdjusters 타입을 인자로 받으면 특정 날짜를 리턴
	 	firstDayOfYear() : 년도의 첫 번째 일
	 	lastDayOfYear() : 년도의 마지막 일
	 	firstDayOfMonth() : 달의 첫 번째 일
	 	lastDayOfMonth() : 달의 마지막 일
	 	firstInMonth(DayOfWeek dayOfWeek) : 달의 첫 번째 요일
	 	lastInMonth(DayOfWeek dayOfWeek) : 달의 마지막 요일
	 	next(DayOfWeek dayOfWeek) : 돌아오는 요일
	 	nextOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 돌아오는 요일
	 	previous(DayOfWeek dayOfWeek) : 지난 요일
	 	previousOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 지난 요일
	 */
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2022-12-16T15:11:28.509124300
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear()); // 년도의 첫 번째 일
		System.out.println("올해의 첫 번째 날 : " + new_ldt); // 올해의 첫 번째 날 : 2022-01-01T15:12:24.514755800
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear()); // 년도의 마지막 일
		System.out.println("올해의 마지막 날 : " + new_ldt); // 올해의 마지막 날 : 2022-12-31T15:12:53.825759100
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth()); // 달의 첫 번째 일
		System.out.println("이번 달의 첫번째 날 : " + new_ldt); // 이번 달의 첫번째 날 : 2022-12-01T15:13:32.311331
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth()); // 달의 마지막 일
		System.out.println("이번 달의 마지막 날 : " + new_ldt); // 이번 달의 마지막 날 : 2022-12-31T15:13:55.829474600
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 달의 첫 번째 요일
		System.out.println("이번달의 첫번째 월요일 : " + new_ldt); // 이번달의 첫번째 월요일 : 2022-12-05T15:16:17.581234100
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // 달의 마지막 요일
		System.out.println("이번달의 마지막 일요일 : " + new_ldt); // 이번달의 마지막 일요일 : 2022-12-25T15:16:17.581234100
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // 돌아오는 요일
		System.out.println("돌아오는 금요일 : " + new_ldt); // 돌아오는 금요일 : 2022-12-23T15:17:13.004706200
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); // 오늘을 포함한 돌아오는 요일
		System.out.println("오늘을 포함한 다음 금요일 : " + new_ldt); // 오늘을 포함한 다음 금요일 : 2022-12-16T15:18:13.556117400
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // 지난 요일
		System.out.println("지난 월요일 : " + new_ldt); // 지난 월요일 : 2022-12-12T15:18:55.175635800
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // 오늘을 포함한 지난 요일
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt); // 오늘을 포함한 지난 월요일 : 2022-12-12T15:19:24.536853400
		
	}

}
