package days05_mine;

import java.util.Scanner;

/**	이것은 도큐먼트 주석
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 2:18:46
 * @subject 문제5번 (두 정수 사이의 합)
 * @content
 */
public class Ex02_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 n, m 입력 ? ");
		int n =sc.nextInt();
		int m =sc.nextInt();

		int sum = 0;

		//풀이1
		//		if (m >n) {
		//			for (int i = n; i <= m; i++) {
		//
		//				System.out.printf("%d+",i);
		//				sum += i;
		//			}
		//		}
		//
		//			 else {
		//				for (int i = m; i <= n; i++) {
		//
		//					System.out.printf("%d+",i);
		//					sum += i;
		//				}
		//
		//				System.out.printf("=%d\n",sum);
		//
		//			 }

		//		풀이 2		
		//		if (m >n) {
		//			int temp = m;
		//			m = n;
		//			n =temp;
		//		}
		//		for (int i = m; i <= n; i++) {
		//
		//			System.out.printf("%d+",i);
		//			sum += i;
		//		}
		//		System.out.printf("=%d\n",sum);


				int min = n > m ? m : n;		//Math.min(n,m) 도 있음..
				int max = Math.max(n, m);
				
				
				for (int i = min; i <= max; i++) {
		
					System.out.printf("%d+",i);
					sum += i;
				}
				System.out.printf("=%d\n",sum);




	}//main

}//class
