package s21210_java90;

public class S21210_wrapper_01 {

	public static void main(String[] args) {
		//기본박싱
		System.out.println("--기본방식 및 언박싱----------");
		Integer is1 = new Integer(127);
		Integer is2 = new Integer("127");
		//언박싱
		int si1 = is1.intValue();
		int si2 = is2.intValue();
		
		System.out.println("기본박싱is1: "+is1+"언박싱si1"+si1);
		System.out.println("기본박싱is2: "+is2+"언박싱si2"+si2);
		
		
		System.out.println("기본is1:"+System.identityHashCode(is1)+"언박:"+System.identityHashCode(is1));
		System.out.println("기본is2:"+System.identityHashCode(is2)+"언박:"+System.identityHashCode(is2));
	}
}
