package days18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 2:45:10
 * @subject
 * @content
 *
 */
public class Ex03_08 {

	public static void main(String[] args) {
		/*
		LocalDate d = LocalDate.now();
		System.out.println(d);
		 */
		
		String pattern = "yyyy년 MM월 24일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String sd = "2024년 07월 24일";
		System.out.println(sd);
		 
		
		String sd2 = "2024-07-24";
		LocalDate d2 = LocalDate.parse(sd2);
		System.out.println(d2);
		 


	}//main

}//class
