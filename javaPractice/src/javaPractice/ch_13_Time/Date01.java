package javaPractice.ch_13_Time;

import java.util.Date;

public class Date01 {

	// java.util.Date
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(); // �⺻ �����ڷ� Date �ν��Ͻ��� ����� ���
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2 = new Date(a); // long Ÿ���� �Ķ���ͷ� �޾Ƽ� �ν��Ͻ� ���� �� ���.
		System.out.println(today2);
	}

}
