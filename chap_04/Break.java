package chap_04;

public class _10_break {
	public static void main(String[] args) {
		// Break
		// 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		// 손님이 50명이 대기
		
		//for문
		int max =20;
		for (int i = 1; i <50; i++) {
			System.out.println(i+"번 호구 치킨나옴 ㅋ");
			if (i==max) {
				System.out.println("응 너한테 안팔아ㅋ");
				break; //반복문을 탈출한다
			}
		}
		System.out.println("호구 치킨 영업종료");
		System.out.println("======================================");
	
	
	
	int index =1; //손님대기번호
	while(index <=50) {
	System.out.println(index+"번 호구 치킨나옴 ㅋ");
	if (index==max) {
		System.out.println("응 너한테 안팔아ㅋ");
		break;
	
	}index++;

	}
	}
	
}
