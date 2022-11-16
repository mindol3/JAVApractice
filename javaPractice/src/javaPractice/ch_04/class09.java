package javaPractice.ch_04;

class MyMath1 {
	int add(int a, int b) {
		return a + b;
	}
	
	long add(long a, int b) {
		return a + b;
	}
	
	long add(int a, long b) {
		return a + b;
	}
	long add(long a, long b) {
		return a + b;
	}
	int add(int[] a) {
		int result = 0;
		for(int i=0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath1 mm = new MyMath1();
		System.out.println("mm.add(3, 3) ���:" + mm.add(3,3));
		// int add(int a, int b) - mm.add(3, 3) ���:6
		
		System.out.println("mm.add(3L, 3) ���:" + mm.add(3L,3));
		// long add(long a, int b) - mm.add(3L, 3) ���:6
		
		System.out.println("mm.add(3, 3L) ���:" + mm.add(3,3L));
		// long add(int a, long b) - mm.add(3, 3L) ���:6
		
		System.out.println("mm.add(3L, 3L) ���:" + mm.add(3L,3L));
		// long add(long a, long b) - mm.add(3L, 3L) ���:6
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���: " + mm.add(a));
		// int add(int[] a) - mm.add(a) ���: 600
	}

}
