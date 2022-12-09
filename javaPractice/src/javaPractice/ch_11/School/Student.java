package javaPractice.ch_11.School;

public class Student extends Person {
	private int studentNumber; // �й�
	// �л��� ����ִ� ������ ���� (�ڹ�, ���̽�, C)
	private static String[] className = {"JAVA", "PYTHON", "C", "HTML", "CSS"};
	private boolean[] classCheck = new boolean[className.length];  // ���� ��û�� �ϸ� true�� ����
	private int[] classScore = new int[className.length]; // �� ���� ����
	
	//Student �� ������
	public Student(int studentNumber) {
		// �й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� �����Ѵ�.
		this.studentNumber = studentNumber;
		
	}public boolean[] getClassCheck() {
		return classCheck;
	}
	
	public void setClassCheck(int index, boolean check) {
		this.classCheck[index] = check;
	}
	
	public int[] getClassScore() {
		return classScore;
	}
	
	public void setClassScore(int index, int score) {
		this.classScore[index] = score;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public static String[] getClassName() {
		return className;
	}
	public static void setClassName(String[] className) {
		Student.className = className;
	}
	
	
}
