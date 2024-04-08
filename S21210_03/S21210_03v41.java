package s21210_00;

public class S21210_03v41 {

	public static void main(String[] args) {
		int sum =0;
		int i =0;
		while(true) {
			++i;
			sum += i;
			if(sum>100) break;
			System.out.println("i="+i+" sum"+sum);
		}
		System.out.println("_____________");
		System.out.println("i="+i+" sum="+sum);
	}
}
