package javaPractice.ch_13_Time;

import java.io.FileInputStream;
import java.util.Scanner;

public class File01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ϸκ��� �Է¹޴� ���α׷�.
		// FileInputStream Ŭ������ ���� ������ ó���ϰ� �̸� Scanner Ŭ������ ���� ���.
		try {
			FileInputStream fs = new FileInputStream("./sample_file/sample.txt");
			Scanner scanner = new Scanner(fs);
			while(scanner.hasNext()) { // ���� ���� �ϸ� ����ؼ� �ݺ�
				System.out.println(scanner.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
