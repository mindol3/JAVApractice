package javaPractice.ch_06;

// 인터페이스 상수 사용 예
interface Skinnable {
	int BLACK = 0; // 검정 // public static final
	int RED = 1; // 빨강
	int GREEN = 2; // 녹색
	int BLUE = 3; // 파랑
	int LEOPARD = 4; // 표범 무늬
	void changeSkin(int skin); // 스킨변경 public abstract
}

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() { } // 생성자


	@Override
	public void play() {
		System.out.println("★ 재생시작!");
		
	}

	@Override
	public void stop() {
		System.out.println("★ 재생종료!");
		
	}
	@Override
	public void changeSkin(int skin) { // 스킨변경
		System.out.println("스킨을 ");
		switch (skin) {
		case BLACK: System.out.println("검정"); break;
		case RED: System.out.println("빨강"); break;
		case GREEN: System.out.println("녹색"); break;
		case BLUE: System.out.println("파랑"); break;
		case LEOPARD: System.out.println("표범무늬"); break;
		default : System.out.println("기본값"); break;
		}
		System.out.println("(으)로 변경했습니다.");
		
	}
	
}

public class interface02 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		PortablePlayer a = new PortablePlayer();
		a.play(); // 재생
		a.stop(); // 정지
		System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD);
	}

}
