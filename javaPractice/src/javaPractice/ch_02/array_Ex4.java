package javaPractice.ch_02;

public class array_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �Ʒ��� �迭�� �̿��Ͽ� �������� ������ �ϼ���.
		 * �� ���� �ο��� 3���Դϴ�.
		 * 
		 * 1�� : ��� ������ ������
		 * 2�� : ������ ������ Ȳ����
		 * 3�� : ������ ���ȯ �̼�ȣ
		 * 4�� : ���¹� ������ �ڱ���
		 * 5�� : ������ �ſ�ȭ ������
		 * 6�� : ������ �̽��� ������
		 * 7�� : �ڼ��� �̱��� ����
		 * 8�� : �ֹμ� ���ϴ� �ڼ���
		 * 9�� : �̿��� ������ ������
		 * */
		
		String[] student = {"���ȯ", "������", "������", "������", "������",
				"�ڱ���", "�ڼ���", "�ڼ���", "������", "������",
				"���", "���ϴ�", "�ſ�ȭ", "������", "������",
				"������", "������", "���¹�", "�̱���", "�̼�ȣ",
				"�̽���", "�̿���", "����", "������", "�ֹμ�",
				"������", "Ȳ����"};
		int numberPerTeam = 3;
		int count = 0;
		for(int i=0; i < 10000; i++) {
			int n =(int)(Math.random()* student.length); // 0 ~ student.length - 1���� �� ���� ���Ƿ� ��´�
			String temp = student[0];
			student[0] = student[n];
			student[n] = temp;
		}
		for (int i = 0; i < student.length; i++) {
			if ((i + 1) % numberPerTeam == 1) {
				System.out.print( ++ count + "�� :");
			}
			System.out.print(student[i] + " ");
			if ((i + 1) % numberPerTeam == 0) {
				System.out.println();
			}
		}
		
	}

}
