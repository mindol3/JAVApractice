package javaPractice.ch_01;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���ڿ��� �⺻ Ÿ������ ���� Ÿ�� ��ȯ
		 * String�� int�� charó�� �⺻ �ڷ� Ÿ���� �ƴ϶�
		 * Ŭ������ ��ü ���¶� �Ϲ����� ����ȯ�� �ٸ�.*/
		
		String str = "1a";
		// int value = Integer.parseInt(str); // ���ڿ��� ���ڿ��� ���ڰ� ������ ��ȯ�� ���� ����
		
		// String -> byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); // 10
		
		// String -> short
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); // 200
		
		// String -> int
		String str3 = "300000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); // 300000
		
		// String -> long
		String str4 = "400000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4); // 400000000
		
		// String -> float
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); // 12.345
		
		// String -> double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); // 12.345
		
		// String -> boolean
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println(value7); // true
		
	}

}
