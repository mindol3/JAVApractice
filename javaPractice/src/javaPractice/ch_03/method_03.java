package javaPractice.ch_03;

import java.util.Scanner;

public class method_03 {
		/* �޼����
		 * 1) � �Է��� �޾� 2) Ư�� ������ ������ �� 3) ����� ��ȯ�ϴ� ���*/
	
		/*
		 * �޼��� ��� ����
		 * 1. �޼��� ���� : �޼��带 ���� ����� ���� �ǹ�
		 * 2. �μ� : �޼��忡 ������ �Է�(input)�� �ǹ�. argument
		 * 3. �Ű����� : �μ��� �޾Ƽ� �����ϴ� �����Ѥ� �ǹ�. parameter
		 * 4. ��ȯ�� : �޼����� ���(output)�� �ǹ�. return
		 * 5. �޼��� ȣ�� : �޼��带 ������ ����ϴ� ���� �ǹ�*/
	
		/* ���� �����ڸ� ������ �������� �ʴ´ٸ� ���� �����ڰ� ���� ����
		 * �޼ҵ�� default ���� �����ڰ� �Ǿ� �ش� ��Ű�� �������� ������ ����.*/
	static int max(int a, int b, int c) { // a, b, c�� �ִ밪�� ��ȯ
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		System.out.println("�ִ밪�� " + max(a, b, c) + "�Դϴ�.");
	}

}
