package javaPractice.ch_02;

import java.util.Random;
import java.util.Scanner;

public class array_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1) ����, ����, ���� ���� ������ 1, 2, 3���� �����Ѵ�.
		 * 2) ��ǻ�Ͱ� ������ ���������� �����͸� �����.
		 * �ټ����� ������ ������ �� �ִ� �迭�� ����� 1, 2, 3 �����͸� ���� �ʱ�ȭ �Ѵ�.
		 * 3) ������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �Ѵ�.
		 * 4) ���� Ƚ�� / �� Ƚ���� �Բ� �Է� �޽����� ����Ѵ�.
		 * 5) Ű����� 1, 2, 3 �� �ϳ��� �Է��ϰ�, ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰���� �˷��ش�.
		 * 6) ��� ��쿡�� Ƚ���� �������� �ʴ´�.
		 * 7) ������ �����ϸ� ���� �̰���� ǥ���Ѵ�.*/
		
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		String[] gameImtems = {"����", "����", "��"}; // ����� ���� ���ڿ�
		int[] results = new int[2]; // ���� ����� ����. ������ �Ǽ��� �ƴ϶� ���� �̰���� ����. 0: ����� �̱�.
		String[] resultStrs = {"����ڰ� �̱�", "���� �̱�"}; // ����� ���� ���ڿ�
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(3) + 1; // 1 ~ 3���� �����ϰ� ���� ��ȯ
		}
		/* System.out.println(Arrays.toString(numbers)); [3, 3, 2, 2, 3]
		 * 3) ������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �Ѵ�.
		 * 4) ���� Ƚ�� / �� Ƚ���� �Բ� �Է� �޽����� ����Ѵ�.*/
		for (int i = 0, answer; i < numbers.length; i++) {
			System.out.print((i + 1) + " / " + numbers.length + " �Դϴ�. ����(1), ����(2), ��(3)�� �ϳ��� �Է��Ͻÿ�.");
			answer = scanner.nextInt();
			System.out.print(gameImtems[answer -1] + "�Է��ϼ̰�, ���� " + gameImtems[numbers[i] - 1] + "�Դϴ�."); 
			if( answer == numbers[i]) {//�����
				System.out.println("�����ϴ�.");
				i--; // i ���� �ٲ��� �ʰ�
			}
			else if ((answer + 1) % 3 == numbers[i] % 3) {//����ڰ� ���� ���
				results[1]++;
				System.out.println("���� �̰���ϴ�.");
			}
			else {
				results[0]++;
				System.out.println("����ڰ� �̰���ϴ�.");
			}
		}
		
		int max = results[0];
		int maxIndex = 0;
		for (int i = 0; i < results.length; i++) {
			if(max < results[i]) {
				max = results[i];
				maxIndex = i;
			}
		}
		System.out.println("���� �����" + resultStrs[maxIndex]);
		}
	}


