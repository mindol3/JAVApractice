package javaPractice.ch_14;

import java.io.FileWriter;
import java.io.IOException;

public class Write01 {
	/*
	Writer
	���� ������ ����ϴ� ��Ʈ�� �� �ֻ��� ��Ʈ��.

	Writer ���� Ŭ����
	FileWriter : ���Ͽ� ���� ������ ����ϴ� ��Ʈ�� Ŭ����
	OutputStreamWriter : ���Ͽ� ����Ʈ ������ ����� �ڷḦ ���ڷ� ��ȯ�� �ִ� ���� ��Ʈ��.
	BufferedWriter : ���ڷ� �� �� �迭�� �����Ͽ� �Ѳ����� �� �� �ִ� ����� ������ �ִ� ���� ��Ʈ��.

	Writer ���� �޼���
	void writer(int c) : �� ���ڸ� ���Ͽ� ���
	void writer(char[] buf) : ���� �迭 buf�� ������ ���Ͽ� ���
	void writer(char[] buf, int off, int len) : ���� �迭 buf�� off��ġ���� len ������ ���ڸ� ���Ͽ� ���.
	void writer(string str) : ���ڿ� str�� ���Ͽ� ���
	void writer(string str, int off, int len) : ���ڿ� str�� off��° ���ں��� len ���� ��ŭ ���Ͽ� ���.
	void flush() : ����� ���� ��� �ڷᰡ �ӹ����� ��� ���۸� ������ ��� �ڷḦ ��� 
	void close() : ��� ��ũ���� ����� ��� ���ҽ��� ����. ��� ���۵� �����.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        FileWriter
        �����ڸ� ����ؼ� ��Ʈ���� ����.

        FileWriter(string name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
        FileWriter(string name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
        append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false.
        
        FileWriter(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
        FileWriter(String name, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
        append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false.
        */
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")){
			fw.write('A'); // ���� �ϳ����
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf); // ���� �迭 ���
			fw.write("�ȳ��ϼ���. �� �����׿�"); // String ���
			fw.write(buf, 1, 2); // ���� �迭�� �Ϻ� ���
			fw.write("65"); // ���ڸ� �״�� ���
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
