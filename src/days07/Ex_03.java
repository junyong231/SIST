package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 12:07:46
 * @subject 제어문  +  배열 활용
 * @content
 */
public class Ex_03 {

	public static void main(String[] args) {
		
		 //신용카드
		String card = "7655-8988-9234-5677";
		//무작위로 한 토막 *로 숨겨보자
		String regex = "-";
		String[] cardArr = card.split(regex);
		
		//잘됐나 확인
		for (String c : cardArr) {
			System.out.println(c);
		}
		//foreach문 작동원리: cardArr의 첫요소(7655)를 c에 받습니다 -> sysout으로 출력
		//순회하는 for문이라서 이걸 cardArr요소 전부 반복 그래서 7655 \n 8988,,,식으로 나오는거임 하나씩
		
		Random rnd = new Random();
		int index = rnd.nextInt(4); //0<=ran<4 (정수)
		cardArr[index] = "****";
		System.out.println(Arrays.toString(cardArr));
		System.out.printf("%s-%s-%s-%s\n",cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		
		String printCard = String.join("-", cardArr);
		System.out.println(printCard);
		
		

	}//main

}//class
