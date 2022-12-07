package javaPractice.ch_10;

import java.util.HashSet;
import java.util.Objects;

/*
 출력 결과가 다음처럼 나오도록 Member 클래스를 구현하세요.
 [400:정약용, 100:김유신, 200:강감찬, 300:이순신]
 출력순서는 상관없음
 * */

class Member2 {
	String memberId;
	String memberName;
	
	public Member2(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId.equals(member.memberId)){
				return true;
			}
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberId +":" + memberName ;
	}
	
	
}

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Member2> set = new HashSet<Member2>();
		set.add(new Member2("100", "김유신"));
		set.add(new Member2("200", "강감찬"));
		set.add(new Member2("300", "이순신"));
		set.add(new Member2("400", "정약용"));
		set.add(new Member2("100", "홍길동"));
		
		System.out.println(set);
	}

}
