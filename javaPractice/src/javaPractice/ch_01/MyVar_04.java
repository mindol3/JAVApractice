package javaPractice.ch_01;

public class MyVar_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*기본 타입과 문자열 간의 변환
		 * 기본 타입의 값을 문자열로 변경하는 경우에는 String.valueOf() 메소드를 이용
		 * Stirng str = String.valueOf(기본타입값);*/
		
		// 기본 타입을 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
				
	}

}
