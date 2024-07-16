package days06;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 4:19:00
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		//[순서도]
		//1-2_3-4...-8+9-10=-5
		//짝수일 때 sum-=i
		//홀수일 때 sum+=i
		int sum =0;
		
		//2번풀이
//		for (int i = 1; i <=10; i++) {
//			System.out.printf(i%2==0?"%d+":"%d-",i);
//			sum+= (i%2==0) ? -i :i;
//		}
//		System.out.printf("=%d",sum);
		
		//3번풀이(시험)
		boolean sw =false;
		for (int i = 1; i <= 10; i++) {
			if (!sw) {//스위치 false일때 , == 1부터 도니까 홀수일 때
				System.out.printf("%d-",i);
				sum +=i;
			} else {//스위치 반전되어 true일 때. == 2,4,6 이렇게 가니까 짝수일때
				System.out.printf("%d+",i);
				sum-=i;
			}
			sw = !sw; //스위치 반전 
		}		
		System.out.printf("=%d",sum);
		
		//1번풀이
//		for (int i = 1; i <=10; i++) {
//			if (i%2==0) {//짝수일 때 뺄셈
//				System.out.printf("%d+",i);
//				sum -= i;
//			} else {//홀수일 때 덧셈
//				System.out.printf("%d-",i);
//				sum += i;
//			}
//		}
//		System.out.printf("=%d",sum);
		
	}//main

}//class
