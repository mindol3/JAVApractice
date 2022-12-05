package javaPractice.ch_10;

/*
 01. GenericTypeTest
 ���׸�: �Ϲ�ȯ, ����ȭ��� �ǹ̷�
 Ŭ������ �޼��忡�� ����ϴ� �ʵ峪 �Ű������� �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �����ϵ��� �ϴ� ���.
 * */

class CommonData<T> { // �Ϲ����� ������δ� Ŭ�������� �̸� ������ Ÿ���� �����ؾ� ������ ���׸��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ��������.
	private T data; // ������ Ÿ������ T�� ����. Type�� ����. Ŭ���� ���𿡼�<>���̿� �ٸ� ���ڸ� �־ ��. 
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class generic03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonData<String> stringCommonData = new CommonData<String>(); // ȣ���ϴ� �ʿ��� Ÿ���� ����
		CommonData<Integer> integerCommonData = new CommonData<>(); // �����ϸ鼭 Ÿ���� �����ϸ� �����ڿ����� Ÿ���� ���� ����
		stringCommonData.setData("abc");
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData()); // stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData()); // integerCommonData : 100
	}

}
