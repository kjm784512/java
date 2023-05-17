package test;

import java.util.Scanner;

public class Ex04 {
	// 어떤 정수 n을 입력받고,
	// 1부터 홀수를 차례대로 더해 나가면서 합이n보다 크면 그 때까지 더한 홀수의 개수와 합을 출력하시오.
	// 입력 : 1000 / 출력 : 32,1024
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int sum =0;
	int cnt =0;
	int n =sc.nextInt();
	
	for(int i=1; ; i+=2) {
		if (sum>n) {
			break;
		
		}
		sum =sum +i;
		cnt++;
	}
	
	System.out.println(cnt + ","+sum);
	
	
	
	
	
	}

	
}
