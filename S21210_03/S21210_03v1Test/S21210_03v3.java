package s21210_00;

import java.util.Scanner;

public class S21210_03v3 {

   public static void main(String[] args) {
      
   System.out.print("구구단을 기본으로 몇 단까지 할까요? ");
   try (Scanner scanner = new Scanner(System.in)) {
	int k = scanner.nextInt();
	   
	   for(int i=2; i<=k; i++) {
	      System.out.println(i+" 단입니다.");
	      
	      for(int j=1; j<=9; j++) {
	         System.out.println(i+"*"+j+"="+i*j);
	      }
	      System.out.println("--------------");
	   }
}
   
   }

}
