package javaPractice.ch_01;

public class MyOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������
		int i = 5;
		int j = 0;
		j = i++; // j = i; i = i + 1;
		System.out.println("j = i++; ���� ��, i=" + i + ", j="+ j); // i = 6, j = 5
		
		//����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		i = 5;
		j = 0;
		j = ++i; // i = i + 1; j = i;
		System.out.println("j = i++; ���� ��, i=" + i + ", j="+ j); // i = 6, j = 6
				
	}

}
