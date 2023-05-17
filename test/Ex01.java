package test;

import java.util.Scanner;

public class Ex01 {
	// 1~9 중 번호를 입력받아 그 번호에 구구단을 출력하시오.
	// 5분 - 42분까지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = sc.nextInt() ; i <10; i++) {
			for (int j = 2; j <10; j++) {
				System.out.println("i"+"*"+"j"+"="+ i*j);
			
			}
		}
	}
}
