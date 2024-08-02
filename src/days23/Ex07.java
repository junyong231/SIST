package days23;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 9:02:27
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		
		
		Stream<Student> s = Stream.of( 
				new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
                );

		
		//												메서드 참조
		s.sorted( Comparator.comparing(Student::getBan) //1차: 반으로 정렬
		.thenComparing( Comparator.naturalOrder() ))	  //2차: 기본 정렬
		.forEach(System.out::println);
		System.out.println(s);
		
		
	}//main

}//class

class Student implements Comparable<Student> {
	   String name;
	   int ban;
	   int totalScore;

	   Student(String name, int ban, int totalScore) { 
	      this.name =name;
	      this.ban =ban;
	      this.totalScore =totalScore;
	   }

	   @Override
	   public String toString() { 
	       return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	   }
//게터
	   String getName()     { return name;}
	   int getBan()         { return ban;}
	   int getTotalScore()  { return totalScore;}

	   // 총점 내림차순을 기본 정렬로 한다.
	   @Override
	   public int compareTo(Student s) { 
	      return s.totalScore - this.totalScore;
	   }
	}
