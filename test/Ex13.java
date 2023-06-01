package chap_04;

import java.util.Scanner;

public class Ex13 {

	// int[] arr =new int[크기];
	// 배열 순희
	//for (int 1=0; i<arr.length; i++){}
	
	// 최대 100개까지의 정수를 차례로 입력 받다가
	// 0이 입력되면 입력을 중단하고,
	// 짝수번째 입력된 정수를 모두 출력하는 프로그럄 작성
	
	// 5 9 12 16 78 17 98 35 15 0
	// 9 16 18 35

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[100];
		
		int cnt = 0;
		
		for (int i=0; i <arr.length;i++) {
			arr[i] = sc.nextInt();
			if (arr[i]==0) {
				break;
			
			}
			cnt++;
		}
		for (int i = 0; i < cnt ; i+=2) {
			System.out.println(arr[i+1]+" ");
			
			
		}
	}

}

