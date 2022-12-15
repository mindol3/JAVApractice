package javaPractice.ch_11.School.copy;

public class Subject {
	int code; // 코드
	String subjectName; // 과목명
	
	public Subject() {
		
	}
	
	public Subject(int code) {
		this.code = code;
	}
	
	public Subject(int code, String subjectName) {
		this.code = code;
		this.subjectName = subjectName;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [code=" + code + ", subjectName=" + subjectName + "]";
	}
	
}
