package days07;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 12:27:10
 * @subject
 * @content
 */
public class Ex_03_02 {

	public static void main(String[] args) {
		//주민번호
		String rrn = "630212-1402221";
		//뒷자리 숨겨서 출력
		String regex = "-";

		String [] rrnArr = rrn.split(regex);


		System.out.println(Arrays.toString(rrnArr));

		//		rrnArr[1] ="*******";
		//		System.out.printf("%s-%s",rrnArr[0],rrnArr[1]);

		String printArr = String.join("-", rrnArr);
		System.out.println(printArr);

		//뒷자리 첫자리는 공개?

		// 830412-1******
		// 1. 풀이
		/*
	       String [] rrnArr = rrn.split("-");
	       char gender = rrnArr[1].charAt(0); //성별 숫자 뽑기(뒷번호의 첫자리)
	       String printRrn = rrnArr[0]+"-"+ gender + "******";
	       System.out.println( printRrn );
		 */

		// 2. 풀이
		/*
	       char [] rrnCharArr = rrn.toCharArray();
	       System.out.println( Arrays.toString(rrnCharArr));
	       for (int i = 8; i < rrnCharArr.length; i++) {
	         rrnCharArr[i] = '*';
	      }
	       System.out.println( Arrays.toString(rrnCharArr));
	       // char [] -> String
	       String printRrn = new String(rrnCharArr);
	       System.out.println( printRrn );
		 */

		// 3. 풀이 //부분문자열
		//String rrn = "630212-1402221";
		
		
		//예시
		String strYear = rrn.substring(0, 2); // 0<=x<2
		String strMonth = rrn.substring(2, 4);
		String strDay = rrn.substring(4, 6);
		String strGender = rrn.substring(7, 8);
		System.out.println( strYear );
		System.out.println( strMonth );
		System.out.println( strDay );
		System.out.println( strGender );

		System.out.println(rrn.substring(0, 8) + "******" ); //성별숫자 인덱스까지만 프린트하고 *출력



	}//main

}//class
