package s21200_02;

import java.util.Scanner;

public class S21210_99_Pizza3 {
   
   int size;
   String type;
   public S21210_99_Pizza3() {
      size = 12;
      type ="슈퍼슈프림";
   }
   public S21210_99_Pizza3(int s, String t) {
      size = s;
      type = t;
      
      if (size >= 25)
      {
    	  size += 2;
    	  type += "+감자칩";
      }
   }
   public static void main(String[] args)  {
	  Scanner scanner = new Scanner(System.in);
	  int sizes =scanner.nextInt();
      S21210_99_Pizza3 obj1 = new S21210_99_Pizza3();
      System.out.println("sizel:"+ obj1.size + " type: "+obj1.type);
      
      S21210_99_Pizza3 obj2 = new S21210_99_Pizza3(sizes, "포테이도");
      System.out.println("size2:"+ obj2.size + " type: "+obj2.type);
      
      
   }
}
