package days05_mine;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 4. - 오후 11:21:11
 * @subject
 * @content
 * [문제3,4] 1~10까지의 홀수의 합 [for,while문 두가지 풀이로]
 */
public class Q0304 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				continue;
			}
			if (i==9) {
				System.out.printf("%d",i);
				sum +=i;
				continue;
			}
			System.out.printf("%d+",i);
			sum += i;
		}//for
		System.out.printf("=%d : for문 이용",sum);
		System.out.println();
		
		
		// ---------------------
		
		
		int sum2 = 0;
		int i = 1;
		while (i <= 10) {
			if (i%2==0) {
				i++;
				continue;
			}
			if (i==9) {
				System.out.printf("%d",i);
				sum2 += i;
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum2 += i;
			i++;
		}//while
		
		System.out.printf("=%d : while문 이용",sum2);
		
	}//main
}//class
