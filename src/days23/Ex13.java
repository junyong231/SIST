package days23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 11:34:52
 * @subject
 * @content
 *
 */
public class Ex13 {

	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)   
		}; 
		/*
		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			String name = s.getName();
			nameList.add(name);
		}
		*/
		
		/*
		//collect (매개변수 : 어떻게 수집할 지(방법)
				
		List<String> names = Stream.of(stuArr).map(Student::getName)
			.collect( Collectors.toList() );
		
		System.out.println(names);
		*/
		
		/*
		// stuArr 배열 -> Stream 생성 -> Student 배열로 다시 변환 ?
		Student [] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
		
		for (int i = 0; i < stuArr2.length; i++) {
			System.out.println(stuArr[i]);
		}
		*/
		
		//stuArr -> Stream 생성 -> Map<key, value> 변환
		Map<String, Student> stuMap = Stream.of(stuArr).collect( Collectors.toMap(s-> s.getName(), p->p)  );		
	// 배열 -> 스트림											key,                    value
		for (String keyName : stuMap.keySet()) {
			System.out.println(keyName);
		}
	
	
	}//main

}//class
