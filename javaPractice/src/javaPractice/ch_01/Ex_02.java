package javaPractice.ch_01;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �ٶ� �л��� �� ���� ������ �ְ�,
		 * ���������� �� ���� ������ ���ϴ� �ڵ�.
		 * 1��ſ� �˸��� �ڵ带 �ۼ��Ͻÿ�*/
		
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);

		// ���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
