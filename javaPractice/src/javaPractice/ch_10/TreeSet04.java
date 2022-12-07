package javaPractice.ch_10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1 ; // String Ŭ������ compareTo() �޼��带 �ݴ��.
	}
	
}

public class TreeSet04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<String> set = new TreeSet<String>();
		// TreeSet �����ڿ� Comparator�� ������ ��ü�� �Ű������� ������.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set); // [ccc, bbb, aaa]	
	}

}
