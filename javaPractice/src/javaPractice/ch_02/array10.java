package javaPractice.ch_02;

public class array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5�� �л��� ����, ����, ���� ���� �����͸� ������
		 * 1) �� �л��� 3���� ������ ���
		 * 2) �� ������ ��� �л��� ������ ���ϱ�*/
		int[][] score = {
					{ 100, 100, 100},// ���� ���� ����
					{ 20, 20, 20},
					{ 30, 30, 30},
					{ 40, 40, 40},
					{ 50, 50, 50}	
		};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("============================================");
//		System.out.println(score.length); // 5
		for(int i = 0; i < score.length; i++) { // ��
			int sum = 0; // ����
			koreanTotal  += score[i][0];
			englishTotal += score[i][1];
			mathTotal    += score[i][2];
			System.out.print(" " + (i + 1) + "\t"); // ��ȣ
			//System.out.println(score[i].length); // 3
			for(int j = 0; j <score[i].length; j++) { //��
				sum += score[i][j]; // ����
				System.out.print(score[i][j] + "\t"); // ���� ���� ����
			}
			System.out.println(sum + "\t" + sum/(double)score[i].length); // ���� ���
		}
		System.out.println("============================================");
		System.out.println("����:\t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal);
	}

}
