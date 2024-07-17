package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오전 10:43:11
 * @subject	멤버(필드,메서드,생성자) 앞의 접근지정자
 * @content	public				패키지 내,외부 어디서나 참조 가능
 * 					package(default)	패키지 내부에서만 참조 가능
 * 					private				클래스 내부에서만 참조 가능
 * 					protected			==package(default) +[상속]
																			패키지 외부라도 상속관계가 있다면 참조 가능
 * 퍼블릭>프로텍티드> 패키지>프라이빗
 */
public class Ex02 {

	public static void main(String[] args) {
		
		//public int age = 20;	// 오류 ㅣ 지역변수는 접근지정자 사용할 수 없다
		
		//Time.java
		
		//패키지 외부 - time
		//패키지 내부 - time field체크
		Time t = new Time(); //객체 생성
		t.privateTest(); //가능
		//t.test(); 불가능
		t.pack(); //가능 (패키지)
		/*
		t.hour
		t.minute
		t.second
		t.privateTest()
		이것들 가능 
		*/
		
	}//main

}//class
