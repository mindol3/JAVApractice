package javaPractice.ch_01;

public class MyVar_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���ڿ� ǥ��*/
		char single = '\''; // single = ''';�� ���� �� �� ����.
		String dblQuote = "\"Hello\""; // �����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		// char�� �� �ϳ��� ���ڸ� ����, ���� ���ڸ� ���� �ҷ��� String ���
		// char�� '�θ� ����
		// String �� Ŭ����, " �θ� ����� ��
		char single2 = '"';
		String single3 = "'";
		String dblQuote2 = "'Hello'";
		//String dblQuote3 = 'Hello'; // ����
		
		System.out.println(single2);
		System.out.println(single3);
		System.out.println(dblQuote2);
	}

}
