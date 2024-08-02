package days23;

import java.io.File;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 9:26:56
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//클래스 배열 초기화
		File [] fileArr = {
				new File("Ex1.java"), 
				new File("Ex1.bak"),             
				new File("Ex2.java"), 
				new File("Ex1"), 
				new File("Ex1.txt")

		};

		Stream<File>s = Stream.of(fileArr);  //스트림 객체 생성
		//map() 스트림의 요소를 변환 
		Stream<String> s2= s.map(File::getName);
		s2.forEach(System.out::println);
		//메서드 참조를 이해하면 코딩이 간단해진다.!
		
		Stream<File> fs = Stream.of(fileArr);
		fs.map(File::getName)
			.filter( fs2 -> fs2.indexOf('.') != -1 )		//확장자 없는 파일명은 제외
			.map(fs2 -> fs2.substring(fs2.indexOf('.')+1) ) //확장자만 추출
			.distinct() //중복제거
			.forEach(System.out::println);
		
	}//main

}//class
