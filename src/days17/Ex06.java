package days17;

import java.io.FileReader;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 2:15:11
 * @subject
 * @content
 * 대문자 소문자 숫자 각 몇개..
 * 막대 그래프로 출력
 * 
 * 가변배열
 */
public class Ex06 {



	public static void main(String[] args) {
		
		String fileName =".\\src\\days17\\Ex01.java";
		try {
			FileReader reader = new FileReader(fileName);
			
			int code;
			while ((code = reader.read()) != -1) {
				System.out.println(code);
				if (Character.isUpperCase( (char)code )) { //대문자인가
					//counts[0][code-'A']; 
				}
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main

}//class
