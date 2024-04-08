package s21210_00;

import java.util.Scanner;

public class S21210_03v6 {

	public static void main(String[] args) {
		int menu =0;
		int num =0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 월요일이 좋다");
			System.out.println("(2) 수요일이 좋다");
			System.out.println("(3) 목요일이 좋다");
			System.out.println("(4) 금요일이 좋다");
			System.out.println("좋아하는 날을 선택하세요(종료:0)");
			
			String tmp =scanner.nextLine();
	    
	        menu = Integer.parseInt(tmp);
	        if(menu == 0) {
	        	System.out.println("프로그램종료");
	        	break;
	        }else if (!(1<= menu && menu <=4)) {
	        	System.out.println("정확히 입력하세요");
	        	continue;
	        }
	        System.out.println("선택하신 번호는"+menu+"입니다");    
	        break;
	                
			}
		}
	}
