package days18;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오전 10:37:31
 * @subject 형식화 클래스 (format)
 * @content	1. SimpleDateFormat
 * 					2.	DecimalFormat
 * 					3.	ChoiceFormat
 * 					4.	MessageFormat
 *
 */
public class Ex02 {

	public static void main(String[] args) throws ParseException {
		//1번
//		Calendar c = Calendar.getInstance();
//		Date d = c.getTime(); //형변환
//		
//		String pattern = "yyyy.MM.dd (E) hh:mm:ss";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String s = sdf.format(d);
//		System.out.println(s);
		
		//2번
//		String s = "2024/07/24";
//		Date d = new Date(s);
//		System.out.println(d.toLocaleString());
		
		String s = "2024.07.24 (수)";
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern) ;
		Date d = sdf.parse(s);
		System.out.println(d.toLocaleString());
		
		
		//Date d  -> Calendar c 변환?
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		
		
		
	}//main

}//class
