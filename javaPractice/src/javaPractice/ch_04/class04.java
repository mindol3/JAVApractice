package javaPractice.ch_04;

public class class04 {
	// �� ����� ������� �����͸� ����ϴ� ���α׷�
	// � ��쿡 Ŭ������ ����ϴ���? �� �ڵ带 ������� class ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chulsooAccountName = "ö��"; // ö���� ���¸���
		String chulsooAccountNo = "123456"; // ö���� ���¹�ȣ
		long chulsooAccountBalance = 1000; // ö���� �����ܰ�
		
		String youngheeAccountName = "����"; // ������ ���¸���
		String youngheeAccountNo = "654321"; // ������ ���¹�ȣ
		long youngheeAccountBalance = 200; // ������ �����ܰ�
		
		chulsooAccountBalance -= 200; // ö���� 200���� ����
		youngheeAccountBalance += 100; // ���� 100���� ����
		
		System.out.println("ö���� ����");
		System.out.println("  ���¸��� : " + chulsooAccountName); // ���¸��� : ö��
		System.out.println("  ���¹�ȣ : " + chulsooAccountNo); // ���¹�ȣ : 123456
		System.out.println("  �����ܰ� : " + chulsooAccountBalance); // �����ܰ� : 800
		
		System.out.println("������ ����");
		System.out.println("  ���¸��� : " + youngheeAccountName); // ���¸��� : ����
		System.out.println("  ���¹�ȣ : " + youngheeAccountNo); // ���¹�ȣ : 654321
		System.out.println("  �����ܰ� : " + youngheeAccountBalance); // �����ܰ� : 300
	}

}
