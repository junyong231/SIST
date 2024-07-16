package days05_mine;

//문제3
 /*
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 * [문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * */

public class Ex02_04 {
//최적 풀이만 기록함.. 2번 풀이가  if문 써서 홀,짝 구분해서 컨티뉴
	public static void main(String[] args) {
		//while문으로 해보자
		int sum=0;
		int i =1;
//		while (i <= 10) {
//			System.out.printf("%d+",i);
//			sum += i;
//			
//			i+=2;
//		}
//		System.out.printf("=%d\n",sum);
		
		//2번 풀이
		while ( i <= 10) {
			if (i%2 ==0) {
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum += i;
			i++;
		}
		System.out.printf("=%d\n",sum);
		
		//짝수일 때 최적풀이 ( 초기값을 짝수로 잡고 while문의 증감을 2로 주는것
		int esum=0;
		int e =2;
		while (e <= 10) {
			System.out.printf("%d+",e);
			esum += e;
			
			e+=2;
		}
		System.out.printf("=%d",esum);
		
		
		
		}//main

	}
