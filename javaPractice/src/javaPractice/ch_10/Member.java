package javaPractice.ch_10;

import java.util.Objects;

public class Member implements Comparable<Member>{
	private int memberID; // 회원아이디
	private String memberName; // 회원이름
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}


	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int compareTo(Member member) { // Comparable를 구현하기 때문에 오버라이딩.
		// 비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬.
		// 메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에는 음수를 리턴하고, 크기가 동일하다면 0, 클 경우에는 양수를 리턴.
		// return (this.memberID - member.memberID); // memberID가 정수이기 때문에 오름차순으로 정렬.
		return (this.memberID - member.memberID) * (-1);
	}

}
