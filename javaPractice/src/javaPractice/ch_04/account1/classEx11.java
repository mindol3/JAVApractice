package javaPractice.ch_04.account1;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	public void updateRecord(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return getTotal() /3;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
}

public class classEx11 {
	/*
	 Student Ŭ������ �����Ͻÿ�.
	 �̸� name, �� ban, ��ȣ no �� �Է¹޴� �����ڸ� ����ÿ�.
	 ���� kor, ���� eng, ���� math ������ �Է¹޴� updateRecord() �޼��带 �ۼ��Ͻÿ�.
	 �л��� �̸��� ��ȯ�ϴ� getName(), �Է¹��� ������ �հ踦 ���ϴ� getTotal(), ����� ��ȯ�ϴ� getAverage()�� �ۼ��Ͻÿ�.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("�̸�: " + s.getName());
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());
	}

}
