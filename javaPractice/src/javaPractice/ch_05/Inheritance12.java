package javaPractice.ch_05;

class Animal1{
	void breath() {
		System.out.println("������");
	}
}

class Lion extends Animal1{
	@Override
	public String toString() {
		return "����";
	}
}

class Zookeeper {// ������ Ŭ����
//	void feed(Lion lion) {//���ڿ��� ���� �ִ� �޼���
//		System.out.println(lion + "���� ��� �ֱ�");
//	}
//	void feed(Rabbit rabbit) {//���ڿ��� ���� �ִ� �޼���
//		System.out.println(rabbit + "���� ��� �ֱ�");
//	}
//	void feed(Monkey monkey) {//���ڿ��� ���� �ִ� �޼���
//		System.out.println(monkey + "���� ��� �ֱ�");
//	}
	void feed(Animal1 animal) {
		System.out.println(animal + "���� ��� �ֱ�");
	}
}

class Rabbit extends Animal1{
	public String toString() {
		return "�䳢";
	}
}
class Monkey extends Animal1{
	public String toString() {
		return "������";
	}
}

public class Inheritance12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 lion = new Lion(); //Lion �ν��Ͻ� ����
		Animal1 rabbit = new Rabbit();
		Animal1 monkey = new Monkey();
		Zookeeper james = new Zookeeper(); // james ��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion); // james�� lion���� ���̸� ��
		james.feed(rabbit);
		james.feed(monkey);
	}

}
