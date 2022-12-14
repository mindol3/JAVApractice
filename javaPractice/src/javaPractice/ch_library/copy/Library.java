package javaPractice.ch_library.copy;

public class Library {

	private int id; // �ڵ�
	private String title; // ����
	private String writer; // �۰�
	private int count; // ��� ����
	
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
		return "�ڵ� = " + id + ", ���� = " + title + 
				", �۰� = " + writer + ", ��� = " + count;
	}
	
	
	
	
}
