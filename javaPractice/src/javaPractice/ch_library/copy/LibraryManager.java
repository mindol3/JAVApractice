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
	

	public void registration() { // 책 등록
		Library lb = new Library();
		System.out.println("등록할 책의 정보를 입력해 주세요.");
		System.out.println("코드: ");
		lb.setId(input.nextInt());
		int id = lb.getId();
		
		System.out.println("제목: ");
		lb.setTitle(input.next());
		
		System.out.println("작가: ");
		lb.setWriter(input.next());
		
		System.out.println("재고 숫자: ");
		lb.setCount(input.nextInt());
		if(libraryDAO.insertLibrary(lb))
//			list.add(lb);
			System.out.println("책이 등록 되었습니다.");
		else {
			System.out.println("책 등록에 실패하였습니다.");
		}
//			System.out.println(list.toString() + "\t");
		}
	

	public void search() { // 책 검색
		System.out.println("검색할 책의 제목을 입력해 주세요.");
		System.out.println("제목: ");
		String title = input.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		searchlist = libraryDAO.searchBook(title);
		
		if (searchlist.size() < 1) {
			System.out.println("검색된 책이 없습니다.");
		}
		else {
			System.out.println("검색된 책의 정보는 아래와 같습니다.");
			for (Library lb : searchlist) {
				System.out.println(lb);
			}
		}
	}

	private Library searchBook(int id) { // 코드로 책 찾기
		Library library = null;
		for (Library lb : list) {
			if (lb.getId() == id) {
				library = lb;
			}
		}
		return library;
	}
	
	public void rental() { // 책 대여
		System.out.println("대여할 책의 코드를 입력해 주세요.");
		System.out.println("코드: ");
		int id = input.nextInt();
		System.out.println("대여 권수: ");
		int num = input.nextInt();
		
		
			if(libraryDAO.isLibrary(id)) {
				Library lb = libraryDAO.selectOne(id);
//				Library lb = new Library();
				
				if(lb.getCount() < num) {
					System.out.println("재고가 " + lb.getCount() + "권이여서 대여할 수 없습니다.");
				}
				else {
					libraryDAO.updateLibrary(id, num, false);
					lb.setCount(lb.getCount() - num);
					System.out.println(num + "권이 대여되었습니다.");
				}
				return;
//					System.out.println("재고가 " + lb.getCount() + "권이여서 대여할 수 없습니다.");
				
//				else if(lb.getCount() >= rental) {		
//					lb.setCount(lb.getCount() - rental);
//					System.out.println(rental + "권이 대여되었습니다.");
//					return;
//				}
			}
			else {
				System.out.println("해당 코드가 존재하지 않습니다.");
			}
		
	}

	public void returns() { // 책 반납
		System.out.println("반납할 책의 코드를 입력해 주세요");
		System.out.println("코드: ");
		int id = input.nextInt();
		
		System.out.println("반납 권수: ");
		int num = input.nextInt();
		
//		Library lb = searchBook(id);
		if(libraryDAO.isLibrary(id)) {
			libraryDAO.updateLibrary(id, num, true) ;
			System.out.println(num + "권이 반납되었습니다.");
		}
		else {
			System.out.println("해당 코드가 존재하지 않습니다.");
		}
		
//		if (lb == null) {
//			System.out.println("입력하신 코드의 책은 없습니다.");
//			return;
//		}
//		lb.setCount(lb.getCount() + re);
//		System.out.println(re + "권이 반납되었습니다.");
	}

	public void displayAll() { // 책 전체출력
		System.out.println("등록된 책의 정보는 아래와 같습니다");
		System.out.println("코드\t제목\t작가\t재고");
		ArrayList<Library> list = libraryDAO.selectAll();
		for(Library lb : list) {
			System.out.println(lb.getId() + "\t" + lb.getTitle() + "\t" +
						lb.getWriter() + "\t" + lb.getCount());	
		}
	}

}
