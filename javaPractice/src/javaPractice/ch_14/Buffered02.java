package javaPractice.ch_14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����ϱ�
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
			FileOutputStream fos = new FileOutputStream("./output_file/copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			millisecond = System.currentTimeMillis(); // ���� ���縦 �����ϱ� �� �ð�
			
			int i;
			while( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond; // ������ �����ϴµ� �ɸ��� �ð�.
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ���� �ϴ� �� " + millisecond + " millisecond �ҿ�Ǿ����ϴ�.");
	}

}
