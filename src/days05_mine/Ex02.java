package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오전 11:05:18
 * @subject 어제 숙제 문제 풀이
 * @content
 * 
 * /*
 * [문제1] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:if문 사용]
 * [문제2] 국어 점수를 입력 받아서 수(90이상)/우(80~89)/미(70~79)/양(60~69)/가(0~59) 출력 [조건:switch문 사용]
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * */

public class Ex02 {

	public static void main(String[] args) {
		//1번
		int kor;
		boolean flag = false; //처음 두와일 진입할때 if문 넘어가려고 false로 초기화
		Scanner sc = new Scanner(System.in);
		do {
			if (flag) {
				System.out.print("입력 잘못 !!\n다시 ");
			}
			//문장 이동시 복붙 말고 Alt +방향키 쓰자
			System.out.println("국어 점수 입력?");
			flag =true; //if문 넘어왔으니 true로 바꿈 
			kor = sc.nextInt();//잘못된 범위의 숫자입력시 두와일 반복
			
		} while (kor < 0 || kor >100 ); //(! (kor  >= 0 && kor <= 100); //잘못된 범위를 반복문의 조건으로 둠
		// 잘 입력할 떄까지 받겠다는 뜻
		
		System.out.println(kor);
		
//		if (kor >= 90 && kor <= 100) System.out.println("수");
//		if (kor >= 80 && kor <90) System.out.println("우"); //이미 '수'라고 대답해도 계속 물어봄 ㅋㅋ
//		if (kor >= 70 && kor <80) System.out.println("미");
//		if (kor >= 60 && kor <70) System.out.println("양");
//		if (kor >= 0 && kor <60) System.out.println("가");
		
		
		if (kor >= 90) System.out.println("수");
		else if (kor >= 80) System.out.println("우"); //else if 로 바꿔주면 하나 걸리면 더 안물어봄
		else if (kor >= 70) System.out.println("미"); //&& kor <80 이거 다 바로 위에서 걸러져서 내려온 애들이라 무쓸모
		else if (kor >= 60) System.out.println("양");
		else System.out.println("가");	//나머지는 다 else로 처리 
		
		
	}//main

}
