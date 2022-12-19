package javaPractice.ch_14;

import java.io.FileInputStream;
import java.io.IOException;

public class input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int read(byte[] b) 메서드로 읽기
		 자료를 read() 메서드로 한 바이트씩 읽는 것 보다 배열을 사용해서 한꺼번에 많이 읽음녀 처리 속도가 훨씬 빠름.
		 read(byte[] b) 메서드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽고 읽어 들인 자료의 수를 반환.
		 */
		
		try (FileInputStream fis = new FileInputStream("./sample_file/input.txt")){
			
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.println((char)b);
//				}
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
