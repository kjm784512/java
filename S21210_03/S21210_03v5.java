package s21210_00;

import java.util.Scanner;

public class S21210_03v5 {

	public static void main(String[] args) {
		int meun =0;
		int num =0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 월요일이 좋다");
			System.out.println("(2) 수요일이 좋다");
			System.out.println("(3) 목요일이 좋다");
			System.out.println("(4) 금요일이 좋다");
			System.out.println("좋아하는 날을 선택하세요(종료:0)");
			
			String tmp =scanner.nextLine();
	    
	                meun = Integer.parseInt(tmp);
	                
	                switch (meun) {
	                    case 1:
	                        System.out.println("월요일이 좋아요!");
	                        break;
	                    case 2:
	                        System.out.println("수요일이 좋아요!");
	                        break;
	                    case 3:
	                        System.out.println("목요일이 좋아요!");
	                        break;
	                    case 4:
	                        System.out.println("금요일이 좋아요!");
	                        break;
	                    case 0:
	                        System.out.println("프로그램을 종료합니다.");
	                        return;
	                    default:
	                        System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
	                }

			
	        }
		}
	}
