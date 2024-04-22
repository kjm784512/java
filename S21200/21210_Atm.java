package s21200_java04;

import java.util.Scanner;

public class S21210_Atm {
	static int bankAcount;
	int acount;
	
	public static void main(String[] args) {
		//참조 변수
		S21210_Atm a = new S21210_Atm();
		S21210_Atm b = new S21210_Atm();
		
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\r메뉴 선택 : 1. 입금 2. 인출 9.종료");
			int selectAcount = scanner.nextInt();
			if (selectAcount == 9) {
				break;
			}
			if(selectAcount < 1 || selectAcount >2) {
				continue;
			}
			System.out.println("금액 입력: ");
			int money = scanner.nextInt();
			
			if (selectAcount == 1) {
				if (selectAcount == 1) {
					a.acount += money;
					a.bankAcount += money;
				}
				if (selectAcount == 2) {
					a.acount += money;
					a.bankAcount += money;
				}
			}
			
			
			
			
		} while(true); 
	}
}
