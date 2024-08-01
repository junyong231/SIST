package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 1.=오전 10:10:27
 * @subject [Stream]
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
	//	 * 1. 데이터 소스( 배열, 컬렉션 , 임의의 수,  파일 등등 )마다 다른 방식으로 데이터를 처리하는 문제점을  해결하기 위해서 만든 것이 "스트림"이다.
	// 데이터 소스(배열 컬렉션 수 파일 등등) 마다 다른 방식으로 데이터 처리하는 문제점 해결하기 위해서 만든 것이 '스트림' (표준화)
		
		String [] arr = { "ddd", "aaa", "ccc", "bbb" };
		//배열이니 원래 입출력 포문쓰고 난리쳤어야함
		
		 ArrayList<String> list = new ArrayList<String>();
         list.add("ddd");
         list.add("aaa");
         list.add("ccc");
         list.add("bbb"); 
         
         //배열 -> 스트림 ?
         Stream<String> s1 =Arrays.stream(arr);
         s1.forEach(System.out::println);
         System.out.println("=".repeat(10));
         //컬렉션 -> 스트림 ?
         Stream<String> s2 = list.stream();
         s2.forEach(System.out::println);
         s2.sorted().forEach(System.out::println);
         

	}//main

}//class
