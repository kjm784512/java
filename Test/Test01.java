package s21210_00;


public class Test01 {

   public static void main(String[] args) {

	   int intValue =10;
	   byte byteValue = (byte) intValue;
	   
	   intValue = 65;
	   char charValue = (char) intValue;
	   System.out.println("charValue : " +charValue);
	   
	   double doubleValue = 3.14;
	   intValue = (int)doubleValue;
	   System.out.println("intvalue : "+intValue);

	   int intValuet =10;
	   double douValue =5.7;
	   int result = intValuet + (int) douValue;
	   System.out.println("result : "+result);
   }

}
