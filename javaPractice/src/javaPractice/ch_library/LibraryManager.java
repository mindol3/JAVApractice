package javaPractice.ch_library;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_library.copy.Library;

public class LibraryManager {
	
	
	
	private ArrayList<Library> list;
	private Scanner input;
	
	public LibraryManager() {
		list = new ArrayList<Library>();
		input = new Scanner(System.in);
	}
	
//	private Library findLibrary(int id) {
//		for(Library lb : list) {
//			if(lb.getId() == id) {
//				return lb;
//			}
//		}
//		return null;
//	}
//	
//	private boolean isLibrary(int id) {
//		return (findLibrary(id) == null) ? false : true;
//	}
	

	public void registration() { // å ���
		System.out.println("����� å�� ������ �Է��� �ּ���.");
		Library lb = new Library();
		
		System.out.println("�ڵ�: ");
		lb.setId(input.nextInt());
//		int id = lb.getId();
		
		System.out.println("����: ");
		lb.setTitle(input.next());
		
		System.out.println("�۰�: ");
		lb.setWriter(input.next());
		
		System.out.println("��� ����: ");
		lb.setCount(input.nextInt());
		
		list.add(lb);

		System.out.println("å�� ��� �Ǿ����ϴ�.");
		System.out.println(list.toString() + "\t");	
	}

	public void search() { // å �˻�
		System.out.println("�˻��� å�� ������ �Է��� �ּ���.");
		System.out.println("����: ");
		String title = input.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		for (Library lb : list) {
			if(lb.getTitle().contains(title)) {
				searchlist.add(lb);
			}
		}
		if (searchlist.size() < 1) {
			System.out.println("�˻��� å�� �����ϴ�.");
		}
		else {
			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
			for (Library lb : searchlist) {
				System.out.println(lb);
			}
		}
	}
	
	private Library searchBook(int id) { // �ڵ�� å ã��
		Library library = null;
		for (Library lb : list) {
			if (lb.getId() == id) {
				library = lb;
			}
		}
		return library;
	}

	public void rental() { // å �뿩
		System.out.println("�뿩�� å�� �ڵ带 �Է��� �ּ���.");
		System.out.println("�ڵ�: ");
		int id = input.nextInt();
		
		System.out.println("�뿩 �Ǽ�: ");
		int rental = input.nextInt();
		
		Library lb = searchBook(id);
		if (lb == null) {
			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
			return;
		}
		if(lb.getCount() < rental) {
			System.out.println("��� " + lb.getCount() + "���̿��� �뿩�� �� �����ϴ�.");
			return;
		}
		lb.setCount(lb.getCount() - rental);
		System.out.println(rental + "���� �뿩�Ǿ����ϴ�.");
		
//		for(Library lb : list) {
//			if(lb.getId() == id) {
//				if(lb.getCount() < rental) {
//					System.out.println("��� " + lb.getCount() + "���̿��� �뿩�� �� �����ϴ�.");
//				}
//				else if(lb.getCount() >= rental) {		
//					lb.setCount(lb.getCount() - rental);
//					System.out.println(rental + "���� �뿩�Ǿ����ϴ�.");
//					return;
//				}
//			}
//			else {
//				System.out.println("�ش� �ڵ尡 �������� �ʽ��ϴ�.");
//			}
//		}
	}

	public void returns() { // å �ݳ�
		System.out.println("�ݳ��� å�� �ڵ带 �Է��� �ּ���");
		System.out.println("�ڵ�: ");
		int id = input.nextInt();
		System.out.println("�ݳ� �Ǽ�: ");
		int re = input.nextInt();
		
		for(Library lb : list) {
			if(lb.getId() == id) {
				lb.setCount(re + lb.getCount());
				System.out.println(re + "���� �ݳ��Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�ش� �ڵ尡 �������� �ʽ��ϴ�.");
		
	}

	public void displayAll() { // å ��ü���
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�");
		for(Library lb : list) {
			System.out.println(lb);	
		}
	}

}
