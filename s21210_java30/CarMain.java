package s21210_java30;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company 	: "+car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용1");
		System.out.println("car2.company 	: "+car2.company);
		System.out.println("car2..model  	: "+car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용2");
		System.out.println("car3.company 	: "+car3.company);
		System.out.println("car3..model  	: "+car3.model);
		System.out.println("car3.color	 	:"+car3.color);
		System.out.println();
		
		Car car4 = new Car("레이저용","빨강",200);
		System.out.println("car4.company 	: "+car4.company);
		System.out.println("car4..model  	: "+car4.model);
		System.out.println("car4.color	 	:"+car4.color);
		System.out.println("car4.maxSpeed	: "+car4.maxSpeed);
		System.out.println();
	}
}
