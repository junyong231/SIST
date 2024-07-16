package days09;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject			정수 2진수로 출력(int)
 * 								8진수
 * 								16진수
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		int n = 10;
		int share, reminder;
		String octal = ""; 
		while (n != 0) {
			share = n/8;
			reminder = n%8;
		//System.out.printf("%d",reminder);
			octal = reminder + octal; // while돌면 "12"됨 
			n=share;			
		}
		octal = "0"+octal;
		System.out.println(octal);

	}//main

}//class
