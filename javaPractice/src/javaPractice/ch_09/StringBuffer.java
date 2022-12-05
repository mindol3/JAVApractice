package javaPractice.ch_09;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 StringBuffer �� StringBuilder Ŭ���� Ȱ��
		 ���α׷��� ����� ���� ���ڿ��� �����ϰų� �����ؾ� �ϴ� ��찡 ����
		 ������ String Ŭ������ �ѹ� �����Ǹ� �� ������ ���ڿ��� ������� �ʱ� ������
		 String Ŭ������ ����Ͽ� ��� ���ڿ��� �����ϰų� �����ϴ� ���α׷��� �ۼ��ϸ� �޸𸮰� ���� ����.
		 �� ������ �ذ��ϴ� ���� StringBuffer �� StringBuilder Ŭ����.
		 
		 StringBuffer �� StringBuilder Ŭ������ ���ο� ���氡����(final�� �ƴ�) char[]�������� ������ ����.
		 �� Ŭ������ ����Ͽ� ���ڿ��� �����ϸ� ������ ����ϴ� char[] �迭�� Ȯ��ǹǷ� �߰� �޸𸮸� ������� ����.
		 ���� ���ڿ��� �����ϰų� ������ ��� �� Ŭ���� �� �ϳ��� ����ϸ� ��.
		 
		 �� Ŭ������ ���̴� ���� �۾�(������)�� ���ÿ� ���ڿ��� �����Ϸ� �� �� ���ڿ��� �����ϰ� ����ǵ��� ������ �ִ°� �׷��� �������� ����.
		 StringBuffer Ŭ������ ���ڿ��� �����ϰ� ����ǵ��� ����������, StringBuilder Ŭ������ ������� ����.
		 ���� �����带 �����ϴ� ��Ƽ������ ���α׷��� �ƴ϶�� StringBuilder�� ����ϴ� ���� ���� �ӵ��� �� ����.
		 * */
		
		String javaStr = new String("java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr); // String ���� ���� StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		buffer.append(" and"); // ���ڿ� �߰�
		buffer.append(" android"); // ���ڿ� �߰�
		buffer.append(" programming is fun!!!"); // ���ڿ� �߰�
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); // String Ŭ������ ��ȯ
		System.out.println(javaStr); // java and android programming is fun!!!
		System.out.println("���� ������� javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		

		
	}

}
