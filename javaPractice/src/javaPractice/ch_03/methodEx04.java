package javaPractice.ch_03;

public class methodEx04 {
	
	/*
	(1) abs() �޼ҵ� �ϼ�
	 */
	public static int abs(int value) {
		return (value > 0) ? value : value * -1;
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value + "�� ���밪:" + abs(value)); // 5
		value = -10;
		System.out.println(value + "�� ���밪:" + abs(value)); // 10
	}

}
