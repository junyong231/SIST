package days06;

import java.util.Scanner;


/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 11:04:11
 * @subject 통으로 익히자
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
//if ( one == '#' || one == '@' || one == '$' || one == '!' ) {}
		
		//정규 표현식 유효성 검사.
		Scanner sc = new Scanner(System.in);
		System.out.println("한 문자 입력하시오");
		String strOne = sc.next();
		
		String regex = "[#$%!@]";
		
		/* 되는것들
		 * String regex = [0-9];  //0-9는 \d 와 같다 \를 쓰자
		 * String regex = [A-Z];
		 * String regex = [가=힣];
		 * String regex = [a-zA-Z];
		 * String regex = [aeiouAEIOU];
		 */
		
		System.out.println(strOne.matches(regex)); //불리언 값 리턴.
				
		
		
	}//main

}
