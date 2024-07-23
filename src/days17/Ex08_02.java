package days17;

import java.util.Date;

import days09.Ex02;

public class Ex08_02 {

	public static void main(String[] args) {
		
		//2020.5 달력만드려면
		//2020.5.1 무슨 요일?
		//2020.5월의 마지막 날짜는?
		
		
		Date may = new Date();
		int year = may.getYear()+1900-4;
		int month = may.getMonth()+1;
		int mod = may.getDay();
		System.out.println("일월화수목금토".charAt(mod));
		
		int lastDay = 0;
        may.setMonth( may.getMonth() + 1 );
        System.out.println(may.toLocaleString());
        may.setDate(  may.getDate() - 1 );
        System.out.println(may.toLocaleString());
		lastDay = may.getDate();
        System.out.println(lastDay);
        //??
		
		
		
		
		

	}//main

}//class
