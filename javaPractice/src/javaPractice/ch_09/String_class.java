package javaPractice.ch_09;

public class String_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 String Ŭ����
		 String�� �����ϴ� �ΰ��� ���.
		 1) �������� �Ű������� ���ڿ� ����.
		 String str1 = new String("abc");
		 new ���� ����ؼ� ��ü�� �����ϴ� ���� "abc" ���ڿ��� ���� �޸𸮰� �Ҵ�ǰ� ���ο� ��ü�� ����.
		 
		 2) ���ڿ� ����� ����Ű�� ���.
		 String str3 = "abc";
		 �����ڸ� �̿����� �ʰ� �ٷ� ���ڿ� ����� ����Ű�� ��쿡�� ������ ������� �ִ� ���ڿ� ����� �޸� ���� ����Ű�� ��.
		 ���α׷����� ���Ǵ� ��� ���� �����ϴ� ������ ��� Ǯ constant pool �̶����.
		 * */
		
		String str1 = new String("abc"); // �������� �Ű������� ���ڿ� ����. 
		String str2 = new String("abc"); 
		
		System.out.println(str1 == str2); // false. �ν��Ͻ��� �Ź� ���� �����ǹǷ� str1�� str2�� �ּҰ��� �ٸ�
		System.out.println(str1.equals(str2)); // true ���ڿ��� ���� ����.
		
		String str3 = "abc"; // ��� Ǯ�� ����� �ּ� ���� ����
		String str4 = "abc";
		
		System.out.println(str3 == str4); // ture. ���ڿ� abc�� ��� Ǯ�� ����Ǿ� �Ӥ������Ƿ� str3�� str4�� ����Ű�� �ּҰ��� ����
		System.out.println(str3.equals(str4)); //true. ���ڿ��� ���� ����
	}

}
