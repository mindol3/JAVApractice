package javaPractice.ch_08;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class trycatch06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // 파일 error.log에 출력할 준비.
		FileOutputStream fos = null; // 파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true); // error.log파일에 출력할 준비를 한다.
			ps = new PrintStream(fos); // err의 출력을 화면이 아닌, error.log 파일로 변경한다.
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4); // 실행되지 않는다.
		}
		catch (Exception ae) {
			// 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있다.
			System.err.println("-----------------------------------");
			System.err.println("예외발생시간 : " + new Date()); // 현재시간출력
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("-----------------------------------");
		}	//try-catch의 끝
		System.out.println(6);
	}

}
