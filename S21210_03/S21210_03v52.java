package s21210_00;

import java.util.Scanner;

public class S21210_03v52 {

	public static void main(String[] args) {
		String[] s_day;			//배열 선언(배열을 다루기 위한 참조 변수 선언)
		s_day = new String[5];	//배열 생성(실제 저장 공간을 생성)
		
		//생성된 배열 변수에 값을 설정
		s_day[0] = "(1) 월요일이 좋다";
		s_day[1] = "(2) 월요일이 좋다";
		s_day[2] = "(3) 월요일이 좋다";
		s_day[3] = "(4) 월요일이 좋다";
		s_day[4] = "(5) 월요일이 좋다";
		int menu;
				
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
	         for(int i=0; i < s_day.length; i++) {	//배열의 길이(저장 공간 수)
	            System.out.println(s_day[i]);
	         }
	         
	         System.out.println("좋아하는 날을 선택합니다 (종료:0)");
	         menu = scan.nextInt();	//램퍼(wrapper) 클래스를 이용하여 리턴
	         if (menu == 0) {
	            System.out.println("프로그램을 종료합니다");
	            break;
	         }   else if (!(1<= menu && menu <=5)) {
	            System.out.println("정확히 입력하세요");
	            continue;
	         }
	         System.out.println("선택하신 것은");
	         System.out.println("'"+ s_day[menu-1] + "' 입니다");
	         //break
	      }
		}
	}

