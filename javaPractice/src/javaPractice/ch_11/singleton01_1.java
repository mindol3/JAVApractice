package javaPractice.ch_11;

public class singleton01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. �ܺο��� ����ϴ� �ڵ� �����.
		// �ܺ� Ŭ�������� Company�� ������ �� �����Ƿ� static���� �����Ǵ� getInstance() �޼��带 ȣ��.
		Company company1 = Company.getInstance(); // Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����.
		Company company2 = Company.getInstance();
		// Company company = new Company();
		
		System.out.println(company1 == company2); // �� ������ ���� �ּ����� Ȯ��
		System.out.println(company1); // javaPractice.ch_11.Company@1c4af82c
		System.out.println(company2); // javaPractice.ch_11.Company@1c4af82c
	}

}
