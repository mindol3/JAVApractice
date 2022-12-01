package javaPractice.ch_08;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class trycatch06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // 파일 error.log에 출력할 준비.
		FileOutputStream fos = null; // 파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4); // 실행되지 않는다.
		}
		catch (Exception ae) {
			// 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있따.
			ae.printStackTrace(ps);
			ps.println("예외메시지 : " + ae.getMessage()); // 화면대신 error.log 파일에 출력한다.
		}	//try-catch의 끝
		System.out.println(6);
	}

}
