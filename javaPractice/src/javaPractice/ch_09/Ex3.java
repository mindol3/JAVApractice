package javaPractice.ch_09;

import java.util.HashMap;
import java.util.Objects;

/*
 Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������ؼ�
 Student�� �й� studentNum �� ������ ���� ��ü�� ���� �� �ֵ��� �غ�����.
 Student Ŭ������ �ʵ�� ������ �����ϴ�.
 hashCode()�� ���� ���� studentNum �ʵ� ���� �ؽ��ڵ带 ���� �ϵ��� �ϼ���.
 
 ������ :
 1�� �л��� ���� : 95
 * */

class Student1 {
	private String studentNum;
	
	public Student1(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	// ���⿡ �ڵ带 �ۼ��ϼ���.
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student1 other = (Student1) obj;
//		return Objects.equals(studentNum, other.studentNum);
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNum);
//	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1) {
			Student1 std = (Student1)obj;
			if(studentNum.equals(std.getStudentNum())) {
				return true;				
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����.
		HashMap<Student1, String> hashMap = new HashMap<Student1, String>();
		
		// new Student("1")�� ���� 95�� ����.
		hashMap.put(new Student1("1"), "95");
		
		String score = hashMap.get(new Student1("1"));
		System.out.println("1�� �л��� ���� : " + score);
	}

}
