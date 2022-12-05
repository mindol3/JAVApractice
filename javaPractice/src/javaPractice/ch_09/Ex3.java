package javaPractice.ch_09;

import java.util.HashMap;
import java.util.Objects;

/*
 Student 클래스를 작성하되, Object의 equals()와 hashCode()를 재정의해서
 Student의 학번 studentNum 이 같으면 동등 객체가 도리 수 있도록 해보세요.
 Student 클래스의 필드는 다음과 같습니다.
 hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴 하도록 하세요.
 
 실행결과 :
 1번 학생의 총점 : 95
 * */

class Student1 {
	private String studentNum;
	
	public Student1(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	// 여기에 코드를 작성하세요.
	
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
		// Student 키로 총점을 저장하는 HashMap 객체 생성.
		HashMap<Student1, String> hashMap = new HashMap<Student1, String>();
		
		// new Student("1")의 점수 95를 저장.
		hashMap.put(new Student1("1"), "95");
		
		String score = hashMap.get(new Student1("1"));
		System.out.println("1번 학생의 총점 : " + score);
	}

}
