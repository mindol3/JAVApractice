package javaPractice.ch_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class trycatch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = ".\\sample_file\\test.txt"; // �̽������� ���� \�� ����Ͽ� \\�� ��Ÿ��
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path);
			System.out.println("������ ��ο� ������ �����մϴ�.");
		} catch(FileNotFoundException e) {
			System.out.println("������ ��ο� ������ �������� �ʽ��ϴ�");
		} finally {
			if(fis != null) {
				try {
					fis. close();
				} catch(IOException e) {;}
				System.out.println("������ �ݾҽ��ϴ�.");
			}
			System.out.println("�ڿ��� �����ϰ� �����մϴ�.");
		}
	}

}
