package chap_04;

public class _13_NameLoop {
	public static void main(String[] args) {
		
		Loop1:for (int i = 2; i <10; i++) {
			for (int j = 1; j <10; j++) {
				if(j==5)continue Loop1;
				System.out.println(i + "*" + j+ "=" +(i*j));

				
			}
		}
	}
}
