package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 4:12:12
 * @subject	continue문
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		
		int sum  =0;
		for (int i = 1; i <= 10; i++) { //for(  ;  ;  )이렇게 해도 가능함 대신 다 알아서 지정해줘야겠지만
			if (i % 2 == 0) continue;
		
			System.out.printf("%d+",i);
			
			sum += i;
			
		}//for
		System.out.printf("=%d",sum);
		System.out.println();
		
//		int k =1 ,ssum=0;
//		while (k <= 10) {
//			if (k==5) {
//				k++; 											//이거 없으면 계속 5에서 조건식으로 돌아가니 주의
//				continue;
//			}//if
//			System.out.printf("%d+",k);
//			ssum += k;
//			k++;
//			
//		}//while
		
		
//		//아니 이런 풀이가!
//		int k =1 ,ssum=0;
//		while (k <= 10) {
//			if (k!=5) 
//			System.out.printf("%d+",k);
//			ssum += k;
//			k++;
//			
//		}//while
//		System.out.printf("=%d",ssum);
//		
		
		//이렇게 바꿔주니까  if문에서 k++ 안해도 됨
		int k =0 ,ssum=0;
		while (++k <= 10) { //k++일 땐 어떻게 되는지 집에서 디버깅해보자
			if (k==5) {
				continue;
			}//if
			System.out.printf("%d+",k);
			ssum += k;
			}//while
		System.out.printf("=%d",ssum);
		
	}//main

}//class
