package javaPractice.ch_09;

class Book{
	int bookNumber; // å��ȣ
	String bookTitle; // ����
	
	Book(int bookNumber, String bookTitle){ // å ��ȣ�� ������ �Ű������� �Է¹޴� ������.
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// toString() �޼��带 ���� �������ϸ� ��ü�� ���� ������ �̿��� ���ϴ� ���ڿ��� ǥ��.
//	@Override
//	public String toString() {
//		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
//	}
	
}

public class toString01 {
	// Object Ŭ������ toString() �޼��� �̿��ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(200, "����");
		
		//String toString() : ��ü�� ���ڿ��� ǥ���Ͽ� ��ȯ. �������Ͽ� ��ü�� ���� �����̳� Ư�� ��� ������ ��ȯ.
		System.out.println(book1); // �ν��Ͻ� ���� (Ŭ���� �̸�, �ּ� ��)
		System.out.println(book1.toString()); // tostring �޼���� �ν��Ͻ� ����(Ŭ���� �̸�, �ּ� ��)�� ������.
 	}

}
