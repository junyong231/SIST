package days20;

import static days20.Gender.*;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 4:44:16
 * @subject			[ 열거형 ]
 * @content	1. jdk 1.5 추가됨
 *					2. 서로 관련된 상수를 편리하게 사용하기 위한 것.
 *					예) 성별 남/여
 *						int gender = 1/0  boolean gender= true/false char gender= 'm'/'f' 등등 표준화X
 *				
 *						표준화되면 유지보수 생산성 올라감.. 
 *					3. 열거형 선언 형식
 *						접근지정자 enum 열거형이름 {
 *							상수명,  //자바에서 상수는 대문자 쓰는게 국룰.
 *							상수명,
 *								:								
 *						}
 *					4. 열거형이름.상수명  으로 사용한다.
 *					5. 열거형은 컴파일 될 때 클래스로 컴파일된다.
 *							extends java.lang.enum 을 상속받아 컴파일됨.
 *					6. enum클래스
 *							ㄴ ordinal() : 열거형 상수가 정의된 순서 반환
 *							ㄴ	name()	: 열거형 상수명을 문자열로 반환
 *							ㄴ valueOf(): name()과 같으나 일치하는 "열거형 상수" 반환
 *					
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		if (남자) {

		} else {

		}
		 */


		
		System.out.println(Card.CLOVER);//CLOVER
		System.out.println(Card.CLOVER.name());//CLOVER (스트링)
		System.out.println(Card.CLOVER.ordinal());//0

		switch ( Card.valueOf("HEART")) {
		case CLOVER:
			
			break;
		case HEART:
			
			break;
		case DIAMOND:

			break;
		case SPADE:

			break;


		default:
			break;
		}


	}//main

}//class

class Gender {
	public static final boolean 남자 = true;
	public static final boolean 여자 = false;


}

enum Direction {EAST,SOUTH,WEST,NORTH}


