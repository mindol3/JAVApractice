package javaPractice.ch_05;
/*
 * �Ϲ����� �簢���� ��Ÿ���� Rectangle Ŭ������ �ִ�.
 * Rectangle Ŭ������ ��ӹ޾Ƽ� ���� �ִ� �簢���� ��Ÿ���� ColorRectangle Ŭ������ �����Ѵ�.
 * ColorRectangle Ŭ������ ������ ��Ÿ���� �ʵ� color�� �߰��ȴ�.
 * ColorRectangle Ŭ������ �����ڸ� �ۼ��϶�.*/

class Rectangle {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle {
	String color;
	ColorRectangle(int width, int height, String color){
		super(width, height);
		this.color = color;
	}
}


public class InheritanceEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("���� : " + obj.width);
		System.out.println("���� : " + obj.height);
		System.out.println("���� : " + obj.color);
	}

}
