package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 2:25:50
 * @subject [접근지정자] 설명
 * @content 	클래스 선언
 * 					1) public - 패키지 내 외부 어디서든 상속과 참조 가능
 * 					2) package( default) - 패키지 내부에서만 상속과 참조 가능
 * 					
 * 
 * 					비활성화 (선택x)
 * 						독립적인 클래스 선언할 때는 사용 x
 * 						중첩 클래스 안에서 사용할 수 있는 접근지정자
 * 					3) protected
 * 							- package 접근지정자 + 패키지 외부에는 상속만 가능
 * 					4) private
 * 							-같은 파일 내에서만 상속, 참조 가능
 * 
 * 					멤버들(필드,메서드) 선언	 (의미 다름)
 *							public
 *							protected
 *							package
 *							private
 *
 *				 	[기타제어자] 다음 기회에...
 *						1. 클래스 앞에...
 *							ㄱ.abstract 추상클래스
 *							ㄴ.final 최종클래스
 *							ㄷ. static 비활성화 X
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		

	}//main

}//class
	class Member {
		
		private class Address {
			
		}
		
	}
	//퍼블릭 붙였더니 The public type Member must be defined in its own file
