package javaPractice.ch_10;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	// String ��ü�� �����ϴ� ArrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// String ��ü ����
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // ����� �� ��ü�� ���
		System.out.println("�� ��ü��: " + size); // �� ��ü��: 5
		System.out.println();
		
		String skill = list.get(2); // 2�� �ε����� ����� ��ü ���
		System.out.println("2: " + skill); // 2: Database
		System.out.println();
		
		// ����� ��ü ���
		for(int i = 0; i < list.size(); i++) { // ����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
//		0:Java
//		1:JDBC
//		2:Database
//		3:Serverlet/JSP
//		4:iBATIS
		
		System.out.println();
		for(String str : list) { // foreach�ε� ��°���
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2); // 2�� �ε��� Database ����
		list.remove(2); // 2�� �ε��� Serverlet/JSP ����
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) { // ����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
//		0:Java
//		1:JDBC
	}

}
