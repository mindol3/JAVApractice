package javaPractice.ch_09;

/*
 void finalize()
new �����ڷ� ������ ��ü�� ���� ����.
�޸𸮰� �������� �ʾ� �� ����� ��ü�� �����ؾ� ��.
�ڹٿ��� ������ �÷��Ͱ� �ֱ������� �̻�� ��ü�� ã�� �޸𸮸� ȸ���ϱ� ������, ��ü�� �����ϴ� ������ ����� ����.
�޸� ȸ���� �ڵ����� ����Ǽ� �޸� ������ ������ �ʿ䰡 ������ ��ü�� �����ؼ� ����ϱ⸸ �ϸ� ��.

������ ������ �÷����� ����� �޸𸮿��� ���ѵǸ� �� �̿��� �ڿ��� ���۾����� �����ؾ� ��.
���� ��� ��Ʈ��ũ�� �����Ͽ� ����ϴ� Ŭ������� �����ϴ� ���۰� ������ ���� ������ �ʿ�.
�Ʒ��� �ڵ忡�� disconnect() �޼ҵ� ȣ���� �����ų�, ���ܰ� �߻��� �޼��尡 ȣ����� �ʾҴٸ�
��ü�� ������ �÷��Ϳ� ���� ȸ�������� ����� ����� �ƹ��� �������� �ʾ� ������ �� ���·� �����ְ� ��
 */
class Network {
	void connect() {
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void disconnect() {
		System.out.println("������ ���������ϴ�.");
	}
}

public class finalize {
	static void communication() {
		Network network = new Network();
		network.connect();
		// ��Ʈ��ũ ���
		network.disconnect();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		communication();
	}

}
