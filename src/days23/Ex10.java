package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 10:12:18
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"abc", "def", "jkl"},
				new String[]{"ABC", "GHI", "JKL"}
				);
		
		
		//Stream<Stream<String>> s2 = strArrStrm.map(Arrays::stream); // 이건 마치 2차원 배열..  (스트링 스트림을 스트림으로 만듬 뭔말알?)
																																//스트림 [ 스트림(스트링), 스트림(스트링)] 상태
		// 만약 "ABC" 접근하려면 요소(스트링 배열 2번쨰꺼) 접근 -> 요소의 요소 접근 해야하므로 불편
		// flatmap을 쓰면?
		
		Stream<String> s2 = strArrStrm.flatMap(Arrays::stream); //1차원 배열처럼 됨 스트림[스트링 * 6개]
		s2.map(String::toLowerCase).forEach(System.out::println);
		
		
		
		
	}//main

}//class
