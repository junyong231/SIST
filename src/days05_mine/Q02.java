package days05_mine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 4. - 오후 10:32:44
 * @subject
 * @content
 *[문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 */
public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("국어 점수 입력하시오 >");
		int kor = Integer.parseInt(br.readLine()); 
		
		/*
		String grade = "수 우 미 양 가";
		//String [] grades = grade.split("\\s*"); 띄어쓰기가 0개 일 때에도 나눈다. 공백도 문자열에 들어가버림
		String [] grades = grade.split("\\s");
		//System.out.println(grades[2]); 
		//스트링쓰면 객체쓰는거라 시간 엄청 걸림
		*/
		
		char grade;
		switch (kor/10) {
		case 10:	case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
			break;
		}
		System.out.printf("당신의 성적은 %c", grade);
		
		

	}//main

}//class
