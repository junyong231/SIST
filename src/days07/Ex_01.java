package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 9:43:52
 * @subject 문제답
 * @content
 */
public class Ex_01 {

	public static void main(String[] args) {
		// 1/2-2/3+3/4-...7/8-8/9=???
	      // 분자/분모
	      // 분자/(분자+1)

	      // i  홀수-  sum +=
	      // i  짝수+  sum -=
		
//	      boolean flag = true;
//	      double sum = 0;
//
//	      for (int i = 1; i <= 8  ; i++) {
//	         if (flag) {
//	            System.out.printf("%d/%d-", i, i+1);
//	            sum += (double)i/(i+1);
//	            //flag = false;
//	         } else {
//	            System.out.printf("%d/%d+", i, i+1);
//	            sum -= (double)i/(i+1);
//	            //flag = true;
//	         } // if
//	         flag = !flag;
//
//	      } // for i
//
//	      System.out.printf("=%f\n", sum);
//	      
	  
	      
		
	// 1/2-2/3+3/4-4/5+5/6...-8/9=
		
		double sum = 0;
		boolean flag = false;
		
		
		for (int i = 1; i <= 8; i++) {
			if (flag) { //짝수
				sum -= (double)i/(i+1);
				System.out.printf("-%d/%d",i,i+1);
				
			} else {
				sum += (double)i/(i+1);
				System.out.printf("+%d/%d",i,i+1);
				}flag = !flag;
			}
		System.out.printf("=%f",sum);
		
		
		
		
		//구구단 세개씩
		for (int k = 1; k <= 3; k++) {//
			System.out.println();
			for (int l = 3*k-1; l <=3*k+1 && l!=10; l++) {//조건식에 추가하는 쌤 방법 (10제외)
				System.out.printf("[%d]단\t\t",l);
			}//for l
			for (int i = 1; i <= 9; i++) {
				System.out.println();
				for (int j = 3*k-1; j <= 3*k+1; j++) {
			         // k=1    j = 2; j <= 4
			         // k=2    j = 5; j <= 7
					 // k=3   j = 8  ; j <= 9
			         //          = 3*k-1  = 3*k+1
					if (j<10) {
						System.out.printf("%dx%d=%d\t",j,i,i*j); //내가 한 10제외 방법(무식ㅋ)
					}
				}//for j
			}//for i
			
		}//for k
		
		

	}//main

}//class
