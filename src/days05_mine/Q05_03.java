package days05_mine;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 1:36:10
 * @subject
 * @content
 */
public class Q05_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 m 입력 ?");
		int m = sc.nextInt();
		System.out.println("정수 n 입력 ?");
		int n = sc.nextInt();

		
		int sum=0;
		if (m > n) {
			if ((m-n-1)%2==0) {//항의 개수 짝수일 때
				for (int i = (m-n-1)/2; i >= 0 ; i--) {// (항의 갯수/2) * (가우스합)
					sum += (m+n);
				}
			}else {//항의 개수 홀수일 때
				for (int i = (m-n-1)/2 ; i > 0 ; i--) {// (항의 갯수/2) * (가우스합)   i>0으로 바꾼이유는 가운데항이 남아서 짝수로직이랑 다르게 처리 위함
					sum += (m+n);
				}//for
				sum += (m+n)/2;
			}
		} else if(m < n) {
			if ((n-m-1)%2==0) {//항의 개수 짝수일 때
				for (int i = (n-m-1)/2; i >= 0 ; i--) {// (항의 갯수/2) * (가우스합)
					sum += (n+m);
				}
			}else {//항의 개수 홀수일 때
				for (int i = (n-m-1)/2 ; i > 0 ; i--) {// (항의 갯수/2) * (가우스합)   i>0으로 바꾼이유는 가운데항이 남아서 짝수로직이랑 다르게 처리 위함
					sum += (n+m);
				}//for
				sum += (n+m)/2;
			}

		} else { //m==n
			sum=0;
		}
		System.out.printf("%d",sum);
	
		
	}
}
