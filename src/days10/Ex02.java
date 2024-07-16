package days10;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 11:04:35
 * @subject 복습 2번 문제
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
//		int [] m = new int[6];
//		m[0]=1;m[1]=2;m[2]=3;m[3]=4;m[4]=5;m[5]=6; 

		//int [] m = {1,2,3,4,5,6};
		
//		int [][]m=new int [2][3];
//		m[0][0] =1;m[0][1] =2;m[0][2] =3; 
//		m[1][0] =4;m[1][1] =5;m[1][2] =6; 
		
		int [][] m = {
				{1,2,3},
				{4,5,6}

		};
		//배열명.length 행크기 나옴 m[0].length하면 열크기
		
		for (int i = 0; i < m.length; i++) {//행크기
			for (int j = 0; j < m[i].length; j++) {//열크기 (별찍기를 생각)
				System.out.printf("m[%d][%d]=%d\t",i,j,m[i][j]);
			}
			
		}
		
		
	}//main
}
