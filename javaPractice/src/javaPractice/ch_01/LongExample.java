package javaPractice.ch_01;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long형을 사용할 경우, int의 범위를 벗어난 경우에는 접미사 L을 사용
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 100000000000; // 컴파일에러
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}

}
