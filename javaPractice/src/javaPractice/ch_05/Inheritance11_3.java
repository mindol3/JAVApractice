package javaPractice.ch_05;

public class Inheritance11_3 {
	// p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
	static void intro(Pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ֿϵ��� Ŭ������ �̿� �� (�޼ҵ��� �μ��� �������� ����)
		Pet[] a = {
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����"),
		};
		
		for(Pet p : a) {
			intro(p); // p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
			System.out.println();
		}
	}

}
