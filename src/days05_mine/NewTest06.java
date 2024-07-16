package days05_mine;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오전 1:36:27
 * @subject
 * @content
 */
public class NewTest06 {

	public static void main(String[] args) {
		
				// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수(m)를 입력하세요");
		int m = sc.nextInt();
		System.out.println("두번째 정수(n)를 입력하세요");
		int n = sc.nextInt();
		
		int sum=0;
		if (m>n) {
			for (int i = n; i <= m ; i++) {
				sum+=i;
			}
		}//if
		else if(m<n) {
			for (int i = m; i <= n ; i++) {
				sum+=i;
			}
		}//if
		else {sum=0;}

		System.out.printf("%d",sum);




	}//main

}//class
