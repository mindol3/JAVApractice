package javaPractice.ch_10;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1; // Integer Ŭ������ compareTo() �޼��带 �ݴ��.
	}
}

public class TreeSet03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> score = new TreeSet<Integer>(new MyCompareInt());
		
		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);
		score.add(90);
		
		System.out.println(score); // [50, 65, 75, 85, 90, 100]
		
		Integer value = null;
		value =score.first(); // first() : ���� ���� �� ��ȯ
		print("���� ���� ����", value);
		value = score.last(); // last() : ���� ū ��
		print("���� ���� ����", value);
		value = score.lower(85); // lower() : ������ ������ ���� �� �� ���� ū ��(���ڰ� ������)
		print("85 �ٷ� ���� ����", value);
		value = score.higher(85); // higher() : ������ ������ ū ���� ���� ���� ��(���ڰ� ������)
		print("85 �ٷ� ���� ����", value);
		value = score.floor(85); // floor() : ������ ���� ���ų� ���� �� �� ���� ū ��(���ڰ� ������)
		print("85 �Ǵ� �ٷ� ���� ����", value);
		value = score.ceiling(85); // ceiling() : ������ ������ ũ�ų� ���� �� �� ���� ���� ��(���ڰ� ������)
		print("85 �Ǵ� �ٷ� ���� ����", value);
		
		while (!score.isEmpty()) {
			value = score.pollLast(); // pollLast() : ���� ū ���� ��ȯ �� ����
			print("���� ���� ���� ����", value);
		}
	}

	private static void print(String string, Integer value) {
		// TODO Auto-generated method stub
		System.out.println(string + " : " + value);
	}


}
