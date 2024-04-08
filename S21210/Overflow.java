package s21210_00;


public class Overflow {

   public static void main(String[] args) {
      int var1 = 2147483646;
      for(int i=0; i<5; i++) {
         var1++;
         System.out.println("var1:"+var1);
      }
   }

}
