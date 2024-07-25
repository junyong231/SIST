package days19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex00 {

	public static void main(String[] args) {

		//		2. 현재 날짜와 시간 정보를   LocalDateTime 클래스를 사용해서 
		//	     아래와 같은 형식으로 출력하세요 . ( 5분 )
		//	  [출력형식]
		//	  2023/08/11 금요일   07:02:32.259

		LocalDate kin = LocalDate.now();
		System.out.println(kin);


		//		2-2. String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환시키세요.
		//				  ( 5분 )

		String pattern = "yyyy.MM.dd (금)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String s = "2023.08.11 (금)";	
		System.out.println(s);


		ArrayList team = new ArrayList(5);
		team.add("박준용");
		team.add("김준석");
		team.add("최사랑");
		team.add("원충희");
		team.add("이시훈");
		System.out.println(team);

		team.iterator();
		Iterator ir = team.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}

		System.out.println(team.size());

		System.out.println(team.get(1));
		team.set(1, "홍길동");
		System.out.println(team);


		System.out.println(team.contains("홍길동"));
		team.remove("홍길동");
		System.out.println(team);


		//		4. java.time.LocalDateTime 클래스 사용 ( 10분 )
		//		   1) 설문 시작일 : 23.8.10   9:00:00
		//		   2) 설문 종료일 : 23.8.15  18:00:00
		//		   
		//		   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )

		LocalDateTime st = LocalDateTime.of(2023, 8, 10, 9, 0);
		LocalDateTime ed = LocalDateTime.of(2023, 8, 15, 18, 0);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);


		ArrayList people = new ArrayList(10);
//		people.add(new Person("박준용",30));
//		people.add(new Person("김준용",12));
//		people.add(new Person("소준용",1));
		
//		people.sort(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		

		
		
		Iterator ir2 = people.iterator();
		while (ir2.hasNext()) {
			Person p =  (Person) ir2.next();
			System.out.println(p);
		}
		
		
	}//main


	


}
//@Data //롬복의 힘 미쳤따
//@AllArgsConstructor 
//class Person {
//		String name = "";
//		int age =20;
//	}