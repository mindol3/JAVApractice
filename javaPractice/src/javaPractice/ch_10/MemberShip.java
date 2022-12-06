package javaPractice.ch_10;

// Member ��ü�� �ߺ� ���� �����ϴ� HashSet
// HashCode()�� equals() �޼ҵ带 ������ ���� ������ ����� ��ü�� 2��

public class MemberShip {
	// hashCode()�� equals() �޼��� ������
	public String name;
	public int age;
	

	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode()�� equals()�޼ҵ� ������
	
	@Override
	public boolean equals(Object obj) {// name�� age���� ������ true ����
		//name�� age���� ������ true ��ȯ
		if (obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip) obj;
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// name�� age ���� ������ ������ hashcode ��ȯ
		return name.hashCode() + age; // String�� hashCode() �̿�
	}

	


	




	

}
