package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 3:08:24
 * @subject
 * @content
 */
public class Ex_05 {

	public static void main(String[] args) {
		//[정처기] 계차수열(수열의 인접하는 두 항의 차로 이루어지는 수열)
		
		// 1+2+4+7+11+16+22...   항의 개수가 20개 까지의 합
		//   1  2  3   4     5    6		계차수열 (secondTerm - firstTerm) 
		
		
	
		int firstTerm = 1;
		int secondTerm = 2;
		int gye = secondTerm - firstTerm; //1
		int sum =0;
		
		//항의 갯수는 계차수열 항의 갯수보다 1개 많다 : 계차 수+1 = 항의 개수 아 gye는 계차값이니까 좀 이상하네
		while (gye <=5) { // 계1 2
			sum += firstTerm; //1
			firstTerm = secondTerm; //2
			secondTerm += gye+1; //4 
			gye=secondTerm - firstTerm; //2
					
		}
		System.out.printf("=%d",sum);
		
		// [ 계차수열 ] 쌤 풀이
	      // term(항) [1+2+4+7+11+16+22..]의 갯수가 20개 까지의 합
	      //          0 1 2 3 4 5  +6  계차(difference)

//	      int term = 1;
//	      int difference = 0;
//	      int sum = 0;
//	      for (int i = 1; i <= 20; i++) {
//	          term += difference;
//	          System.out.printf("%d+", term);
//	          difference++;
//	          sum += term;
//	      }
//	      System.out.printf("=%d\n", sum);

	}//main

}//class
