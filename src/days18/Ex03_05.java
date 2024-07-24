package days18;

import java.time.LocalDate;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 2:19:18
 * @subject 
 * @content
 *
 */
public class Ex03_05 {

	public static void main(String[] args) {
		//홍길동 생일 99.1.20
		//올해 생일 지났는지
		
		LocalDate hbirth = LocalDate.of(1999, 1, 20);
		LocalDate today = LocalDate.now();
		hbirth =hbirth.withYear(today.getYear());
		System.out.println(hbirth);
		
		System.out.println( today.isEqual(hbirth) ); // == false
		System.out.println( today.isBefore(hbirth) );//  < false
		System.out.println( today.isAfter(hbirth) ); //  > true

		System.out.println( today.compareTo(hbirth) ); // 0 양수 음수

	}//main

}//class
