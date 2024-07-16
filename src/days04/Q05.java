package days04;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 4. - 오후 11:37:31
 * @subject
 * @content
 * 
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * for문 풀이
 */
public class Q05 {

	public static void main(String[] args) {
		
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n 입력 ?");
		n =sc.nextInt();
		System.out.println("정수 m 입력 ?");
		m =sc.nextInt();
		
		int sai_sum = 0;
		
		if (n-m > 0) { //n > m 일 때
			int sai_max = n - 1; //사잇값의 최댓값
			for (int i = sai_max; i > m ; i--) { //사잇값이 m+1되면 종료      
				//조건문 i==m+1 으로 해놓고 한참 고민했습니다 i--가 왜 안될까 하면서요 조건문이 거짓이 떠서 끝난거였는데..!
				sai_sum += i;
			}//for
			System.out.println("정답은 " + sai_sum);
		}//if
		

		if (n-m < 0) { //n < m 일 때
			int sai_max = m - 1; //사잇값의 최댓값
			for (int i = sai_max; i > n ; i--) { //사잇값이 n+1되면 종료 
				sai_sum += i;
			}//for 
			System.out.println("정답은 " + sai_sum);
		}//if2
		
		
		if (n==m) System.out.println("정답은 0");
		
	}//main

}
