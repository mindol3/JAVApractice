package javaPractice.ch_01;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner.nextLine() : ���ڿ� �Է�
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.nextLine(); // ���ڿ� �Է�.
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		System.out.println(name + "�� �ȳ��ϼ���! " + age + "���̽ó׿�.");
	}

}
