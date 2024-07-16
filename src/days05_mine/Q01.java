package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 5:32:42
 * @subject
 * @content
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 */
public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어시험 점수를 입력하시오 ? ");
		int kor = sc.nextInt();
		
		
		//String cut = ",";
		String grade ="수,우,미,양,가";
		String [] grades = grade.split(",");
		//System.out.println(grades[2]); //작동확인 ok

		if (kor>100 || kor <0) { 
			System.out.println("잘못된 값입니다");
		} 	else if (kor >= 90) { 
			System.out.println(grades[0]);
					}
			else if (kor >= 80 && kor <=89) {
				System.out.println(grades[1]);
			}
			else if (kor >= 70 && kor <=79) {
				System.out.println(grades[2]);
			}
			else if (kor >= 60 && kor <=69) {
				System.out.println(grades[3]);
			}
			else { 
				System.out.println(grades[4]);
			}
			
		
		
	}//main
	

}//class
