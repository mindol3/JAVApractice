package javaPractice.ch_14;

import java.io.IOException;

public class input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ǥ�� �����
		 : ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		 static PrintStream out : ǥ�� ��� ��Ʈ��
		 static InputStream in : ǥ�� �Է� ��Ʈ��
		 static OutputStream err : ǥ�� ���� ��� ��Ʈ��
		 * */
		
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			// System.in : ǥ�� �Է� ��Ʈ��
			i = System.in.read(); // read() �޼���� �� ����Ʈ ����
			// System.out : ǥ�� ��� ��Ʈ��.
			System.out.println(i); // int�� 4����Ʈ ������ 1����Ʈ�� �о ���. �ƽ�Ű �ڵ带 ���
			System.out.println((char)i); // ���ڷ� ��ȯ�Ͽ� ���
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
