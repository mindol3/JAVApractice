package javaPractice.ch_02;

public class array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(number[i] + " "); // 0 1 2 3 4 5 6 7 8 9
		}
		
		System.out.println();
		
		for(int i = 0; i < 10000; i++) {
			// Math.random() : 0.0�̻�, 1.0 �̸��� double ���� ������ ������ ������ ��ȯ
			int n = (int)(Math.random() * 10); // 0~9���� �� ���� ���Ƿ� ��´�.
			//System.out.println(Math.random());
			//System.out.println((int)(Math.random() * 11));
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		//System.out.println(temp);
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");		//�迭�� ������ ����Ѵ�.
		}
	}

}
