package javaPractice.ch_10;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList ����
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>(); // Member ������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member); // ȸ���� �߰�
	}
	
	public boolean removeMember(int memberID) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); // get() �޼���� ȸ���� ���������� ������.
//			if(member.getMemberID() == memberID) {// ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
//				arrayList.remove(i); // �ش� ȸ���� ����
//				return true;
//			}
//		}
		for (Member member : arrayList) {
			if(member.getMemberID() == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�."); // �ݺ����� ������ �ش� ���̵� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() {// ��ü ȸ���� ����ϴ� �޼���
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
