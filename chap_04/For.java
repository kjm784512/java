package chap_4;

public class _05_For {
	public static void main(String[] args) {
		
		
		// 1부터 10까지의 정수 중 짝수만 출력
		for (int i = 0; i <=10; i+=2) {
			System.out.println(i);
			
		}
		
		
		//거꾸로 10부터 1까지 출력
		for (int i = 10; i >0; i--) {
			System.out.println(i);
		}
		
		// 1부터 100까지의 합을 구하시오
		int sum =0;
		for (int i = 1; i <=100; i++) {
			sum +=i;
		
			
		}
		System.out.println(sum);
	}
	
	
}
