package javaPractice.ch_14;

import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
	/*
	���� ���� ��Ʈ��
	Reader : ���� ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ��

	Reader ���� ��Ʈ��.
	FileReader : ���Ͽ��� ���� ������ ���� ��Ʈ�� Ŭ����
	InputStreamReader : ����Ʈ ������ ���� �ڷḦ ���ڷ� ��ȯ�� �ִ� ���� ��Ʈ��
	BufferedReader : ���ڷ� ���� �� �迭�� �����Ͽ� �Ѳ����� ���� �� �ִ� ����� ������ �ִ� ���� ��Ʈ��

	Reader ���� �޼���
	int read() : ���Ϸ� ���� �� ���ڸ� ����. ���� ���� ��ȯ.
	int read(char[] buf) : ���Ϸ� ���� buf �迭�� ���ڸ� ����.
	int read(char[] buf, int off, int len) : ���Ϸ� ���� buf. �迭�� off ��ġ�������� len ���� ��ŭ ���ڸ� ����.
	void close() : ��Ʈ���� ����� ���� ���ҽ��� ����.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 FileReader
		 FileReader(String name) : ���� �̸� name(��� ����)�� �Ű������� �޾� �Է� ��Ʈ���� ����.
		 FileReader(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� ����.
		 
		 ���� ��Ʈ�� FileReader�� ������ �ѱ��� ����� ����.
		 * */
		
		try(FileReader fr = new FileReader("./sample_file/reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
