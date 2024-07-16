package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오전 1:36:27
 * @subject
 * @content
 */
public class NewTest02 {

	public static void main(String[] args) {
		//		1. 한 문자를 입력받아서 
		//		   한글입니다.
		//		   알파벳대문자입니다.
		//		   알파벳소문자입니다.
		//		   숫자입니다.
		//		   특수문자입니다.
		//		   라고 출력하기
		//		   ( 특수문자는 #$!%@)

		String st;
		boolean right = false;
		char cha;
		Scanner sc = new Scanner(System.in);

		do {
			if (right) {
				System.out.print("문자는 하나만 입력하세요\n다시 ");
			}
			right = true;
			System.out.print("아무 문자나 하나 입력하세요 ?");
			st = sc.next(); //입력값 받음
			cha = st.charAt(0); //입력값을 스트링에서 문자 배열로 전환
		} while (st.length() > 1);
		
		System.out.println(cha);
		
		String its = "";
		
		if ('0'<=cha && '9'>=cha) {
			its ="숫자";
		} else if('A' <= cha && 'Z' >= cha){
			its= "영어 대문자";
		} else if ('a' <= cha && 'z' >= cha) {
			its = "영어 소문자";
		} else if ('ㄱ' <= cha && '힣' >= cha) {
			its = "한글";
		} else if (cha == '!' || cha == '@' || cha =='#' || cha =='$' || cha == '%') {
			its = "특수문자";
		} else its = "인식불가";
		
		System.out.printf("%c은(는) %s입니다",cha,its);











	}

}
