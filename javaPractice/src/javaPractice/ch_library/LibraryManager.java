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
	

	public void registration() { // 책 등록
		System.out.println("등록할 책의 정보를 입력해 주세요.");
		Library lb = new Library();
		
		System.out.println("코드: ");
		lb.setId(input.nextInt());
//		int id = lb.getId();
		
		System.out.println("제목: ");
		lb.setTitle(input.next());
		
		System.out.println("작가: ");
		lb.setWriter(input.next());
		
		System.out.println("재고 숫자: ");
		lb.setCount(input.nextInt());
		
		list.add(lb);

		System.out.println("책이 등록 되었습니다.");
		System.out.println(list.toString() + "\t");	
	}

	public void search() { // 책 검색
		System.out.println("검색할 책의 제목을 입력해 주세요.");
		System.out.println("제목: ");
		String title = input.next();
		
		ArrayList<Library> searchlist = new ArrayList<>();
		for (Library lb : list) {
			if(lb.getTitle().contains(title)) {
				searchlist.add(lb);
			}
		}
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
		int rental = input.nextInt();
		
		Library lb = searchBook(id);
		if (lb == null) {
			System.out.println("입력하신 코드의 책은 없습니다.");
			return;
		}
		if(lb.getCount() < rental) {
			System.out.println("재고가 " + lb.getCount() + "권이여서 대여할 수 없습니다.");
			return;
		}
		lb.setCount(lb.getCount() - rental);
		System.out.println(rental + "권이 대여되었습니다.");
		
//		for(Library lb : list) {
//			if(lb.getId() == id) {
//				if(lb.getCount() < rental) {
//					System.out.println("재고가 " + lb.getCount() + "권이여서 대여할 수 없습니다.");
//				}
//				else if(lb.getCount() >= rental) {		
//					lb.setCount(lb.getCount() - rental);
//					System.out.println(rental + "권이 대여되었습니다.");
//					return;
//				}
//			}
//			else {
//				System.out.println("해당 코드가 존재하지 않습니다.");
//			}
//		}
	}

	public void returns() { // 책 반납
		System.out.println("반납할 책의 코드를 입력해 주세요");
		System.out.println("코드: ");
		int id = input.nextInt();
		System.out.println("반납 권수: ");
		int re = input.nextInt();
		
		for(Library lb : list) {
			if(lb.getId() == id) {
				lb.setCount(re + lb.getCount());
				System.out.println(re + "권이 반납되었습니다.");
				return;
			}
		}
		System.out.println("해당 코드가 존재하지 않습니다.");
		
	}

	public void displayAll() { // 책 전체출력
		System.out.println("등록된 책의 정보는 아래와 같습니다");
		for(Library lb : list) {
			System.out.println(lb);	
		}
	}

}
