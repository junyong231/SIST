package days23;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 11:19:54
 * @subject 최종연산
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) {

		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};


		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		int count = intStream1.reduce(0,(a,b)->a+1 );//요소의 수
		System.out.println(count);
		
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		int sum = intStream2.reduce(0,(a,b)->a+b );//요소의 합
		System.out.println(sum);
		
		
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		//intStream intStream3 = Stream.of(strArr).mapToInt();
		OptionalInt max = intStream3.reduce(Integer::max);
		
		
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);


		
		
		
		
		//Array을 Stream으로 변환(생성)
		//Stream.of(strArr).forEach(System.out::println);

		/*
		boolean result = Stream.of(strArr).noneMatch( s -> s.length() ==0 );
		System.out.println(result);
		 */

		/*
		Optional<String> o1 =  Stream.of(strArr).filter(s -> s.charAt(0) == 's' ).findFirst();
		System.out.println(o1.get());
		 */




	}//main

}//class
