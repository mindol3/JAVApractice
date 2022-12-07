package javaPractice.ch_10;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; // HashMap ����.
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); // HashMap ��ü ����
	}
	
	public void addMember(Member member) { // ȸ���߰�
		hashMap.put(member.getMemberID(), member); // key-value ������ �߰�.
	}
	
	public boolean removeMember(int memberId) { // ȸ���� �����ϴ� �޼���.
		if(hashMap.containsKey(memberId)) {// HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberId); // �ش� ȸ�� ����
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // iterator �� ����ؼ� ��ü ȸ���� ����ϴ� �޼���.
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // ���� key�� �ִٸ�
			int key = ir.next(); // key ���� ������
			Member member = hashMap.get(key); // key�� ���� value ��������.
			System.out.println(member);
		}
		System.out.println();
	}
}
