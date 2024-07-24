package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 2:05:00
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//String 불변.
		String a = "xyz";
		String b = a.replace('y','와');
		System.out.println(a);
		System.out.println(b);
		
		//java.time 핵심클래스 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		ld.withYear(2020); //ld = 을 해주지 않으면 불변임
		System.out.println(ld);//2024
		
		ld = ld.with(ChronoField.YEAR, 2020); //바뀜
		System.out.println(ld);//2020
		
		//월 12 수정
		
		ld = ld.withMonth(5); //5월됨
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 12);//다시 12월됨
		System.out.println(ld);
		
		// 5달 빼기
		
		ld = ld.minusMonths(5);
		System.out.println(ld);
		ld =ld.plusMonths(6);//7월 + 6개월
		System.out.println(ld);//연도도 넘어가네 신기
		
		//truncatedTo 절삭하다 끝을 잘라내다.
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		lt = lt.truncatedTo(ChronoUnit.MINUTES); //분 밑으로 다 버림
		System.out.println(lt);
		
		//날짜 + 시간
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);

	}//main

}//class
