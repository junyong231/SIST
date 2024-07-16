package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 11. - 오후 10:16:02
 * @subject
 * @content
 */
public class Test0711 {

	public static void main(String[] args) throws IOException {
		//1. 30 명 학생의 성적처리
		
		/*
		Scanner sc = new Scanner(System.in);
		final int STUDENT_COUNT = 30;
		
		String [] names =new String [STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		//배열들 선언 완료
		
		int count = 0; //완료한 학생
		int rank = 1;
		char con ='y';
		
		do {
			System.out.println("학생 이름 국어 수학 영어 입력 ? ");
			names[count] = sc.next();
			kors[count] = sc.nextInt();
			engs[count] = sc.nextInt();
			mats[count] = sc.nextInt();
			tots[count] = kors[count]+engs[count]+mats[count];
			avgs[count] = tots[count]/3;
			ranks[count] = rank;
			//다 입력 받음
			
			count ++;
			
			System.out.println("다음 학생 입력 (Y/N) ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());//10,13빼주기
			
			
			
		} while (Character.toUpperCase(con)=='Y'); //y Y 입력하면 다시 반복
		
		
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		}
		*/
		
		//2. 2차원 배열, 3차원 배열 설명
		/*
		 * 1차원 배열이 열로만 나열되는 배열이라면
		 * 2차원 배열은 행의 개념이 추가되고
		 * 3차원은 면의 개념이 추가되어 배열됨
		 * 배열이 커지고 규칙이 생길수록
		 * (배열 150개인데 30개씩 끊어서 한 반을 이루는 등)
		 *  배열 요소에 접근하는 것이 용이해짐
		 */
		
		//3. 10진수 125를 2바이트 2진수로 출력하기
		
		int toBinary = 125;
		int [] binary = new int [32];
		
		int count =0;//방배정용 변수
		
		do {//계속 2로 나누는 과정
			binary[count] = toBinary%2; //2진수가 될 녀석
			toBinary=toBinary/2;
			count ++;
			
			
		}while (toBinary!=0) ;//몫이 0나오기 전까지 계속 나눠서 방배정
		
		for (int i = 0; i < binary.length; i++) {			
			System.out.printf("%d",binary[i]); //거꾸로 되어있는 2진수 나옴
		}
		System.out.println();
		int [] realBinary = new int [32];//새롭게 2진수 받을 배열 선언
		
		for (int i = 0, reverse = 31; i < realBinary.length; i++) { //리버스 인트로 순서 서로 바꿔버림
			realBinary[i] = binary[reverse];
			reverse--;
			System.out.printf("%d",realBinary[i]);//방배정하고 하나씩 출력
		}
		
		System.out.println();
		
		
		//4. 합을 구하는 재귀함수?
		
		System.out.println(hap(10));
		
	}//main

	private static int hap(int n) {
		if (n==1) return n;
		else return n + hap(n-1);
		
	}

}//class
