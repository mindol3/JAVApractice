package javaPractice.ch_03;

public class method_11 {
	/*���ڿ��� ���� ȣ����
	 * ���������� ���ڿ��� �����Ϸ��� ������ ����Ÿ�� ���� ���� ȣ���� ��.*/
	
	public void setAddress(String addr) {
		addr = "��⵵ ������ ��ȱ�";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "����� ������ ������";
		
		method_11 st = new method_11();
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("adress: " + address); // adress: ����� ������ ������
		
		st.setAddress(address);
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("adress: " + address); // adress: ����� ������ ������
	}

}
