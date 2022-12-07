package javaPractice.ch_10;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; // treeSet ����
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(); // treeSet ����
	}
	
	public void addMember(Member member) {// treeSet�� ȸ�� �߰�
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		//�Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����.
		Iterator<Member> ir = treeSet.iterator(); // iterator�� Ȱ���� ��ȸ��.
		
		while(ir.hasNext()) {
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberID(); // ���̵� ��.
			if(tempId == memberId) { // ���� ���̵��� ���
				treeSet.remove(member); // ȸ�� ����
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // ��� ȸ�� ���
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
