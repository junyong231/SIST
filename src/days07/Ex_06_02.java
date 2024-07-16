package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 3:47:46
 * @subject 메소드(함수) 사용하는 예제
 * @content 두 정수의 합을 구해서 출력
 * 					함수 선언 	1) 두 정수의 합 구하는 기능
 * 								2) 매개변수: 두 정수
 * 								3) 리턴: 합
 */
public class Ex_06_02 {

	public static void main(String[] args) {
		
		int a =1023;
		int b = 20;
		int c; //리턴자료형에 맞아야됨 (long은 가능 int보다 크니까)
		
		c = hap(a,b);
		System.out.println(c);
		
		c = hap(a,10);
		System.out.println(c);
		
		c = hap(a,10,50);
		System.out.println(c);
		
		
	} //main

	public static int hap(int a, int b) { 
		return a + b; //간단하게 가능
	}
	public static int hap(int a, int b, int k) { //오버로딩
		return a + b + k; //간단하게 가능
	}

} //class
