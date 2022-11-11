package javaPractice.ch_03;

public class method_15 {
	/*가변 길이 인자
	 * 가변 길이 ㅣㄴ자는 메서드 호출 시 자동으로 배열이 생성되고 배열에 인자값들을
	 * 지정한 후 배열로 처리하는 것.
	 * 자동으로 생성되는 배열의 타입은 선언된 타입으로 지정되며 배열의 크기는 인자의 개수와 동일.
	 * 데이터 타입 다음에 점을 세 개 찍어서 지정*/
	static void test(int... v) {
			System.out.print(v.length + " : ");
			for(int x : v) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test(1);
			test(1, 2);
			test(1, 2, 3);
		

	}

}
