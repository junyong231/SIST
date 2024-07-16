package days04;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 5:10:41
 * @subject do~while
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		int n = 2;
		do {
//			if (n < 1) {
//				System.out.println("정수 1이상의 값만 입력하세요.");
//			}
			System.out.println("정수 입력 ?");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
		} while (n < 1);
			
		//n이 do안에 있으면 지역변수라서 에러나니까 주의
		//경고문처럼 출력하려면 어떻게 할까? 생각해보자
		int sum=0;
		
		for (int i = 1; i <= n; i++) { 
			
			System.out.printf("%d+",i);
			sum += i;
			
		}//for
		System.out.printf("=%d",sum);
		
	}//main
	
	
	//풀었으면 보내라
	
/*
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 * [문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * */
	
	
}//class
