package javaPractice.ch_10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet; // Hashset ����

	public MemberHashSet() {
		hashSet = new HashSet<Member>(); // HashSet ����.
	}
	
	public void addMember (Member member) {
		hashSet.add(member); // HashSet�� ȸ�� �߰���
	}
	
	public boolean removeMember(int memberId) {
		//�Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����.
		Iterator<Member> ir = hashSet.iterator(); // iterator�� Ȱ���� ��ȸ��.
		
		while(ir.hasNext()) {
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberID(); // ���̵� ��.
			if(tempId == memberId) { // ���� ���̵��� ���
				hashSet.remove(member); // ȸ�� ����
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // ��� ȸ�� ���
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
