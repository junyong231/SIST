package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 11:38:14
 * @subject
 * @content 마름모 모래시계
 */
public class Ex_02_05 {

	public static void main(String[] args) {
			
		
		//모래시계 	
		//마름모도 마찬가지고, 중복 범위 좁혀서 논리연산자로 별찍기
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5 ; j++) {
				System.out.print(i<=j && i+j<=6 || i>=j && i+j>=6 ?"*":"_");
				
				
			}
			System.out.println();
		}
		
		System.out.println();
//      마름모
//
//      __*             (1,3)
//      _***       (2,2)     (2,4)
//      ***** (3,1)               (3,5)
//      _***       (4,2)      (4,4)
//      __*             (5,3)

      for (int i = 1; i <= 5 ; i++) {
         for (int j = 1; j <= 5 ; j++) {
            System.out.print(i+j>=4 && j-i<=2 && i-j<=2 && i+j<=8?"*":"_");

         } // for j
         System.out.println();
      } // for i

	}//main

}//class
