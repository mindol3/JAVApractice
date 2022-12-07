package javaPractice.ch_10;

import java.util.HashSet;
import java.util.Objects;

/*
 ��� ����� ����ó�� �������� Member Ŭ������ �����ϼ���.
 [400:�����, 100:������, 200:������, 300:�̼���]
 ��¼����� �������
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
		set.add(new Member2("100", "������"));
		set.add(new Member2("200", "������"));
		set.add(new Member2("300", "�̼���"));
		set.add(new Member2("400", "�����"));
		set.add(new Member2("100", "ȫ�浿"));
		
		System.out.println(set);
	}

}
