package javaPractice.ch_01;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int result = 에 1) 변수 4개를 모두 사용하고 2) 사칙연산중 + 연산만 사용해서
		 * 9가 나오도록 코드를 완성*/
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		//int result = (int)var1 + (int)var2 + (int)var3 + (int)Double.parseDouble(var4) + (int)var2; // 이부분만 수정. 0대신 코드 입력.
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result); // 9
	}

}
