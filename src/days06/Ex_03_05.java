package days06;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 11:49:33
 * @subject
 * @content
 */
public class Ex_03_05 {

	public static void main(String[] args) {
		//정규표현식 사용해서 풀이
		//문제) 주민등록번호 14자리를 입력받아서 옳바른 주민등록번호인지 체크
		//문제2) 우편번호 {3}-{4} | {5}
		
//쌤 코드
		String [] rrnArr = {
	            "123456-1234567"
	            , "123456-123456"
	            , "123456-12345678"
	            , "123a56-12#4567"
	            , "1234561234567"
	      };

	      String regex = "\\d{6}-\\d{7}";

	      /* 이렇게 할 필요없이 for문 돌리기
	      System.out.println(rrnArr[0].matches(regex) );
	      System.out.println(rrnArr[1].matches(regex) );
	      System.out.println(rrnArr[2].matches(regex) );
	      System.out.println(rrnArr[3].matches(regex) );
	      */
	      for (int i = 0; i < rrnArr.length; i++) {
	         System.out.printf("%s - %b\n",
	               rrnArr[i],rrnArr[i].matches(regex) );
	      }
		
	      System.out.println();

	      //우편번호
	  	String []  zipcodeArr = {
	            "123-1234"
	            , "1234-123"
	            , "12-12348"
	            , "123a56-12#4567"
	            , "1234561234567"
	      };

	      String zip_regex = "\\d{3}-\\d{4}|\\d{5}";

	      /* 이렇게 할 필요없이 for문 돌리기
	      System.out.println(rrnArr[0].matches(regex) );
	      System.out.println(rrnArr[1].matches(regex) );
	      System.out.println(rrnArr[2].matches(regex) );
	      System.out.println(rrnArr[3].matches(regex) );
	      */
	      for (int i = 0; i < rrnArr.length; i++) {
	         System.out.printf("%s - %b\n",
	        		 zipcodeArr[i],zipcodeArr[i].matches(zip_regex) );
	      }
	      
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력하세요");
		String juminInput = sc.next();
		String juminRegex = "\\d{6}-\\d{7}";
		if (juminInput.matches(juminRegex)) {
			System.out.printf("%s는 옳은 주민번호 형식입니다",juminInput);
		} else System.out.println("ㄴㄴ");
		
		
		System.out.println("\n우편번호 입력하세요");
		String postInput = sc.next();
		String postRegex = "\\d{3}-\\d{4}|\\d{5}";
		if (postInput.matches(postRegex)) {
			System.out.printf("%s는 옳은 우편번호 형식입니다",postInput);
		} else System.out.println("ㄴㄴ");
		
		
	}//main

}//class
