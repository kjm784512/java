package chap_06;

public class _03_Return {

	public static String getPhoneNumber() {
		String phoneNumber = "010-3502-6815";
		return phoneNumber;
	}
	
	public static String getAddress() {
		return "서울시 강남구";
	}
	
	public static String getActivity() {
		return "볼링장, 탁구장, 노래방, 사우나";
	}
	public static void main(String[] args) {
		
		String phoneNumber = getPhoneNumber();
		System.out.println(phoneNumber);
		
		String address = getAddress();
		System.out.println(address);
		
		System.out.println(getActivity());
	
	}
	
	
	
}
