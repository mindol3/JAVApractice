package javaPractice.ch_14;

import java.io.FileInputStream;
import java.io.IOException;

public class input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int read(byte[] b) �޼���� �б�
		 �ڷḦ read() �޼���� �� ����Ʈ�� �д� �� ���� �迭�� ����ؼ� �Ѳ����� ���� ������ ó�� �ӵ��� �ξ� ����.
		 read(byte[] b) �޼���� ������ ����Ʈ �迭�� ũ�⸸ŭ �Ѳ����� �ڷḦ �а� �о� ���� �ڷ��� ���� ��ȯ.
		 */
		
		try (FileInputStream fis = new FileInputStream("./sample_file/input.txt")){
			
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.println((char)b);
//				}
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
