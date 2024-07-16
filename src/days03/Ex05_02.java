package days03;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 3:33:26
 * @subject 산술연산자
 * @content + - *  / %
 * 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		// 주의할 점!
		// 1. 정수를 0으로 나눌 때
		
		// System.out.println(10 / 0);
		// java.lang.ArithmeticException: / by zero : 산수 에러 / 0 했다
		
		// 2. 실수를 0으로 나눌 때
		//System.out.println(10.0 / 0); //리터럴 무한대가 나옴 (에러는 x)
		
		//System.out.println( Double.isInfinite(10.0/0));
		// is~~ 물어보는거임 여기선 무한대이니? 라고 물어본 격 답은 true
		
		//System.out.println(10 % 0);
		//java.lang.ArithmeticException: / by zero
		
		//실수 % 0			NaN=Not a Number (숫자아님)
		//System.out.println(10.0 % 0);
		//System.out.println(Double.isNaN(10.0 % 0));
		
		
		/*
		int i = 10, j =3 ;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); // 몫만 나옴 3		int [연산] int 해서 int가 나옴 (이게 진짜 이유였음..
		System.out.println((double)i / j); // 따라서 강제형변환으로 가능함
		
		
		System.out.println(i % j); // 나머지 나옴 1
		*/
		
		

	}

}
