package days18;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오전 10:15:11
 * @subject 달력 시즌 2_2
 * @content 
 * 	저번엔 DATE 사용했지만 이번엔 CALENDAR 써보자
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		int year =2024;
		int month = 7;
		int date =1;


		//0(일요일)~6(토)
		int dayOfWeek =getDayOfWeek2(year, month);
		int lastDay = getLastDay2(year,month);


		//24.6.30(시작날짜)~ 42일간을 출력한다 // 시작날짜란 달력한장에 (이전꺼여도) 보이는 부분 말함
		Calendar start = new GregorianCalendar(year, month-1 , 1);
	
		start.add( Calendar.DATE, -dayOfWeek); //7월 1일은 월요일(1)이고 시작점은 6.30이므로 요일(1)만큼 빼주면 시작점나옴 
		//start.setDate(start.getDate()-dayOfWeek); 위와 같음
		//Date <-> Calendar 형변환 가능함
		Date sd = start.getTime(); //형변환
		
		System.out.println("=".repeat(30));
		System.out.println("=".repeat(30));
		for (int i = 1; i <=42; i++) {
			//System.out.println( start.toLocaleString() );
			int cmonth = start.get(Calendar.MONTH)+1; // 스타트는 6월이니까 5찍히고 1 더해줘야 6이 제대로 찍힘
			if(  cmonth == month+1 ) System.out.printf("[%d]\t", start.get(Calendar.DATE));
			else if(  cmonth == month-1 ) System.out.printf("(%d)\t",  start.get(Calendar.DATE));
			else System.out.printf("%d\t", start.get(Calendar.DATE));
			if( i%7==0) System.out.println();
			start.add( Calendar.DATE, 1 );

		}


	}//main
	/*
	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month-1,1);
		d.setMonth( d.getMonth() + 1 );
		d.setDate(  d.getDate() - 1 );

		return d.getDate();
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay();
	}
	 */
	private static int getDayOfWeek2(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1 , 1);
		return c.get(Calendar.DAY_OF_WEEK)-1 ;
	}

	private static int getLastDay2(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		int lastDay2=(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return lastDay2;
	}
}//class

