package javaPractice.ch_14;

import java.io.FileInputStream;
import java.io.IOException;

public class input03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* FileInputStream
		 * : ���Ͽ��� ����Ʈ ������ �ڷḦ �о� ���� �� ����ϴ� ��Ʈ�� Ŭ����.
		 * 
		  FileInputStream(String name) : ���� �̸� name(��� ����) �� �Ű� ������ �޾� �Է� ��Ʈ���� ����.
		  FileInputStream(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� ����. 
		 * */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./sample_file/input.txt"); // input.txt ���� ��Ʈ�� ����
			
			// read() �޼����� ��ȯ���� int. �� ����Ʈ�� �о int �� ����. �� �̻� �о� �帱 �ڷᰡ ���� ��� -1 ��ȯ.
			System.out.println((char)fis.read()); // A
			System.out.println((char)fis.read()); // B
			System.out.println((char)fis.read()); // C
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if (fis != null) {
					fis.close(); // ���� ��Ʈ���� finally ��Ͽ��� ����
				}
			}
			catch (IOException | NullPointerException e) {
				System.out.println(e);
			}
			// ��Ʈ���� null�� ���
		}
		System.out.println("end"); // end
	}
}
