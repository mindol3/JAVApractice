package javaPractice.ch_10;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		// �ߺ��� ���ڿ��� ���ŵǰ� ��� ������ �Է� ������ �������.
		System.out.println(hashSet);
	}

}
