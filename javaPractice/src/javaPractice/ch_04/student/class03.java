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
		// (1) isPowerOn의 값을 true를 false로, false를 true로 변경.
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume의 값을 MAX_VOLUME보다 낮을 경우에는 1 증가.
//		if(volume < MAX_VOLUME) {
//			volume++;
//		}
		volume = (volume < MAX_VOLUME) ? volume + 1 : volume;
	}
	
	void volumeDown() {
		// (3) volume의 값을 MIN_VOLUME보다 높을 경우에는 1 감소.
//		if(volume > MIN_VOLUME) {
//			volume--;
//		}
		volume = (volume > MIN_VOLUME) ? volume - 1 : volume;
	}
	
	void channelUp() {
		// (4) channel의 값을 1증가
		// MAX_CHANNEL 보다 올라 갈수 없음.
		channel = (MAX_CHANNEL == channel) ? MAX_CHANNEL : channel + 1;
		
	}
	void channelDown() {
		// (2) channel의 값을 1감소
		// MIN_CHANNEL 보다 내려 갈수 없음.
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
