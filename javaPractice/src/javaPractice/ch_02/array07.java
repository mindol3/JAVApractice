package javaPractice.ch_02;

import java.util.Arrays;

public class array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ζ� ��ȣ ���ϱ�
		 * 1~45 ������ ������ �� ���ϱ�
		 * �ߺ��� üũ*/
		
		int range = 6;
		int[] numbers = new int[range];
		
		while (range > 0) {
			int temp = (int)(Math.random() * 45) +1; // 1~45�� ������ ���� ��´�.
			
			// �ߺ� Ȯ��
			boolean result = true; // �ߺ�Ȯ�� ���� �����ϱ� ���� ����. �ߺ��̸� false
			for(int n : numbers) {
				if(n == temp) { // �ߺ��� �Ǹ� result �� ����
					System.out.println(temp + "�� �ߺ��� ���Դϴ�.");
					result = false;
				}
			}
			
			if (result) {
				numbers[range - 1] = temp;
				range--;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
