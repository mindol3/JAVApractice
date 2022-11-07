package javaPractice.ch_01;

public class MyOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산자
		int i = 5;
		int j = 0;
		j = i++; // j = i; i = i + 1;
		System.out.println("j = i++; 실행 후, i=" + i + ", j="+ j); // i = 6, j = 5
		
		//결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		i = 5;
		j = 0;
		j = ++i; // i = i + 1; j = i;
		System.out.println("j = i++; 실행 후, i=" + i + ", j="+ j); // i = 6, j = 6
				
	}

}
