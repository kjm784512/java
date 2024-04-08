package s21210_00;

import java.util.Scanner;

public class S21210_03v1 {

   public static void main(String[] args) {
      System.out.print("점수를 입력하세요 >>");
      try (Scanner scanner = new Scanner(System.in)) {
		int score = scanner.nextInt();
		  
		  if (score <= 100 && score >= 90) {
		     System.out.println("당신의 학점은 A입니다.");
		  }
		  else if (score >= 80 && score <= 89) {
		     System.out.println("당신의 학점은 B입니다.");
		  }
		  else if (score >= 70 && score <= 79) {
		     System.out.println("당신의 학점은 C입니다.");
		  }
		  else if (score >= 60 && score <= 69) {
		     System.out.println("당신의 학점은 D입니다.");
		  } else {
		     System.out.println("당신의 학점은 F입니다.");
		  }
	}
      
   }
   }
