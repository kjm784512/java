package s21210_00;


public class S21210_01v2 {

   public static void main(String[] args) {
      
      float var1=3.14f;
      double var2=3.14;
      
      float var3 = 0.1234567890123456789f;	// 7자리 유효
      double var4=0.1234567890123456789;	//15자리 유효
      
      double var5 = 3e6;
      float var6 = 3e6f;
      double var7 = 2e-3;
      
      System.out.println("var1: "+var1);
      System.out.println("var2: "+var2);
      System.out.println("var3: "+var3);
      System.out.println("var4: "+var4);
      System.out.println("var5: "+var5);
      System.out.println("var6: "+var6);
      System.out.println("var7: "+var7);
   }

}
