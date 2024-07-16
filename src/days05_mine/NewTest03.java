package days05_mine;

import java.util.Iterator;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오전 1:36:27
 * @subject
 * @content
 */
public class NewTest03 {

	public static void main(String[] args) {
		/*
				2. String str = "hello world!"
				  문자열을 char[] 로 변환하기
				  char []을 다시 String으로 변환하는 코딩하기
		 */
		
		String str = "hello world!";
		char [] chaArr = new char [str.length()];
		
		//1.
//		chaArr = str.toCharArray();
//		System.out.println(chaArr);
//		String str2 =new String(chaArr);
//		System.out.println(str2);

		//2.
//		chaArr = str.toCharArray();
//		System.out.println(chaArr);
//		String str3 = String.valueOf(chaArr);
//		System.out.println(chaArr);
		
		//3.
		String re ="";
		for (int i = 0; i < chaArr.length; i++) {
			chaArr[i] = str.charAt(i) ; 
		}
		System.out.println(chaArr);
		
		for (int i = 0; i < chaArr.length; i++) {
			re += chaArr[i];
		}
		
		System.out.println(re);
		


	}

}
