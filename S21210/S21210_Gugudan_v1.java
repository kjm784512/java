package s21210_00;

import java.util.Random;
import java.util.Scanner;

public class S21210_Gugudan_v1 {
   public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in);
      int x, y;
      Random r = new Random();
   
      x= Math.abs(r.nextInt() % 9) + 1;
      y= Math.abs(r.nextInt() % 9) + 1;
      int num = x*y;
      
      System.out.println("* 구구단 "+ x + "단에 대한 문제입니다.");
      System.out.print(x+" * "+y+" = " );
      int num2 = scanner.nextInt();
     
      if(num2 == num){
         System.out.println("맞았습니다!");
      }else {
         System.out.println("다시 해");
      }
      
   }
}
