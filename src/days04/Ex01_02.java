package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//자동 임포트 Ctrl Shift O

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 10:21:59
 * @subject buffered써서 복습 풀기
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String name;
		byte age;
		char grade;

		System.out.print("이름 입력하세요 ?");
		name = bufferedReader.readLine();
		System.out.print("나이 입력하세요 ?");
		// String -> byte 타입변환
		age = Byte.parseByte(bufferedReader.readLine());
		// cast 연산자로 타입변환 - 숫자타입, 클래스 간의 형변환
		// age = (byte)bufferedReader.readLine() ;
		System.out.print("등급 입력하세요 ?");
		// String -> char
		// A 식별자
		// "A" 문자열 = 'A'+'\0'
		// 'A' 문자
		/*
		 * String strGrade = bufferedReader.readLine(); // "A널" grade =
		 * strGrade.charAt(0);
		 */
		grade = bufferedReader.readLine().charAt(0);

		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'", name, age, grade);

	}

}
