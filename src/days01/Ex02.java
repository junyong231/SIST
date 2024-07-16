package days01;

//Alt + Shift + J
/**
 * @author JUNYONG
 * @date 2024. 7. 1. -오후 4:09:25
 * @subject 수업 1일차 3번째 예제
 * @content 자바 프로그램의 기본 구조 설명
 * 					자바 클래스 선언 형식 설명
 * 					자바 메소드 (함수) 선언 형식 설명
 */


public class Ex02 {
		// 1) 기능? 프로그램의 시작/종료
	    // 2) 매개변수?  String[] args 아직 진도 못뺌
	    // 3) 리턴값은 없기 때문에 리턴 자료형 void (없다는 뜻)
	
	public static void main(String[] args) {
		/*
		   [ 1. 자바 프로그램의 기본 구조 설명 ]
		   1) 프로그램을 시작하는 물건(Class,객체)필요 = 시작 개체
		   2) 프로그램을 시작하는 기능(메소드, 함수)이 구현되어 있어야 함
		       =main, method
		       
		       
		   [ 2. 자바 클래스를 선언하는 방법 ] 암기
		   [접근지정자] [기타제어자] class(=예약어) 클래스명 {
		        // {} 클래스 몸체, 블럭, 영역
		   }
		  
		   [ 3. 자바 메소드(함수 == 기능) 선언 형식 설명 ]
		     public static void main(String[] args)
		     [접근지정자] [기타제어자] 리턴자료형 메소드명 ([매개 변수...여러개 가능]) {
		     //
			 //
			   [return 리턴값;]
		     }
		     
		     *****중요))  메소드(기능,일) 3가지 파악
		     1)기능(일) 파악  EX)메인 메소드의 기능 ==프로그램 시작과 종료 기능  -담배 심부름
		     2)매개변수 파악  - 담배이름(사 올) 담뱃값
		     3)리턴값 파악 - 담배
		 */
			
			// [예] 벽에 시계를 걸기 원함(해야하는일) 
			//			- 필요한 물건: 망치(객체 클래스), 못
			//본인의 이름을 출력하는 코드
			//콘솔창에 출력할 수 있는 물건(클래스) : 'S'ystem클래스(첫글자 대문자 무조건 클래스)
			//String[] 여기도 대문자니까 클래스임 ㄷㄷ
			// System이란 망치에서 못 빼는(출력하는)부분 out
			// 망치.못치는부분.망치질하다(못); == System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 System.out.println("박준용");
			 //문자의 나열: 문자열 "" 쌍따옴표를 붙이기로 약속
			 //문자: '' 홑따옴표를 붙이기로 약속

	}//main

}//Ex02 class

/* 이클립스 단축키
 *  컨트롤 + /        주석,해제
 *  알트 + 쉬프트 + J       타입에 맞는 주석처리 (암데나 써버리면 다르게 나올지도)  
 *  컨트롤 + F11       실행
 * F11          디버깅
 * 컨트롤 + 스페이스      자동완성
 * 컨트롤 + S        저장
 * 컨트롤 + 쉬프트 + L          단축키 목록
 * 컨트롤 + 알트 + 방향키(위아래)        같은 코드 복붙 계속됨
 */

//jdk 야구장(그라운드,심판,배트,공,멤버 등 모든환경) 자바 개발에 필요한 실행파일(JRE포함)
//jre 자바 실행에 필요한 환경(JVM, 클래스 라이브러리 포함)   
//jvm 가상머신(엔진) - 운영체제에 맞게 실행
