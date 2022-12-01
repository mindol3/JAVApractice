package javaPractice.ch_08;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class trycatch06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // ���� error.log�� ����� �غ�.
		FileOutputStream fos = null; // ���� ������ ����
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true); // error.log���Ͽ� ����� �غ� �Ѵ�.
			ps = new PrintStream(fos); // err�� ����� ȭ���� �ƴ�, error.log ���Ϸ� �����Ѵ�.
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // ���ܹ߻�!!!
			System.out.println(4); // ������� �ʴ´�.
		}
		catch (Exception ae) {
			// �������� ae�� ����, ������ ArithmeticException�ν��Ͻ��� ������ �� �ִ�.
			System.err.println("-----------------------------------");
			System.err.println("���ܹ߻��ð� : " + new Date()); // ����ð����
			ae.printStackTrace(System.err);
			System.err.println("���ܸ޽��� : " + ae.getMessage());
			System.err.println("-----------------------------------");
		}	//try-catch�� ��
		System.out.println(6);
	}

}
