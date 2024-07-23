package days17;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 2:36:24
 * @subject	정규표현식 regex..
 * @content	미리 정의된 기호
 * 					문자열 속에서 원하는 패턴(조건)과 일치하는 문자열을 찾아내기 위해서 사용
 * 					boolean String.matched(regex)
 * 					java.util.regex 패키지
 * 						ㄴ Pattern 클래스
 * 						ㄴ Matcher 클래스
 * 
 * 
 * 
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		String [] data = {
				"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
				, "combat", "count", "date", "disc", "fx"
		};

		//1) 배열 안 문자열 중 c로 시작하는 문자열을 찾아서 출력 ?
		/*
		for (int i = 0; i < data.length; i++) {
			if (data[i].charAt(0)=='c') {
				System.out.println(data[i]);
			}
		}
		 */
		/*
		for (int i = 0; i < data.length; i++) {
			if (data[i].startsWith("c")) {
				System.out.println(data[i]);
			}
		}
		 */

		//regex 이용하면

		//		String regex = "c"; c포함이라 원래는 안됨
		String regex = "^c.*"; //첫문자(^) c 이후아무거나(.) 몇개든 ㅇㅋ(*)

		for (int i = 0; i < data.length; i++) {
			if (data[i].matches(regex)) {
				System.out.println(data[i]);
			}
		}

		//String regex ="c.*";
		regex ="c[a-zA-Z]*";
		regex ="c[a-zA-Z0-9]*";
		regex ="c\\w*";  // [a-zA-Z0-9]  == \\w
		regex ="c.";		//아무문자( . )
		regex ="c\\."; //실제 .
		regex ="c[0-9]";
		regex ="c\\d";
		regex ="c.*t"; //더 정확한 정규식 : ^c.*t&  c시작 [아무거나 몇개든] t끝
		regex ="c[^0-9]"; //두 글자인데 두번째 문자는 숫자 아니어야함
		regex ="c\\D";   // [^0-9] == \\D
		regex ="(b|c).{2}"; //b나c 시작이고 뒤에 아무거나 2문자
		regex ="[bc].{2}"; //위와 같음 
		regex ="[bcd].{2,3}";
		regex ="[b-d].{2,3}";//위와 같음
		// bcd 문자는 제외한 알파벳 대소문자
		regex ="[A-Za-z&&[^b-d]].*";  // *  0개 이상 
		regex ="[A-Za-z&&[^b-d]].+";  // *  1개 이상 
		regex ="[A-Za-z&&[^b-d]].?";  // ?  0,1

		regex ="c[a-zA-Z]*";
		Pattern p = Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) { 
				System.out.println( data[i] );
			}
		}
		
		
	}//main

}//class
