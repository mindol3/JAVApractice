package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		// <String, Integer> -> String�� Ű��, Integer�� ������ ���
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // key�� ���� ������ ���� ������ ������ ������ ��ü
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü ã��
		// �̸�(key)���� ����(value)�� �˻�
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // key�� ���� �� �˻�
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // keySet() : ��� Ű�� Set ��ü�� ��Ƽ� ����. key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// foreach���� ����� ���
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String strKey = entry.getKey();
			Integer intValue = entry.getValue();
			System.out.println( strKey + ":" + intValue);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿"); // Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size()); // �� Entry ��: 2
		
		// ��ü�� �ϳ��� ó��
		// entrySet() : Ű�� ���� ������ ������ ��� Map.Tnry ��ü�� Set�� ��Ƽ� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size()); // �� Entry ��: 0
	}
}
