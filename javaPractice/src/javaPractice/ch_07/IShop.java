package javaPractice.ch_07;

// ���θ� �԰��� ������ �������̽�, ��� ���θ��� IShop �������̽��� �����ؾ� ��.
public interface IShop {
	// ���θ� Ŭ������ ������ �� �Բ� �����ؾ� �ϴ� �߻� �޼���
	public abstract void setTitle(String title); // ���θ� ����(�̸�)�� ����.
	public abstract void genUser(); // ���θ��� �̿��� �� �ִ� ���� ����ڵ��� ����
	public abstract void genProduct(); // ���θ��� ���� ��ǰ�� ����
	public abstract void start(); // ���θ� ���α׷��� �����ϴ� ���� �޼��� 
	
}
