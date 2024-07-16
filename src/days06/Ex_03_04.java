package days06;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 11:23:23
 * @subject
 * @content
 */
public class Ex_03_04 {

	public static void main(String[] args) {
		
		int kor;
		Scanner sc = new Scanner(System.in);
		String strKor; // "0"~"100"일 때 int로 변환해서 kor로 잘못입력:12a 공백 등 잡아내기 match로
		String regex = "\\d{1,2}|100"; //숫자 1자리도 좋고 2자리도 좋음 or 100도 가능 , 공백쓰지마시오
		//[0-9][0-9][0-9]
		//\\d\\d\\d
		//\\d{3}
		//위 셋은 같다 \\d*는 다름
		
		// 세번 틀리면 강종
		int failCount = 0;
		
		do {
			if (failCount != 0) {
				System.out.printf("%d번 실패",failCount);
				if (failCount==3) {
					System.out.printf("\n%d번 실패했으므로 종료",failCount);
					return; //main빠져나감
				}
			}//if
			System.out.println("국어 점수 입력?");
			strKor=sc.next();
			failCount++; //입력 제대로 해도 1증가 어차피 제대로 했으면 다신 볼일없어서 ㄱㅊ
		} while ( !strKor.matches(regex) );
		
		kor = Integer.parseInt(strKor);
		
		System.out.printf("%d점",kor);

		
		
		
		
		
	}//main

}//class
