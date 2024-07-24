package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 12:12:58
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		//날짜만 다루는 클래스
		LocalDate ld = LocalDate.now();
		//System.out.println(ld);
		LocalDate ld2 = LocalDate.of(2024, 7, 24);
		//System.out.println(ld2);
		

		//시간만 다루는
		LocalTime lt = LocalTime.now();
		//System.out.println(lt);
		LocalTime lt2 = LocalTime.of(12,16,32);
		//System.out.println(lt2);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
	}//main

}//class
