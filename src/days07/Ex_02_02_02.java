package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 10:36:34
 * @subject
 * @content
 */
public class Ex_02_02_02 {

	public static void main(String[] args) {
		//              공    별
		//      ___*   i=1      3     1
		//      __**   i=2      2     2
		//      _***   i=3      1     3
		//      ****   i=4      0     4

//		for (int i = 1; i <= 4; i++) { // 행갯수
//			for (int j = 1; j <= 4 ; j++) { // 열갯수
//				System.out.print(i+j<=5?"*":"_");
//				/*
//	            if (i+j<=5) {
//	               System.out.print("*");
//	            } else {
//	               System.out.print("_");
//	            }
//				 */
//			}
//			System.out.println();
//		}




		// i 				 공			별				
		//	1	****	 	j=0		l=1~4  (1,1     
		//	2	_***		j=1		l=2~4  (2,2
		//	3	__**		j=2		l=3~4	(3,3
		//	4	___*		j=3		l=4		(4,4


		for (int i = 1; i <= 4; i++) { // 행갯수
			for (int j = 1; j <= 4 ; j++) { // 열갯수
				//System.out.print(i+j<=5?"*":"_");
				
	            if (i<=j) {
	               System.out.print("*");
	            } else {
	               System.out.print("_");
	            }
				
			}
			System.out.println();
		}	




	}//main

}//class
