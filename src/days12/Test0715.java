package days12;

import java.util.concurrent.ForkJoinPool;

public class Test0715 {

	public static void main(String[] args) {
		
		int[][]m=new int[5][5];
		
		//fillM(m); // 정배열
		//fillM2(m); //역배열	
		//fillM3(m); //세로역배열
		//fillM4(m); //지그재그
		//fillM5(m); //대각선
		fillM6(m); //마방진
		
		printM(m);
		

	}//main
	
//private static void fillM5(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m.length; j++) {
//				m[i][j] = m.length ;
//			}
//		}
//		
//	}

//	private static void fillM4(int[][] m) {
//		for (int i = 0; i < m.length; i++) {//행조건 
//			for (int j = 0; j < m.length; j++) {//열조건
//				m[i][j]= (i+1)*(m.length)-4+j;
//			}//for j
//		}//for i
//		
//	}

//	private static void fillM3(int[][] m) {
//		for (int i = 0; i < m.length; i++) {//행조건 
//		for (int j = 0; j < m.length; j++) {//열조건
//			m[i][j]= (m.length-i)*(j+1)+j*(i);
//		}//for j
//	}//for i
//		
	

//	private static void fillM2(int[][] m) {
//		for (int i = 0; i < m.length; i++) { 
//			for (int j = 0; j < m.length; j++) {
//				m[i][j]= 25 - (i*5) - j;
//			}//for j
//		}//for i
//		
//	}



	private static void fillM6(int[][] m) {
		// 1. 0행 2열 스타팅 포인트
		// 2. 출력값이 5의 배수인지 아닌지 체크
		// O -> 행만 증가
		// X -> 행 감소, 열 증가 (행이 범위를 벗어난다면 -> 가장 큰 행 값으로 처리) (열이 범위를 벗어나면 -> 가장 작은 열 값으로)
//		int a= 0;
//		int b=2;
//		for (int i = 0; i < 25; i++) {
//		if(i==5*i) {
//			m[a][b] = m[a+1][b];
//			if (a<0) a=4;
//			}
//		else {
//			m[a][b] = m[a-1][b+1];
//			if (a<0) a=4;
//			if (b>0) b=0;
//		}
//		
		int n =1;
		int row = 0, col = m[0].length/2; //행, 열
		while ( n <= 25) {
			m[row][col]=n;
			
			if ( n%5 ==0) {
				row ++;
			} else {
				col++;
				row--;
				if (row == -1) row= m.length-1;
				if (col == 5) col = 0;
			}
			n++;
		}
	}

	private static void printM(int[][] m) {
		
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i
		
		
		}
		
		

	/*
	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m.length; j++) {
				m[i][j]= m.length*i +j+1;
			}//for j
		}//for i
	}//fillM
*/
	
	
	
}//class
