
package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오전 11:05:18
 * @subject 어제 숙제 문제 풀이 (문제2)
 * @content
 * 
 * /*
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 * [문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * */

public class Ex02_02 {

	public static void main(String[] args) {
		//1번
		int kor;
		boolean flag = false; 
		Scanner sc = new Scanner(System.in);
		do {
			if (flag) {
				System.out.print("입력 잘못 !!\n다시 ");
			}
			flag =true;
			//문장 이동시 복붙 말고 Alt +방향키 쓰자
			System.out.println("국어 점수 입력?");
			kor = sc.nextInt();

		} while (kor < 0 || kor >100 ); //(! (kor  >= 0 && kor <= 100);

		//System.out.println(kor);

		
		
		char grade;
		switch (kor/10) {
		case 10:
//			grade = '수';
//			break;				//비워두면 아래로 내려가니까 케이스 10,9는 같은 실행 
			//jdk 14  부터는 case 9,10 이렇게 잡으면 됨
		case 9:
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
			}//switch
		System.out.printf("%c",grade);
		}//main

	}
