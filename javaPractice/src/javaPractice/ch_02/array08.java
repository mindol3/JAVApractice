package javaPractice.ch_02;

public class array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2���� �迭 ���� �� ���
		int[][] arr = new int [2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("��: " + arr.length); //2
		System.out.println("��: " + arr[0].length); //3
	}

}
