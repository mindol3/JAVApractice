package javaPractice.ch_08;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class trycatch06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // ���� error.log�� ����� �غ�.
		FileOutputStream fos = null; // ���� ������ ����
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // ���ܹ߻�!!!
			System.out.println(4); // ������� �ʴ´�.
		}
		catch (Exception ae) {
			// �������� ae�� ����, ������ ArithmeticException�ν��Ͻ��� ������ �� �ֵ�.
			ae.printStackTrace(ps);
			ps.println("���ܸ޽��� : " + ae.getMessage()); // ȭ���� error.log ���Ͽ� ����Ѵ�.
		}	//try-catch�� ��
		System.out.println(6);
	}

}
