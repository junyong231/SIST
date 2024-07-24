package days18;

import java.text.ChoiceFormat;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오전 11:21:23
 * @subject	ChoiceFormat 형식화 클래스
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		//1. 특정 범위에 속하는 값을 문자열로 변환해준다
		//2. 불연속적인 범위의 값을 처리하는 데 if/switch 이놈들 대신 처리할 수 있음
		// EX) 입력받은 국어 점수 따라서 수우미양가
/*
		String newPattern = "0#가|60#양|70#미|80#우|90#수"; //1<=가<60   60<=양<70..
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		int [] kors = {99, 30, 89, 77, 62}; 
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d (%s)이다.\n",kors[i],cf.format(kors[i]));
		}
		*/
		
		
		
		// 특정 범위
		double [] limits  = {0, 60, 70, 80, 90};
		// 문자열
		String [] formats = { "가","양", "미", "우", "수"};

		ChoiceFormat cf2 = new ChoiceFormat(limits,formats);
		int [] kors2 = {99, 30, 89, 77, 62}; 
		for (int i = 0; i < kors2.length; i++) {
			System.out.printf("%d (%s)이다.\n",kors2[i],cf2.format(kors2[i]));
		}
		

	}//main

}//class
