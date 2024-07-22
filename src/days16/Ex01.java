package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오전 9:17:23
 * @subject 		예외 처리 (Exception Handling)
 * @content	
 * 					1. 프로그램 오류 - 프로그램 오작동 또는 비정상 종료되는 원인
 * 					2. 오류의 발생 시점에 따라
 * 							ㄴ 컴파일 오류  ; 안찍기 등 
 * 							ㄴ 런타임(실행) 오류  int [] m = null ;
 *													  m[0] = 100; //빨간줄 안뜨지만 실행 시 예외 뜸 => 0번째 방 없음
 *									ㄴ 오류(Error) - 메모리 부족, 스택 오버플로우 등 복구 불가능한 심각한 오류
 *									ㄴ 예외(Exception) - 개발자가 수습할 수 있는 비교적 덜 심각한 실행 오류
 *															 ㄴ 모든 예외는 Exception이라는 부모 클래스가 원류임
 *					3. 예외 클래스 상속 계층도
 *								Object 
 *									|
 *							Throwable (인터페이스)
 *								|					|  	
 *					    Exception 				Error
 *					/  				\					ㄴOutOfMemoryError
 *	RuntimeException	 런타임 이외(널포인터 등)
 *
 *					4. 프로그램 실행 시 발생할 수 있는 예기치 못한 예외에 대비한 코드를 작성하는 것 == 예외 처리
 *						- 프로그램의 비정상적인 종료를 막고 정상 상태 유지
 *						- 프로그램이 실행할 때 예외 발생하면 JVM이 "예외처리기(UncaughtExceptionHandler)"가 예외를 받아서 원인 화면에 출력
 *
 *					5. 예외 처리
 *						- try- catch문
 *						- throws문
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int [] m = null ;
		m[0] = 100;
		
		

	}//main

}//class
