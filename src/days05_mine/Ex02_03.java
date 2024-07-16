package days05_mine;

//문제3
 /*
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 * [문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * */

public class Ex02_03 {

	public static void main(String[] args) {
	
		/* 여기다 if로 홀수만 걸러서 누적시키는게 최선인 줄 알았지?
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) { //1~10까지의 합	
			sum += i;
			System.out.printf("%d+",i);
			
		}//for
		System.out.printf("=%d",sum);
		*/
		
		int sum = 0;
		for (int i = 1; i <= 10 ; i+=2) { //i를 1에서 2씩 증가시키면서 하니까  for문 도는것도 절반으로 줄고 if문 체크도 안함  	
			sum += i;
			System.out.printf("%d+",i);
			
		}//for
		System.out.printf("=%d\n",sum);		
		
		
		//짝수도 된다.
		int esum = 0;
		for (int i = 2; i <= 10 ; i+=2) {   	
			esum += i;
			System.out.printf("%d+",i);
			
		}//for
		System.out.printf("=%d",esum);		
		
		
		
		}//main

	}
