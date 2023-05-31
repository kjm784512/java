package chap_04;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ex10 {

	public static void main(String[] args) {
		
//		피보나치 수열
//		입력한 숫자만큼 피보나치 수업 출력
//		출력된 수열의 모든 합을 구해서 출력
//		5 입력시
//		1 1 2 3 5
//		12
		
		Scanner	sc = new Scanner(System.in);
		
		
		System.out.println("피보나치수열 몇 번째 항까지 출력할까요?");
		int num = sc.nextInt();
		
		int prevPrevNum = 1;
		int prevNum = 1;
		int sum = prevPrevNum + prevNum;
		
		System.out.println(prevPrevNum+ " ");
		System.out.println(prevNum + " ");
		
		for (int i = 3; i <= num; i++) {
			int curNum = prevPrevNum + prevNum;
			sum = sum +curNum;
			System.out.println(curNum+" ");
			
			prevPrevNum = prevNum;
			prevNum = curNum;
			
		}
			System.out.println();
			System.out.println(sum);
	
	
	}
}
