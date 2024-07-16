package days05_mine;

import java.util.Iterator;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 4:51:20
 * @subject char[] ,for문 ,String.charAt() 활용 예제
 * @content
 */
public class Ex02_10_02 {

	public static void main(String[] args) {

		String todo = "Auto-generated method stub";
		char [] todoCharArr = todo.toCharArray(); //걍 메소드가 있네;
		//다시 스트링으로
		
		String target = new String(todoCharArr);
		System.out.println(target);
		
		String target2 = String.valueOf(todoCharArr);
		System.out.println(target2);
		//찾아보면 다 있따
		
	}//main

}//class
