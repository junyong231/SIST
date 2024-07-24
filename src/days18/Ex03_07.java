package days18;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 2:29:46
 * @subject 미완
 * @content
 *
 */
public class Ex03_07 {

	public static void main(String[] args) {
		//이번 달의 마지막 날짜 몇 일?
		// 이번 달의 마지막 수요일?
		// 이번 달의 첫번쨰 금요일?
		// with() plus() minus() 날짜 수정 메서드 + 계산

		//2. 자주 쓰일만한 날짜들을 계신 대신 해주는 메서드
		// 를 구현해 놓은 클래스 temporalAdjesters


		LocalDate d = LocalDate.now();


		//2
		LocalDate f = LocalDate.now();
		System.out.println(d.lengthOfMonth()); //  그 달의 길이 ==마지막 날

		LocalDate k= LocalDate.now();
		d= d.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(d);

		//Temporal + Adjuster 매서드 정리..
		//시간상의   조정자
		//LocalDate d = LocalDate.now();
		d = d.with( TemporalAdjusters.lastDayOfMonth() );
		System.out.println( d );
		
		/*// 
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 다음 달의 첫 날
		System.out.println( d.with( TemporalAdjusters.firstDayOfNextMonth()  ) );
		// 이번 달의 첫 날  
		System.out.println( d.with( TemporalAdjusters.firstDayOfMonth()  ) );
		// 이번 달의 첫 번째 월요일
		System.out.println( d.with( TemporalAdjusters.firstInMonth(MONDAY)  ) );

		// 지난 주 월요일
		System.out.println( d.with( TemporalAdjusters.previous(MONDAY)  ) );
		System.out.println( d.with( TemporalAdjusters.previousOrSame(MONDAY)    ) ); 
		 */

	}//main

}//class
