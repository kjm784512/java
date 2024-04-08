package s21210_00;

import java.io.IOException;

public class S21210_01v6 {

		public static void main(String[] args) throws IOException {
			
			int keyCode;
			while(true) {
				System.out.println("코드입력하세요");
				
			
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			if (keyCode == 113) {
				break;
			}	
			}
		
	}
}
