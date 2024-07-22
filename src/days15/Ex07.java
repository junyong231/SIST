package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 2:47:03
 * @subject [ 인터페이스 ]
 * @content 1. 자바 자료형임 (참조타입: 배열, 클래스 , '인터페이스')
 * 				   2. 일종의 추상 클래스.
 *				   3. 필드 선언X 일반 메서드 선언 X
 *				   	   상수만 선언 / 추상 메서드만 선언
 *					- jdk 1.8부터 static,default 메서드 추가..
 *			       4. 추상 클래스	 - 미완성 설계도				-> 구현한 자식 클래스들부터 객체 생성o
 *					   인터페이스  - 기본 설계도 (밑그림) 	-> 구현한 자식클래스부터 객체 생성o
 *						: 그 자체만으로 사용된다기 보다는 다른 클래스를 작성하는데 도움을 주는 목적으로 사용됨.
 *				   5. 인터페이스의 선언 형식 
 *						[ public or default ]interface [인-대문자]터페이스명
 *				   6. 인터페이스 안의 모든 멤버는 public static final이 붙음 // 추상 메서드는 안붙여도 public abstract  [둘 다 생략가능]
 *				   7. 인터페이스 끼리 상속이 가능하다 (extends 사용)
 *				   8. 인터페이스를 사용하면 <다중 상속>이 가능함
 *				   9. 클래스  implements 인터페이스 
 *								 구현한
 *				   10. 인터페이스의 장점
 *							1. 개발 시간 단축 (순서대로 개발하지 않아도 됨- 구현 안된 메서드도 호출 가능)
 *							2. 표준화 가능 (누가해도 적용 가능)
 *							3. 서로 관계 없는 클래스들일지라도 관계를 맺어줄 수 있다..(탱크랑 scv 원랜 관계없으나 리페어블로 묶임) //인터페이스 매개변수 다형성..
 *							4. 독립적인 프로그래밍이 가능하다.
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		

	}//main

}//class