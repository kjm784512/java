package s21210_java30;

public class Car {

	String company = "우리나라 자동차";
	String model;
	String color;
	int maxSpeed;
	Car(){
	}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
