package javaPractice.ch_10;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004); // ȸ�� ���̵� (key ��)�� 1004�� ȸ�� ����.
		memberHashMap.showAllMember();
	}

}
