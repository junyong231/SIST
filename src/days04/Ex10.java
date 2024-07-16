package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 3:40:02
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 =55 를 출력하려면
		
		int sum= 0;
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d+",i);
//			sum += i; //i누적
//		}
//		System.out.print("="+sum);
		int i = 1;
		while (i <= 10) {
//			if (i==10) {
//				System.out.printf("%d",i);
//				sum += i ;
//				break;
//				}
			System.out.printf("%d+",i);
			
			sum += i ; //순서 중요 i++이 위면 2부터 더해져서 65나옴
			i++;
			
			
		}
		System.out.printf("=%d",sum);
		
	}//main

}//class
