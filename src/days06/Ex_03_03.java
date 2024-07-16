package days06;

import java.util.Scanner;


/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 11:19:48
 * @subject 정규표현식
 * @content
 */
public class Ex_03_03 {

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
		String strOne = sc.next(); 
		String its = "";
		if (strOne.matches("[\\d]")) {
			its ="숫자";
		} else if(strOne.matches("[A-Z]")){
			its= "영어 대문자";
		} else if (strOne.matches("[a-z]")) {
			its = "영어 소문자";
		} else if (strOne.matches("[가-힣]")) {
			its = "한글";
		} else if (strOne.matches("[!@#$%]")) {
			its = "특수문자";
		} else its = "인식불가";
		
		System.out.printf("%s은(는) %s입니다",strOne,its);
		
		
	}//main

}
