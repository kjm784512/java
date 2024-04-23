package s21210_java70;

class Tv{
   //Tv의 속성(멤버변수)
   int channel; //채널
   // Tv기능(매서드)
   void channelUp() {++channel;}     //Tv 채널 높이는 기능
   void channelDown() {--channel;}   //Tv 채널 낮추는 기능
   
}
class SmartTv extends Tv{
   boolean caption = true;
   void displayCaption(String text) {
      if(caption) {
         System.out.println(text);
      }
   }
}

public class S21210_70 {

   public static void main(String[] args) {
      SmartTv sTv = new SmartTv();
      
      sTv.channel = 10;  //조상 클래스로부터 상속받은 멤버
      sTv.channelUp();   //조상 클래스로부터 상속받은 멤버
      System.out.println(sTv.channel);
      sTv.displayCaption("2학년 12반 전체");
      //sTv.caption = false;
      sTv.displayCaption("2학년 12반 사랑한다 친구야~");
      
   }

}
