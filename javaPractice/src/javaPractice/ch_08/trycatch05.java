package javaPractice.ch_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class trycatch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\sample_file\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("���� ���� ����");
		} catch(FileNotFoundException e) {
			//�������� �̿��� ���� ó��
			System.out.println("*** FileNotFoundException ***");
			//e.printStackTrace();
		} catch(IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("*** Exception ***");
			e.printStackTrace();
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
