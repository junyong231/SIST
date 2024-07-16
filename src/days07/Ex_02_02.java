package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 10:36:34
 * @subject
 * @content
 */
public class Ex_02_02 {

	public static void main(String[] args) {
	      //              공    별
//      ___*   i=1      3     1
//      __**   i=2      2     2
//      _***   i=3      1     3
//      ****   i=4      0     4
      //            i+j=4
      //            j=4-i   j=i

		/*
      for (int i = 1; i <= 4; i++) {  // 행 갯수
         // _ 공백 찍는 for
         for (int j = 1; j <= 4-i; j++) {
            System.out.print("_");
         }
         // 별 찍는 for
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      } // for i
      */
		
		// i 				 공			별				
		//	0	****		j=0		l=4
		//	1	_***		j=1		l=3
		//	2	__**		j=2		l=2
		//	3	___*		j=3		l=1
		
		for (int i = 0; i < 4; i++) { //4행
			for (int j = 0; j < i; j++) {//공백
				System.out.print("_");
			}
			for (int l = 0; l < 4-i; l++) {//별
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		

	}//main

}
