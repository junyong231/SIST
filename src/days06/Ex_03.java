package days06;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 10:43:58
 * @subject
 * @content
 */
public class Ex_03 {

	public static void main(String[] args) {
//		1. 한 문자를 입력받아서 
//		   한글입니다.
//		   알파벳대문자입니다.
//		   알파벳소문자입니다.
//		   숫자입니다.
//		   특수문자입니다.
//		   라고 출력하기
//		   ( 특수문자는 #$!%@)

		Scanner sc = new Scanner(System.in);
		System.out.println("한 문자 입력하시오");
		char one = sc.next().charAt(0); //따로 스트링 선언안해도 되네
		String its = "";
		if ('0'<=one && '9'>=one) {
			its ="숫자";
		} else if('A' <= one && 'Z' >= one){
			its= "영어 대문자";
		} else if ('a' <= one && 'z' >= one) {
			its = "영어 소문자";
		} else if ('ㄱ' <= one && '힣' >= one) {
			its = "한글";
		} else if (one == '!' || one == '@' || one =='#' || one =='$' || one == '%') {
			its = "특수문자";
		} else its = "인식불가";
		
		System.out.printf("%c은(는) %s입니다",one,its);
		
		
	}//main

}
