package chap_4;

public class _08_NestedLoop {
	public static void main(String[] args) {
		//	*****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		
		System.out.println("===================================");
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				for (int j = 0; j<2; j++) {
					
				}
				System.out.print("*");
				
			}
			System.out.println();
		}

	for (int i = 0; i <5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.println(" ");
				
		}	
		for (int k = 0; k <1+i; k++) {
			System.out.println("*");
	}
		System.out.println();
		
		}
		
}
}
