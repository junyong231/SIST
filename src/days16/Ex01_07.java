package days16;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오전 10:52:48
 * @subject 고의로 예외 발생시키기
 * @content	throw문 사용
 * 					예) 국어점수 입력 받아 반환하는 getScore()
 * 						잘못된 입력 (0~100 벗어남)이면 강제로 예외 발생! 시키기
 *
 */
public class Ex01_07 {

	public static void main(String[] args) {

		int kor;
		try {
			kor = getScore("국어");
			System.out.println(kor);
		} catch (IOException e) {
			
			e.printStackTrace();
		}//메소드에서 걸린 조건 때문에 얘는 예외가 생길 수도 있는 놈이 됨 -> try/catch해서 해결하거나 또 throw해서 또 넘김 == 처리 안함*여기가 main이라서
		
		
		System.out.println(" end ");
		
	}//main

	private static int getScore(String 과목명) throws IOException {// 호출한 곳에서 처리하라
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.printf(">%s 점수 입력 ? ",과목명);
		String input = sc.next();
		String regex = "100|[1-9]?\\d";// 100 이거나 1~9아무거나 있거나 없거나 1개 + 0~9 숫자 1개 ( 100 or 0~99)
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		}else {
			//강제로 예외발생시키기
			//사용자 예외 처리 객체
			throw new IOException("점수 범위 (0~100) 벗어남. ");
		}
	}
	
	
	
}//class
