package javaPractice.ch_10;

/*
 GenericMethodTest
 ���׸� Ÿ�� �޼��� : �޼��忡 Ÿ�� �Ű������� ����Ͽ� ������ ��.
 �Ű� ������ ����ϴ� Ÿ�� �Ű������� ��ȯ�� �տ� ����
 * */

class GenMethod {
	public <K, V> boolean compare(K fKey, V fValue, K sKey, V sValue) {
		if(fKey.equals(sKey) && fValue.equals(sValue)) {
			return true;
		}
		return false;
	}
}

public class generic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenMethod genMethod = new GenMethod();
		
		// �޼����� ȣ��ÿ��� ��ü.<Ŭ��������>�޼����̸�(�Ű�������)�������� ����ϴµ�
		//<Ŭ��������>�� ���� ����. �����Ϸ��� �Ű������� �ʿ��� Ÿ���� �߷�.
		boolean check = genMethod.<Integer, String>compare(1, "ȫ�浿", 1, "ȫ�浿");
		System.out.println("check: " + check); // check: true

		
	}

}
