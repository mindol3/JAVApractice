package javaPractice.ch_13_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date와 SimpleDateFormat 클래스를 이용해서
// 오늘의 날짜를 아래와 같이 출력하는 프로그램을 작성해 보세요

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day = new Date();
		String pattern = "yyyy년 MM월 dd일 E요일 HH시 mm분";
		
		SimpleDateFormat p = new SimpleDateFormat(pattern);
		
		System.out.println(p.format(day));


	}

}
