package javaPractice.ch_05;

class Score1 {
	public int kor;
	public int math;
	public int eng;
	public int com;
	
	Score1(int kor, int math, int eng, int com){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	void display() {
		System.out.println("국어 = " + kor +" 수학 = " + math +" 영어 = "+ eng + " 컴퓨터 = " + com);
	}
}

public class InheritanceEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score1 score = new Score1(100, 80, 95, 84);
		//s.kor;
		score.display(); // Ok : 외부에서 접근 가능
	}

}
