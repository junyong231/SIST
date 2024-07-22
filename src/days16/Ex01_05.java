package days16;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오전 10:37:18
 * @subject
 * @content
 *
 */
public class Ex01_05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			//
//			//
//		} catch (Exception e) {
//
//		} finally {
//			sc.close();
//		}

		//try-resource문  try 뒤에 괄호
		try (Scanner sc = new Scanner(System.in);) {//사용하는 리소스 넣기 - 구문 끝나면 자동으로 닫음
			//이 안에도 try문 올 수 있따
			
		} catch (Exception e) {
			
		}
		
		
	}//main

}//class
