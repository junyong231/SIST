package days17;

import java.util.Date;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 3:15:27
 * @subject	날짜 시간 클래스, 형식화 클래스 
 * 						ㄴjdk 1.0 java.util.Date 
 * 						ㄴjdk 1.1 java.util.Calendar (+그레고리안)
 * 						ㄴjdk 1.8 java.tim 패키지 + 하위 패키지 (다양한 날짜 /시간 클래스 추가됨)
 * 					컬렉션 프레임워크
 * 					자바 IO (입출력)
 * 					열거형 제네릭
 * 					람다식 + 스트림
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d);
		
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDay()); //0 일요일~ 6 토요일
		
		
		
		// 1970/1/1 00:00:00~ ms  long형으로 반환 메서드
		//long d.getTime();
		
		Date d2 = new Date(d.getTime());
		System.out.println(d2);
		//롱 형으로도 데이트 만들 수 ㅇ
		
		
	}//main

}//class
