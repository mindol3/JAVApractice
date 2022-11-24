package javaPractice.ch_05;

public class abstract01 {
	/*추상 메서드는 선언부만 정의하고 구체적인 내용은 비워놓은 메서드.
	 * 구체적인 내용을 적지 않았기 때문에 이를 상속받은 하위 클래스에서는 사용하려면 반드시
	 * 구현하라는 의미
	 * 추상 메서드를 선언하는 방법은 '추상적인' 이라는 뜻의 제어자
	 * abstract를 메서드명 앞에 붙여줌.
	 * 
	 * 추상 클래스는 추상 메서드를 멤버로 가지는 클래스.
	 * 추상 클래스는 일반적인 메서드도 가질 수 있지만 추상 메서드를 하나라도 포함하는 클래스.*/
	
	abstract class Pokemon {// 포켓몬 추상 클래스
		
		String name;
		
		abstract void attack(); // 공격 추상 메서드. 구체적인 내용이 없으므로'{}'를 ㅐㅅㅇ략하고 세미콜른을 붙여줌
		abstract void sound(); // 소리 추상 메서드
		
		public String getName() {// 포켓몬의 이름을 리턴하는 메서드
			return this.name;
		}
	}
	
	class Pikachu extends Pokemon { // 피카츄클래스
		Pikachu() {// 이름을 지정하는 생성자
			this.name = "피카츄";
		}
		@Override
		void attack() { // 구체적으로 구현
			System.out.println("전기 공격");
			
		}

		@Override
		void sound() {
			System.out.println("피카피카");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pikachu.new pikachu();
		
	}

}
