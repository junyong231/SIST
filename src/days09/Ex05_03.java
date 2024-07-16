package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.=오후 4:07:45
 * @subject
 * @content
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {

		//암기 - 그림
		
		
		
		//2차원 배열 초기화
		int [][] m2 = {
				{1,2,3,4} ,
				{5,6,7,8}
			};
		//이렇게 초기화해도 됨
		

		
		
		
		//1차원배열의 초기화
//		int [] m = {1,2,3,4,5,6,7,8};
//		int [][] m2 = new int[2][4];
//		m2[0][0] =1; m2[0][1] =2; 
//		
		
//		//2차원 배열 - 행, 열
//		int [][]m2=new int[4][6];
//		System.out.println(m2.length); // 행 갯수 4가 나옴
//		System.out.println(m2[0].length); // 열 갯수 6이 나옴 : 0번째 행의 열 갯수.
//		m2[2][3] = 100;
//		System.out.println(m2[2][3]);
		dispM(m2);
//		
		
		
		
		
		
		//1차원 배열 - 열
//		int [] m = new int[24];
//		//1차원 배열의 크기
//		System.out.println(m.length);
//		for (int i = 0; i < m.length; i++) {
//			System.out.printf("m[%d]=%d",i ,m[i]);
//		}
		
		
		

	}//main

	private static void dispM(int[][] m2) {
		
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.printf("m2[%d][%d]=%d ",i,j,m2[i][j]);
			}
			System.out.println();
		}//for
		
	}//dispM

}//class
