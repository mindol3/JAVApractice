package javaPractice.ch_14;

import java.io.FileOutputStream;
import java.io.IOException;

public class Byte01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 write(byte[] b) �޼��� ����ϱ�
		 ��µ� �Է°� ���������� ���� �ڷḦ �Ѳ����� ����ϸ� ȿ������ �Ӵ��� ����ð��� �پ��.
		 write(byte[] b) �޼ҵ�� ����Ʈ �迭�� �ִ� �ڷḦ �Ѳ����� ���
		 * */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output2.txt")){
			byte[] bs = new byte[26];
			byte data = 65; // 'A' �� �ƽ�Ű ��
			for(int i = 0; i < bs.length; i++) { // A-Z���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs); // �迭 �Ѳ����� ����ϱ�
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
