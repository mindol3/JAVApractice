package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Map;

class Student1 {// �й��� Ű�� ���ٸ� ������ Ű�� �ν�
	public int sno;
	public String name;
	
	public Student1(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { // �й��� �̸��� ���ٸ� true�� ��ȯ.
		if(obj instanceof Student1) {
			Student1 student = (Student1) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() { // �й��� �̸��� ���ٸ� ������ ���� ����.
		return sno + name.hashCode();
	}
}

public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student1, Integer> map = new HashMap<Student1, Integer>();
		
		// �й��� �̸��� ������ Student�� Ű�� ����.
		map.put(new Student1(1, "ȫ�浿"), 95);
		map.put(new Student1(1, "ȫ�浿"), 95);
		map.put(new Student1(1, "������"), 85);
		
		System.out.println("�� Entry �� : " + map.size()); // ����� �� Map.Entry �� ���.
	}

}
