package days14;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오전 10:04:16
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";   
		
		n.toUpperCase().chars().sorted()
		.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
		m = Stream.of( m.toUpperCase().split("") )
		.sorted()
		.collect(Collectors.joining()); //문자열로 바꿈
		
		
		System.out.println( n.equals(m));
	}//main

}//class
