package javaPractice.ch_10;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		// ArrayList�� ȸ�� �߰�
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		
		memberLinkedList.showAllMember(); // ��ü ȸ�� ���
		
		memberLinkedList.removeMember(memberHong.getMemberID()); // ȫ�浿 ȸ�� ����
		memberLinkedList.showAllMember();
	}
}

