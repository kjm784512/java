package chap_04;

public class _11_Continue {
	public static void main(String[] args) {
		// Continue
		
		// 치킨 주문 손님중에 노쇼 손님이 있다고 가정
		int max =20; // 최대 치킨 판매 수량
		int sold =0; // 현재 치킨 판매 수량
		int noshow =17; // 대기번호 17번이 노쇼
		for (int i = 1; i <=50; i++) {
			System.out.println(i+"번 호구 손님 주문하신 호구 치킨 나왔습니다");
			
			// 손놈이 없다면
			 if (i == noshow){
				 System.out.println(i +"번 호구 손님 마음에 들지 않아 다음 손님에게 호구치킨의 기회가 넘어갑니다");
				 continue;
			 }
			 
			 sold++; // 판매 처리
			 if (sold == max) {
				System.out.println("호구 치킨 재료가 모두 소진 되었습니다");
				break;
			}
		}
	}
}
