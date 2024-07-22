package days16;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 2:22:24
 * @subject	문자열 다루는 클래스
 * @content	1. String
 * 					2. StringBuffer
 * 					3. StringBuilder
 * 					4. StringTokenizer
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		String name = "홍길동";
		name += "님";
		name += "안녕!!!";
		System.out.println( name );
		
		//String -> 클래스 
		// String name2 = new String("홍길동"); 정석대로면 이게 맞지
		
		//두 문자열 비교 equals() , equalsIgnoreCase()
		
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.substring(1,3));
		System.out.println( name .trim());
		System.out.println("=".repeat(10));
		System.out.println("aBcD".toUpperCase());
		System.out.println("aBcD".toLowerCase());
		char [] nameArr = name.toCharArray();
		System.out.println(Arrays.toString(nameArr));
		String msg = String.format("%s님 %d살","홍길동",20);
		System.out.println(msg);
		
		//두 문자열 비교
		System.out.println(name.compareTo(msg));// 0 음수 양수 나옴		
		System.out.println(name.equals(msg)); //불리언		
		
		//name문자열 속에 "길동" 있는지 유무 체크
		System.out.println(name.contains("길동")); //트루
		System.out.println(name.contains("화"));//폴스
		
		//길동이 몇번째 위치에 있냐 묻기 "홍길동"
		System.out.println(name.indexOf("길동"));//1
		System.out.println(name.indexOf("기무"));//-1
		
		System.out.println(name.lastIndexOf("길동"));//뒤에서부터 찾기 , 못찾으면 -1
		
		
		

	}//main

}//class
