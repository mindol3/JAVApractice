package javaPractice.ch_13_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date�� SimpleDateFormat Ŭ������ �̿��ؼ�
// ������ ��¥�� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��� ������

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date day = new Date();
		String pattern = "yyyy�� MM�� dd�� E���� HH�� mm��";
		
		SimpleDateFormat p = new SimpleDateFormat(pattern);
		
		System.out.println(p.format(day));


	}

}
