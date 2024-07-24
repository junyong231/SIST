package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 2:25:04
 * @subject
 * @content
 *
 */
public class Ex03_06 {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		
		//datetime -> date | time
		LocalDate d2 = dt.toLocalDate();
		LocalTime t2 = dt.toLocalTime();
		
		//date + time = datetime
		LocalDateTime dt2 = d.atTime(t);
		LocalDateTime dt3 = t.atDate(d);
	}//main

}//class
