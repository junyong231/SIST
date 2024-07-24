package days18;

import java.text.MessageFormat;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오전 11:31:14
 * @subject SDF, DF, CF
 * @content 메세지 형식화 클래스 MessageFormat
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		//데이터 -> 특정 형식으로 출력.
		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';

		//이름:%s, 나이:%d살, 성별:%s, 키:%.2f 등급:%c입니다   ::출력?  printf하면됨
		
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3} 등급:{4}입니다"; 
		//MessageFormat mf = new MessageFormat(pattern);
		//String s = mf.format(pattern, name, age, gender?"남자":"여자",height,grade);
		String s = MessageFormat.format(pattern, name, age, gender?"남자":"여자",height,grade);
		System.out.println(s);

	}//main

}//class
