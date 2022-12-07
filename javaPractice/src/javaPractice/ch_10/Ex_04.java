package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap�� ���̵�(String)�� ����(Integer)�� ����Ǿ� �ֽ�
// ���� ����� ���� ��� ������ ����ϰ�, �ְ������� �ְ������� ���� ���̵� ����� ��

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int totalScore = 0; // ���� �հ� ����
		
		
		// �ۼ���ġ
//		Set<String> keySet = map.keySet(); // keySet() : ��� Ű�� Set ��ü�� ��Ƽ� ����. key Set ���
//		Iterator<String> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			if(value>maxScore) {
//				maxScore=value;
//				name = key;
//			}
//			totalScore += value;
//		}
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) {// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
			String key =entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if (maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		
		System.out.println("�� ���� �� : " + totalScore);
		System.out.println("��� ���� : " + totalScore/map.size());
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		/*
		 ��� ���� : 91
		 �ְ� ���� : 96
		 �ְ� ������ ���� ���̵� : blue
		 */
	}
}
