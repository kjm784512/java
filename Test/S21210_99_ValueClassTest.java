package s21210_00;

class Circle{
   int radius;
   String color;
   double calcArea() {
      return 3.14 * radius * radius;
   }
}

public class S21210_99_ValueClassTest {
   public static void main(String[] args)  {
       Circle a;
       a = new Circle();
       a.radius = 100;
       a.color = "Blus";
       double area = a.calcArea();
       System.out.println("a필드색생: "+ a.color +" 원의 면적 = "+area);
       
       Circle b;
       b = new Circle();
       b.radius = 20;
       b.color = "White";
       area = b.calcArea();
       System.out.println("b필드색생: "+ b.color +" 원의 면적 = "+area);
       
       Circle c;
       c = new Circle();
       area = c.calcArea();
       System.out.println("c필드색생: "+ c.color +" 원의 면적 = "+area);
   }
}
