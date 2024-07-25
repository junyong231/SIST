package days19;

import java.util.HashSet;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 2:07:04
 * @subject Set set
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		//Set - 순서X 중복X HashSet 컬렉션 클래스
		//		  HashSet 컬렉션 클래스
		//		  순서 O + Set = LinkedHashSet 컬렉션 클래스 ***
		
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(11);
		hs.add(15);
		hs.add(10);
		hs.add(10);
		System.out.println( hs ); // 9 10 11 15 | 순서유지,중복 허용이 안되는 모습

	}//main

}//class
