package javaPractice.ch_05;

public class abstract01 {
	/*�߻� �޼���� ����θ� �����ϰ� ��ü���� ������ ������� �޼���.
	 * ��ü���� ������ ���� �ʾұ� ������ �̸� ��ӹ��� ���� Ŭ���������� ����Ϸ��� �ݵ��
	 * �����϶�� �ǹ�
	 * �߻� �޼��带 �����ϴ� ����� '�߻�����' �̶�� ���� ������
	 * abstract�� �޼���� �տ� �ٿ���.
	 * 
	 * �߻� Ŭ������ �߻� �޼��带 ����� ������ Ŭ����.
	 * �߻� Ŭ������ �Ϲ����� �޼��嵵 ���� �� ������ �߻� �޼��带 �ϳ��� �����ϴ� Ŭ����.*/
	
	abstract class Pokemon {// ���ϸ� �߻� Ŭ����
		
		String name;
		
		abstract void attack(); // ���� �߻� �޼���. ��ü���� ������ �����Ƿ�'{}'�� ���������ϰ� �����ݸ��� �ٿ���
		abstract void sound(); // �Ҹ� �߻� �޼���
		
		public String getName() {// ���ϸ��� �̸��� �����ϴ� �޼���
			return this.name;
		}
	}
	
	class Pikachu extends Pokemon { // ��ī��Ŭ����
		Pikachu() {// �̸��� �����ϴ� ������
			this.name = "��ī��";
		}
		@Override
		void attack() { // ��ü������ ����
			System.out.println("���� ����");
			
		}

		@Override
		void sound() {
			System.out.println("��ī��ī");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pikachu.new pikachu();
		
	}

}
