package days02;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오전 11:03:26
 * @subject 변수
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//자바 문자열        "" 

		// 문자(char)       ''
		System.out.println("박준용");
		
		
		// [변수와 상수]
		//본인 이름 저장할 [변수 선언 형식] :   타입(자료형) 변수명 = [초기값] ;
		//자바 식별자 - 내가 지은 것들 (규칙은 있음);
		
		String firstName ; //선언
		firstName = "초기화";
		//우항의 값을 좌항 메모리(firstName)에 할당시킨다
		System.out.println(firstName); 
		
		
		
		//String firstName = "박준용2";
		//Duplicate local variable firstName (에러) _ 지역변수 firstName이 중복선언 되었다.
		
		firstName = "박준용2"; //새로운 데이터로 덮어씌워짐
		System.out.println(firstName);
	}

}
