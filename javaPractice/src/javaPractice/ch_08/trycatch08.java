package javaPractice.ch_08;

class AgeExeption extends Exception {
	public AgeExeption() {}
	public AgeExeption(String message) {
		super(message);
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}

public class trycatch08 {
	public static void ticketing(int age) throws AgeExeption {
		if(age < 0) {
			throw new AgeExeption("나이 입력이 잘못되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeExeption e) {
			e.printStackTrace();
		}
	}

}
