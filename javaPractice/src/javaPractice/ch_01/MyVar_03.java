package javaPractice.ch_01;

public class MyVar_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* + ���꿡���� ���ڿ� �ڵ���ȯ
		 * + �����ڴ� �ΰ��� ���
		 * 1) �ǿ����ڰ� ������ ��쿡�� ���� ����
		 * 2) �ǿ����� �� �ϳ��� ���ڿ��̸�
		 * ������ �ǿ����ڵ� ���ڿ��� �ڵ� ��ȯ�Ǿ ���ڿ� ���� ������ ����
		 * ���ڿ��� ���� ������ �ϰ� �Ǹ� ������ ���ڿ��� �� ��ȯ ��*/
		String a = 7 + " ";
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		String e = "" + "";
		String f = 7 + 7 + "";
		String g = "" + 7 + 7 ;
		
		System.out.println(a); // 7
		System.out.println(b); //  7 ��������
		System.out.println(c); // 7
		System.out.println(d); // 7
		System.out.println(e); // 
		System.out.println(f); // 14
		System.out.println(g); // 77
	}

}
