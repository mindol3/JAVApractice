package javaPractice.ch_09;
/*Member 클래스에는 id와 이름, 연락처를 저장하는 필드가 있다.
 * Member 클래스를 작성하되, Object의 toString() 메서드를 재정의해서 아래와 같이 나오도록 작성하라.
 * 실행결과:
 * blue: 이파란*/
class Member {
	String id,name,tel;
	
	Member(String id, String name, String tel){
		this.id =id;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return  id + ": " + name;
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "이파란", "010-1234-5678");
		System.out.println(member);
	}

}
