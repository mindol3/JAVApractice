package javaPractice.ch_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet�� Student ��ü�� �����ҷ��� �Ѵ�.
// �й��� ������ ������ Student��� �����ϰ� �ߺ� ������ ���� �ʰ� �϶�.
// Student Ŭ������ ������

class Student {
	 int studentNum; 
	 String name; 
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentNum == student.studentNum)
				return true;
			else
				return false;
		}
		return false;
	}
	
}

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�")); // �й��� ���Ƽ� ������� ����
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}
		/*
		 1-ȫ�浿
		 2-�ſ��
		 * */
	}

}
