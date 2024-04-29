package s21210_java30;

public class OverLoad {
	public void cal() {
		System.out.println("인수없음");
	}
	public void cal(int a, int b) {
		System.out.println("인수"+a+"and"+b);
	}
	public void cal(double d) {
		System.out.println("인수"+d);
	}
}
