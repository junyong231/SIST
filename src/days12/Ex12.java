package days12;

import days13.Time;
//Time이 package 였다면(디폴트) 이거 빨간줄 뜬다

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오전 10:51:23
 * @subject days13의 Time클래스 접근지정자 시험해보기
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) {

		Time t = new Time(); //객체 생성
		// t. 찍으면 hour이랑 메소드만 뜸 (퍼블릭)
		 
		t.privateTest(); 
		//퍼블릭인 메소드 통해서 private인 millisecond도 호출 가능
		//t.pack() 불가능(패키지)
	}//main

}//class
