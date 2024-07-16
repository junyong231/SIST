package days06;

import java.util.Random;

//자동 임포트 : 컨트롤 쉬프트  O

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 2:09:53
 * @subject 완전 깡암기..
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
	
		//챕터 16 람다식
		//챕터 17 스트림 요소 처리
		
		//아래 한 줄 암기
		//int [] m = new Random().ints(1, 101).limit(10).toArray();
		//랜덤 인스턴스.1~100.10개.배열로
		
		//암기		intStream											OptionalInt
		int max = new Random().ints(1, 101).limit(10).max().getAsInt();
		System.out.println(max);
		
		
		
		
		
		
		//Math.random() 말고
		
		//java.util.random 클래스
		
//		Random rnd = new Random(); //랜덤 인스턴스 생성 (스캐너처럼)
//		int kor = rnd.nextInt(101); // 0<= ~ <100
//		int lotto = rnd.nextInt(45)+1; // 1<= ~ <46
		
		
		//rnd.nextBoolean() => true,false
		//rnd.nextInt(); => int 범위 안에서 랜덤값
		//rnd.nextLong(); =>long범위 안에서 랜덤
		
	 

	}//main

}//class
