package javaPractice.ch_04.student;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void turnONOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� ����.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ��쿡�� 1 ����.
//		if(volume < MAX_VOLUME) {
//			volume++;
//		}
		volume = (volume < MAX_VOLUME) ? volume + 1 : volume;
	}
	
	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� ���� ��쿡�� 1 ����.
//		if(volume > MIN_VOLUME) {
//			volume--;
//		}
		volume = (volume > MIN_VOLUME) ? volume - 1 : volume;
	}
	
	void channelUp() {
		// (4) channel�� ���� 1����
		// MAX_CHANNEL ���� �ö� ���� ����.
		channel = (MAX_CHANNEL == channel) ? MAX_CHANNEL : channel + 1;
		
	}
	void channelDown() {
		// (2) channel�� ���� 1����
		// MIN_CHANNEL ���� ���� ���� ����.
		channel = (MIN_CHANNEL == channel) ? MIN_CHANNEL : channel - 1;
	}
	
}

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" +t.channel+", VOL:"+ + t.volume); // CH:100, VOL:0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" +t.channel+", VOL:"+ + t.volume); // CH:99, VOL:0
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" +t.channel+", VOL:"+ + t.volume); // CH:100, VOL:100
		
	}

}
