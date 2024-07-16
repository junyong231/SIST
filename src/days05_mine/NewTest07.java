package days05_mine;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오전 1:36:27
 * @subject
 * @content
 */
public class NewTest07 {

	public static void main(String[] args) {
		

//		6. 이름, 국어, 영어, 수학 을 입력받아서
//		   총점, 평균을 계산하고
//		   평균이 90~100 'A', 평균이 80~89 'B' ~ 평균이 0~59 'F' 로 처리해서
//		   [출력 형식]
//		   홍길동 90 83 92 265 83.33 'B'
		
//		String name = "";
//		int sum;
//		double avg;
//		char [] grades = new char[3];
//		grades[0] ='A';
//		grades[1] ='B';
//		grades[2] ='F';
//		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름, 국어, 영어, 수학 점수 입력하시오");
//		//입력:  박, 90, 89 ,91
//		String input = sc.nextLine();
//		String [] inputs = new String [4]; 
//		inputs = input.split("\\s*,\\s*"); //한 줄로 입력 받은것 4개로 분할
//		//System.out.println(inputs[0]+"\n"+inputs[1]+"\n"+inputs[2]+"\n"+inputs[3]);
//		
//		int [] score = new int[3];
//		for (int i = 0; i < inputs.length-1; i++) {
//			score[i] =Integer.parseInt(inputs[i+1]);//점수 부분을 int로 변환해서 할당
//		}
//		//System.out.println(score[0]+"\n"+score[1]+"\n"+score[2]);
//		sum = score[0] + score[1] + score[2];
//		avg = sum/3;
//		
//		System.out.printf("%s님의 성적 합은 %s점이고 평균%.2f점입니다 ",inputs[0],sum,avg);
//		
//		if (avg >=90) {
//			System.out.println("등급은 " + grades[0]);
//		} else if(avg>=80){
//			System.out.println("등급은 " +grades[1]);
//		} else {System.out.println("등급은 " +grades[2]);}
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
		
		
		
		
	}//main

}//class
