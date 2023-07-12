package chap_04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {

	// 어떤 숫자를 입력받고,
	// 해당 숫자까지의 홀수의  합과 짝수의 합을 구하시오
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int evenSum = 0;
	int oddSum = 0;
	
	System.out.println("숫자는?");
	int num= sc.nextInt();
	
	for (int i=0; i<=num ;i++) {
		if(i%2==0) {
			evenSum +=i;
		}else {
			oddSum +=i;
		}
		
	}
	System.out.println("짝수합" + evenSum);
	System.out.println("홀수합" + oddSum);
	
	}
}
