package chap_04;

public class Ex11 {

	public static void main(String[] args) {
		// 1부터 10까지의 정수 중에서 랜덤으로 뽑기
		int range = 10;
		int start = 1;
		int a = 0 , b = 0 , c= 0;
		
		// 0.0 ~ 0.9999999999 까지 나온다
		// 0.0 ~9.9999999999999999 까지 나온다
		// 1.0 ~ 10.999999999999 까지나온다
		// 1 ~ 10 까지 나온다
		while (a==b || b==c || c==a) {
		a = (int)(Math.random()*range+start);
		b = (int)(Math.random()*range+start);
		c = (int)(Math.random()*range+start);
		
		
	
		
		
	
	}System.out.printf("%d,%d,%d", a,b,c);
	
	

	}
}
