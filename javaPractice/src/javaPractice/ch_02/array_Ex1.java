package javaPractice.ch_02;

public class array_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ø for���� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���ϼ���
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		// �ۼ���ġ
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float)total / (arr.length * arr[0].length);
		
		System.out.println("total = " + total); // 325
		System.out.println("average = " + average); // 16.25
	}

}
