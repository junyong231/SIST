package days05_mine;

import java.util.Iterator;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 4:51:20
 * @subject char[] ,for문 ,String.charAt() 활용 예제
 * @content
 */
public class Ex02_10 {

	public static void main(String[] args) {
		/*
		//char[] 에 한글자씩 끌어와서 배열 만들고 String 다시 변환
		String todo = "Auto-generated method stub";
		//System.out.println(todo.length()); // 문자열의 길이 length()
		char [] todoCharArr = new char[todo.length()];
		
		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);
		}
		System.out.println(todoCharArr);
		
		//다시 스트링으로 합치기 (안좋은 방법)
		String target = "";
		for (int i = 0; i < todoCharArr.length; i++) {
			target += todo.charAt(i);
		}
		System.out.println(target);
		*/
		
		
		//char[] 에 한글자씩 끌어와서 배열 만들고 String 다시 변환
		String todo = "Auto-generated method stub";
		char [] charArr = new char[todo.length()];
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = todo.charAt(i);
		}
		
		System.out.println(charArr);
		
		String a = "";
		for (int i = 0; i < charArr.length; i++) {
			a += charArr[i];
		}
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
