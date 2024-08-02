package days23;

import java.util.Optional;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 10:51:54
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		/*
		Optional<String> o1 = Optional.of("abcde"); //결과물로 받는다고 생각
		Optional<Integer> o2 = o1.map( String::length);
		System.out.println( o1.get());
		System.out.println( o2.get());
		*/
		
		/*
		int i = Optional
			.of("123")//문자열 123
			.filter(x->x.length()>0)
			.map( Integer::parseInt )
			.get();
		
		System.out.println(i);//숫자 123
		*/
		
		int i  = Optional.of("").filter(x -> x.length()>0) //null
			.map(Integer::parseInt)
			.orElse(-1); //null이면 -1
		
		System.out.println(i);
		
	}//main

}//class
