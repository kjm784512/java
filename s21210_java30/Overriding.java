package s21210_java30;

public class Overriding {
	
	public static void main(String[] args) {
		OverridingA a= new OverridingA();
		a.cal(8);
		
		OverridingB b= new OverridingB();
		b.cal();
		
		OverridingB bb= new OverridingB();
		bb.cal();
	}
}
