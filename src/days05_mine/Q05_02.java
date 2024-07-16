package days05_mine;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 4. - 오후 11:37:31
 * @subject
 * @content
 * 
 * [문제5] 두 정수 n,m 입력 받아서 두 정수 사이의 합을 출력 [for,while문 두가지 풀이로]
 * while문 풀이
 */
public class Q05_02 {

	public static void main(String[] args) {
		
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n 입력 ?");
		n =sc.nextInt();
		System.out.println("정수 m 입력 ?");
		m =sc.nextInt();
		
		int sum = 0;
	
		while (n>m+1) { //n>m일 때, m+1은 n=m일 때에도 반복문이 돌아가는걸 막으려고 사용.
			int sai_max = n -1; //사잇값의 최댓값
			sum += sai_max;
			n--;
		}//while
		
		while (m>n+1) { //n>m일 때, m+1은 n=m일 때에도 반복문이 돌아가는걸 막으려고 사용.
			int sai_max = m -1; //사잇값의 최댓값
			sum += sai_max;
			m--;
		}//while
		
		if(m==n) System.out.println("사잇값의 합은 0");

		System.out.println("사잇값의 합은" + sum);
		
	}//main

}
