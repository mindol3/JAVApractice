package javaPractice.ch_05;

class Pet {
	private String name; // �ֿϵ���
	private String masterName; // ����
	
	public Pet(String name, String masterName) { // ������
		super();
		this.name = name; // �ֿϵ���
		this.masterName = masterName; // ����
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce( ) {//�ڱ�Ұ�
		System.out.println("�� �� �̸��� " + name + "�Դϴ�!");
		System.out.println("�� ���δ��� " + masterName + "�Դϴ�!");
	}

	
}

public class Inheritance11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
