package days02;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오전 11:48:06
 * @subject 상수
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		//ex 이곳에 수학 관련 코드가 있다
		
//		System.out.println(3.141592);
//		System.out.println(3.141592);
//		System.out.println(3.12141592); //오류도 아니고 걍 찐빠 그러니 변수를 쓰는게 안전
//		System.out.println(3.141592);
//		System.out.println(3.141592);

		//실수자료형 PI = 3.141592;  float,double이 있지 특별한 얘기 없으면  double씀
		//Alt + Shift + A
		//double PI = 3.141592;
//		System.out.println(PI);
//		System.out.println(PI);
//		System.out.println(PI);
//		System.out.println(PI);
		
//		PI = 3.12;  이렇게 변하면 다음이 고장남 그러니 상수를 쓰는것이 좋다
		final double PI = 3.141592; // PI 전부 대문자로 선언
		
//		PI= 1; 상수 선언한걸 새로 할당하려니 오류남 
//		Ctrl +F 눌러서 pi를 replaceall로 PI로 해주면 빨리 수정가능
		System.out.println(PI);
		System.out.println(PI);
		System.out.println(PI);
	}//main

}//class
