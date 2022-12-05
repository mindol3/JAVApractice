package javaPractice.ch_09;

// book1 ��ü�� book2�� ������ �� �ְ� clone() �޼��带 �������̵� �϶�.

class MyBook implements Cloneable {
	String title;
	
	public MyBook(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
//	@Override
//	public String toString() {
//		return "MyBook [title=" + title + "]";
//	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class Ex2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyBook book1 = new MyBook("�ڹ�");
		MyBook book2 = (MyBook)book1.clone();
		System.out.println(book2.title);
		
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
	}

}
