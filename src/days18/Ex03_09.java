package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 3:07:31
 * @subject
 * @content
 *
 */
public class Ex03_09 {

	public static void main(String[] args) {
		//period : 날짜-날짜
		//duration: 시간-시간
		// 예) 수료일 -오늘날짜 - 날짜 간격
		
		LocalDate ed = LocalDate.of(2024, 12, 14);
		LocalDate td = LocalDate.now();
		ed=ed.plusDays(1);
		Period p =Period.between(td, ed); //앞쪽은 포함이고 뒤쪽은 구멍뚫림 따라서 ed = ed.plusDays(1); 하거나 아예 12.15로 잡아야됨
		System.out.println(p); //P4M21D 4달 21일 남았다는 뜻
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
	
		//18시에 퇴근 . 몇시간 남음 *현재시간 3시임
		//시간-시간이니 Duration

		LocalTime et = LocalTime.of(18, 0);
		System.out.println(et);
		LocalTime nt = LocalTime.now();
		System.out.println(nt);
		
		Duration d = Duration.between(nt, et);
		System.out.println(d);//PT2H45M35.9121152S
		System.out.println(d.getNano());
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/60); //남은 분
		System.out.println(d.getSeconds()/60/60); //남은 시간 

	}//main

}//class
