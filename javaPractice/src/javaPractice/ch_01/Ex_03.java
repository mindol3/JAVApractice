package javaPractice.ch_01;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다음은 십의 자리 이하는 버리는 코드.
		 * 변수 value의 값이 356이라면 300이 나올수 있도록 코드 작성. 산술 연산자만 사용*/
		
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println((value / 100) * 100);
	}

}
