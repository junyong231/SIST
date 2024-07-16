package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.=오후 4:29:57
 * @subject
 * @content
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		//int [][][] m = new int[2][3][4];//2면 3행 4열
		//3차원배열 초기화

		int [][][] m = {{
								{1,2,3,4} ,
								{5,6,7,8},
								{8,9,10,11}
								},
								{
								{1,2,3,4} ,
								{5,6,7,8},
								{8,9,10,11}
								},
								{
								{1,2,3,4} ,
								{5,6,7,8}
								}
								};



		//3학년 2반 18번 학생의 국어
		//kor[226]
		//int [][][] kor =new int[3][3][30];
		//kor[2][1][16];

		System.out.println(m[0].length);  //면 갯수
		System.out.println(m[1].length);  //행 갯수

		dispM(m);
	}//main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println("면" + i);
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d "
							,i,j,k,m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();

		}//for1

	}

}//class
