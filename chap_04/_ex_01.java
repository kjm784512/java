package chap_04;

public class _ex_01 {
	public static void main(String[] args) {
		
		
			for (int i = 2; i <10; i++) {
				if(i%2==0) continue;
			for (int j = 1; j <10; j++) {
				System.out.println(i + "*" + j+ "=" +(i*j));

			}
		}
	}
}
