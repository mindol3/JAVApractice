package javaPractice.ch_10;

// Member 객체를 중복 없이 저장하는 HashSet
// HashCode()와 equals() 메소드를 재정의 하지 않음녀 저장된 객체가 2개

public class MemberShip {
	// hashCode()와 equals() 메서드 재정의
	public String name;
	public int age;
	

	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode()와 equals()메소드 재정의
	
	@Override
	public boolean equals(Object obj) {// name과 age값이 같으면 true 리턴
		//name과 age값이 같으면 true 반환
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
		// name과 age 값이 같으면 동일한 hashcode 반환
		return name.hashCode() + age; // String의 hashCode() 이용
	}

	


	




	

}
