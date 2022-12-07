package javaPractice.ch_10;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(memberLee); // �ߺ��� ��ü ����.
		memberHashSet.showAllMember(); // �ߺ��� ��ü�� ������� ����.
		
		// ���̵� �ߺ��� ��ü�� �������� �������� equals(), hashCode() �޼��带 �������̵� �ؾ���.
		Member memberHong = new Member(1003, "ȫ�浿"); // 1003 ���̵� �ߺ� ȸ�� �߰�
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();


	}

}
