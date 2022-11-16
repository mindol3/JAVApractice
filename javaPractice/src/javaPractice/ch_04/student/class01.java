package javaPractice.ch_04.student;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentAhn = new Student();
		studentAhn.studentName = "¾È½Â¿¬";
		
		// °°Àº °á°ú°¡ ³ª¿È.
		System.out.println(studentAhn.studentName); // ¾È½Â¿¬
		System.out.println(studentAhn.getStudentName()); // ¾È½Â¿¬
	}

}
