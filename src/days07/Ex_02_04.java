package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 11:11:49
 * @subject	보드 좌표처럼 풀기
 * @content
 */
public class Ex_02_04 {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) { //행 갯수
//			for (int j = 1; j <= 5; j++) { //열 갯수
//				if (i==j) System.out.print("*");
//				else System.out.print('_');
//			}
//			System.out.println();
//		}

		
//      ____* (1,5) i와 j의 관계 (더하면 6)
//      ___*(2,4)
//      __*(3,3)
//      _*(4,2)
//      *(5,1)
		
      for (int i = 1; i <= 5 ; i++) { // 행갯수
         for (int j = 1; j <= 5 ; j++) { // 열갯수
            if( i+j==6 ) System.out.print("*");
            else System.out.print("_");
         }
         System.out.println();
      }

//      *___*
//      _*_*
//      __*
//      _*_*
//      *___*
      for (int i = 1; i <= 5 ; i++) { // 행갯수
         for (int j = 1; j <= 5 ; j++) { // 열갯수
            if( i==j || i+j==6 ) System.out.print("*");
            else System.out.print("_");
         }
         System.out.println();
      }


		
	}//main

}//class
