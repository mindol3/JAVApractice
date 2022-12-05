package javaPractice.ch_10;

// ���׸��� C++�� ���ø��� ������ ����.
// C++���� �޸� ���׸� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������, ��쿡 ���� �� ��ȯ ����� �Ǽ� ���׸��� ��ȣ.

class ObjectData {
	private Object data; // Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����.
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

public class generic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectData stringCommonData = new ObjectData();
		ObjectData integerCommonData = new ObjectData();
		stringCommonData.setData("abc"); // Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����.
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData()); // stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData()); // integerCommonData : 100
	}

}
