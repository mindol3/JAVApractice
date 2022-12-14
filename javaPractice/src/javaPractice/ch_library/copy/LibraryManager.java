package javaPractice.ch_library.copy;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_11.account.copy.Account;

public class LibraryManager {
	
//	private Connection connection = null;
	

	private ArrayList<Library> list;
	private Scanner input;
	private LibraryDAO libraryDAO;
	
	public LibraryManager() {
		list = new ArrayList<Library>();
		input = new Scanner(System.in);
		libraryDAO = new LibraryDAO();
	}
	
	public void disConnect() {
		libraryDAO.disConnect();
	}
	
	private Library findLibrary(int id) {
		for(Library lb : list) {
			if(lb.getId() == id) {
				return lb;
			}
		}
		return null;
	}
	
	private boolean isLibrary(int id) {
		return (findLibrary(id) == null) ? false : true;
	}
	

	public void registration() { // å ���
		Library lb = new Library();
		System.out.println("����� å�� ������ �Է��� �ּ���.");
		System.out.println("�ڵ�: ");
		lb.setId(input.nextInt());
		int id = lb.getId();
		
		System.out.println("����: ");
		lb.setTitle(input.next());
		
		System.out.println("�۰�: ");
		lb.setWriter(input.next());
		
		System.out.println("��� ����: ");
		lb.setCount(input.nextInt());
		if(libraryDAO.insertLibrary(lb))
//			list.add(lb);
			System.out.println("å�� ��� �Ǿ����ϴ�.");
		else {
			System.out.println("å ��Ͽ� �����Ͽ����ϴ�.");
		}
//			System.out.println(list.toString() + "\t");
		}
	

	public void search() { // å �˻�
		System.out.println("�˻��� å�� ������ �Է��� �ּ���.");
		System.out.println("����: ");
		String title = input.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		searchlist = libraryDAO.searchBook(title);
		
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
		int num = input.nextInt();
		
		
			if(libraryDAO.isLibrary(id)) {
				Library lb = libraryDAO.selectOne(id);
//				Library lb = new Library();
				
				if(lb.getCount() < num) {
					System.out.println("��� " + lb.getCount() + "���̿��� �뿩�� �� �����ϴ�.");
				}
				else {
					libraryDAO.updateLibrary(id, num, false);
					lb.setCount(lb.getCount() - num);
					System.out.println(num + "���� �뿩�Ǿ����ϴ�.");
				}
				return;
//					System.out.println("��� " + lb.getCount() + "���̿��� �뿩�� �� �����ϴ�.");
				
//				else if(lb.getCount() >= rental) {		
//					lb.setCount(lb.getCount() - rental);
//					System.out.println(rental + "���� �뿩�Ǿ����ϴ�.");
//					return;
//				}
			}
			else {
				System.out.println("�ش� �ڵ尡 �������� �ʽ��ϴ�.");
			}
		
	}

	public void returns() { // å �ݳ�
		System.out.println("�ݳ��� å�� �ڵ带 �Է��� �ּ���");
		System.out.println("�ڵ�: ");
		int id = input.nextInt();
		
		System.out.println("�ݳ� �Ǽ�: ");
		int num = input.nextInt();
		
//		Library lb = searchBook(id);
		if(libraryDAO.isLibrary(id)) {
			libraryDAO.updateLibrary(id, num, true) ;
			System.out.println(num + "���� �ݳ��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� �ڵ尡 �������� �ʽ��ϴ�.");
		}
		
//		if (lb == null) {
//			System.out.println("�Է��Ͻ� �ڵ��� å�� �����ϴ�.");
//			return;
//		}
//		lb.setCount(lb.getCount() + re);
//		System.out.println(re + "���� �ݳ��Ǿ����ϴ�.");
	}

	public void displayAll() { // å ��ü���
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�");
		System.out.println("�ڵ�\t����\t�۰�\t���");
		ArrayList<Library> list = libraryDAO.selectAll();
		for(Library lb : list) {
			System.out.println(lb.getId() + "\t" + lb.getTitle() + "\t" +
						lb.getWriter() + "\t" + lb.getCount());	
		}
	}

}
