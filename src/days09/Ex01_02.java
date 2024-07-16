package days09;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Ex01_02 {

	public static void main(String[] args) {
		//1.요일
		//2. 마지막 날짜
		
		//3.Calendar 클래스 사용
		
		Calendar c =Calendar.getInstance();
		c.set(2020,5-1, 1);
		//System.out.println(c);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		int lastDay= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		/*
		Date d =new Date(2022-1900, 7-1, 1);
		System.out.println(d.toLocaleString());
		
		int dayOfWeek = d.getDay();
		System.out.println(dayOfWeek);
		
		
		//날짜 d의 월
		d.setMonth(d.getMonth()+1);
		System.out.println(d.toLocaleString());
		
		d.setDate(d.getDate()-1);
		System.out.println(d.toLocaleString());
		
		
		System.out.println(d.getDate());
		int lastday= d.getDate();
		*/
		
		
	}//main

}//class
