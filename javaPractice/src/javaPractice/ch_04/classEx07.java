package javaPractice.ch_04;

class Song{
	String title;
	String artist;
	int length;
	
//	Song(String title, String artist, int length){
//		this.title = title;
//		this.artist = artist;
//		this.length = length;
//	}
//	
//	Song(){
//		this("Outward Bound", "Nana", 180);
//	}
//	Song(int length){
//		this("Jambalya", "Carpenters", length);
//	}
//	Song(String artist, int length){
//		this("Yesterday", artist, length);
//	}
	
	public Song() {
		
	}
	
	public Song(String title) {
		this.title = title;
	}
	
	public Song(String title, String artist) {
		this(title);
		this.artist = artist;
	}
	
	public Song(String title, String artist, int length) {
		this(title, artist);
		this.length = length;
	}
		
	@Override
	public String toString() {
		return "Song [title=" + this.title + ", artist=" + this.artist + ", length=" + this.length + "]";
	}
	
}

public class classEx07 {


	/*
	 다중 생성자
	 노래 한 곡을 나타내는 클래스 Song을 작성하라.
	 this()를 사용하라.
	 Song 클래스는 다음과 같이 정의된다.
	 # 필드
	 title : 노래의 제목
	 artist : 가수
	 length : 곡의 길이 (단위: 초)*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("Outward Bound", "Nana", 180);
		Song song2 = new Song("Jambalya", "Carpenters");
		Song song3 = new Song("Yesterday");
		Song song4 = new Song();
		
		System.out.println(song1); // Song [title=Outward Bound, artist=Nana, length=180]
		System.out.println(song2); // Song [title=Jambalya, artist=Carpenters, length=0]
		System.out.println(song3); // Song [title=Yesterday, artist=null, length=0]
		System.out.println(song4); // Song [title=null, artist=null, length=0]
	}

}
