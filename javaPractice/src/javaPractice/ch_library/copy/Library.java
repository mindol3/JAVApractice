package javaPractice.ch_library.copy;

public class Library {

	private int id; // 코드
	private String title; // 제목
	private String writer; // 작가
	private int count; // 재고 숫자
	
	public Library() {
		
	}

	public Library(int id, String title, String writer, int count) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "코드 = " + id + ", 제목 = " + title + 
				", 작가 = " + writer + ", 재고 = " + count;
	}
	
	
	
	
}
