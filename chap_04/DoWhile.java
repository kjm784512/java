package chap_4;

import java.nio.channels.AcceptPendingException;

public interface _07_DoWhile {
	public static void main(String[] args) {
		// 반복문 do~while
		int distance =25;
		int move=0;
		while (move < distance) {
			System.out.println("스토로크를 합니다");
			System.out.println("현재 이동 거리"+move);
			move+=3;
			
		}
		do {
			System.out.println("스토로크를 합니다");
			System.out.println("현재 이동 거리"+move);
			move+=3;
		}while (move < distance);
		System.out.println("do ~while 종료");
		
		
		
	}
}
