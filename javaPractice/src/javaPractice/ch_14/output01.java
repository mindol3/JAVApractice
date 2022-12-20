package javaPractice.ch_14;

import java.io.FileOutputStream;
import java.io.IOException;

public class output01 {
	/*
	 FileOutputStream : ���Ͽ� ����Ʈ ���� �ڷḦ ����ϱ� ���� ����ϴ� ��Ʈ��.
	 
	 FileOutputStream(String name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
	 FileOutputStream(String name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
	 append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
	 
	 FileOutputStream(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
	 FileOutputStream(File f, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
	 append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false
	 
	 ������ �Ű������� ������ ������ ��ο� ������ FileOutputStream�� ������ ���� ����.
	 ���� ������ �ִ� ��� append ���� false�̸� ó�� ���� ���� ��. overwrite.
	 true�̸� ���� ���� �� �ڿ� �����ؼ� ��. append
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("./output_file/output.txt")){
			// ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ.
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
