package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오전 11:06:53
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws ParseException {
		/*
		//DecimalFormat
		int money = 3275000; //세자리마다 컴마찍기 3,275,500
		
		//String pattern = "#,###"; // 세자리마다 컴마
		//String pattern = "#,###.##"; // 세자리마다 컴마 + 소수점 2자리까지지만 없어서 안나옴
		//String pattern = "#,###.00"; // 세자리마다 컴마 + 소수점 2자리까지 있든없든 찍는다
		String pattern = "\u00A4#,###.00"; // 세자리마다 컴마 + 소수점 2자리까지 있든없든 찍는다 + 원화 기호
		DecimalFormat df = new DecimalFormat(pattern);
		String ssmoney = df.format(money);
		System.out.println(ssmoney);
		*/
		
		/* 이게 제일 간편하겠지만
		String smoney = String.format("%,d", money);
		System.out.println(smoney);
		*/
		
		String s = "3,123.23"; //이걸 더블로 변환시키려면?
		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		double d = (double) df.parse(s);
		System.out.println(d);
		
		
		
		/*
		double d;
		s = s.replace(",", "");
		System.out.println(s);
		d = Double.parseDouble(s);
		System.out.println(d);
		*/
		//이렇게도 되지만 Decimal포맷 쓰자
		
		
		
		
	}//main

}//class
