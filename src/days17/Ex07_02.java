package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 3:06:40
 * @subject	정규표현식
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		String source = "HP:010-1234-5678, HOME:02-999-0099";
		String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p =Pattern.compile(regex);
		Matcher m = p.matcher(source);
		
		//matches()
		int no = 1;
		while (m.find()) {
			System.out.printf("%d : %s \t %s \t %s %s\n",no++, m.group(), m.group(1), m.group(2), m.group(3));
		}
		 
		
	}//main

}//class
