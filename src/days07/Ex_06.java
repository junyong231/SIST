package days07;

import com.util.Draw2D;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 3:33:39
 * @subject
 * @content
 */
public class Ex_06 {

	public static void main(String[] args) {

		/*
		 * 메소드(함수)
		 * 정의: 프로그래밍에서 "반복되는 명령어들"을 찾아서 별도로 묶어 필요할 때마다 재사용하도록 만든 것
		 * 프로그램의 구조화: 유지,보수 등 관리 용이
		 * 함수가 기본이 되는 프로그래밍 기법: 구조적 프로그래밍
		 * 객체가 기본이 된다면 : 객체 지향적 프로그래밍(OOP)
		 * 함수 선언 형식: [접근지정자] [기타제어자] 리턴자료형 함수명 ([매개변수..]) {
		 * 		//실행문
		 * 		[return 리턴값;]
		 * }
		 */

		Draw2D.drawLine(18);
		System.out.println("부서명 : 사원명");
		Draw2D.drawLine('$', 35);
		System.out.println("영업부 : 이시훈");
		System.out.println("생산부 : 송세호");
		System.out.println("총무부 : 김준석");
		System.out.println("자재부 : 김재민");
		Draw2D.drawLine();
		
		
		
	}//main
	// drawLine() 메서드 선언부분
	 //						public			static		void		drawLine
	/* 함수 선언 형식: [접근지정자]	 [기타제어자]		리턴자료형 	함수명		([매개변수..]) {
		 * 		//실행문
		 * 		[return 리턴값;]
		 * }
	*/
	
	//함수선언 !선언과 호출은 다르다!
	
//	public static void drawLine() {
//		System.out.println("~~~~~~~");//유지 보수도 여기만 조지면 됨
//	}
//	
//	// 오버로딩 overloading = 같은 함수명으로 중복선언 = 중복함수 /매개변수만 달라도 ㅇㅋ
//	public static void drawLine(int length) {
//		for (int i = 1; i < length; i++) {	
//			System.out.print("-");//유지 보수도 여기만 조지면 됨
//		}
//		System.out.println();
//	}
//	//'세'번째 중복함수
//	public static void drawLine(char style, int length) {
//		for (int i = 1; i < length; i++) {	
//			System.out.print(style);//유지 보수도 여기만 조지면 됨
//		}
//		System.out.println();
//	}
	
	
	
}//class
