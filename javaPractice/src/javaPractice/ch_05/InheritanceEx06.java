package javaPractice.ch_05;

class Score {
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;
		}
		else {
			System.out.println(kor + " 는 올바른 값 (범위 0~100)이 아닙니다.");
		}
	}
}

public class InheritanceEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score();
		score.setKor(-500);
	}

}
