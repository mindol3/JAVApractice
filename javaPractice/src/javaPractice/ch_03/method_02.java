package javaPractice.ch_03;

import java.util.Scanner;

public class method_02 {
	/*�޼��� ����� ����
	 * 1. �ڵ� �ݺ��� ���� �� ����.
	 * ��κ��� ���α׷��� � �ڵ带 �ݺ��ؼ� ���.
	 * �ݺ��Ǵ� �ڵ带 ��ġ�ϸ� ���������ϴ� ����� �ݺ��Ǵ� �ڵ�� ������ ������ �ǰ�,
	 * �ڵ尡 �ݺ��Ǹ� ����ϰ� ������ ������ ��.
	 * �� �ڵ带 �����ϰų� ���������� �� ���� ���� �κ��� �����ؾ� �ϴ¹����� �߻�
	 * Don't repeat yourself (DRY, �ݺ���������) ��Ģ�� ��Ű�� ��ǥ���� ����� �ٷ� '�޼��带 Ȱ���ϴ°�'
	 * 
	 * 2. �� ���� �߻�ȭ�� �� �� �ִ�.
	 * ���α׷� ���ο� �ִ� �ڵ带 �ϳ��ϳ� �Ű� ���ٸ� ���α׷��� ����� ���� �� ����.
	 * �Լ��� Ȱ���ϸ� ���� �ڵ带 �ϳ��ϳ� �Ű� ���� �ʾƵ�, '�޼��� �̸�' ������ ���ϴ� ó���� �� �� ����
	 * 
	 * 3.�޼��带 ����� 1)�ҽ��� �پ�� main �޼����� �⺻ ������ �б� ���� 2)���� ����*/
	static int max(int a, int b, int c) { // a, b, c�� �ִ밪�� ��ȯ
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޼���� �� �ʿ��Ѱ�?
		
				// 3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��
				Scanner stdIn = new Scanner(System.in);
				
				int[] height = new int[3]; // ����
				int[] weight = new int[3]; // ü��
				int[] age = new int[3];    // ����
				
				for ( int i = 0; i < 3; i++) {		//�Է�
					System.out.print("[" + (i + 1) + "] ");
					System.out.print("����:"); 			height[i] = stdIn.nextInt( );
					System.out.print("	ü��:"); 		weight[i] = stdIn.nextInt( );
					System.out.print("	����:"); 		age[i]	  = stdIn.nextInt( );
				}
				
				
				int maxHeight = max(height[0], height[1], height[2]); // ������ �ִ밪
				int maxWeight = max(weight[0], weight[1], weight[2]); // ü���� �ִ밪
				int maxAge = max(age[0], age[1], age[2]); // ������ �ִ밪
				
				
				
				System.out.println("������ �ִ밪�� " + maxHeight + "�Դϴ�.");
				System.out.println("ü���� �ִ밪�� " + maxWeight + "�Դϴ�.");
				System.out.println("������ �ִ밪�� " + maxAge    + "�Դϴ�.");
			}
	}


