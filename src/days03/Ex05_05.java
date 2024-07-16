package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 4:31:02
 * @subject 대입연산자 =
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) throws IOException {
						
		int x = 100;
		int y = x;

		// [부호연산자]
		// +3 , -3은 더하라는게 아니라 음,양 상태표시니까 다른 종류의 연산자임
		// 무슨 수든지 * -1하면 부호가 바뀌므로  +는 부호유지 -는 부호변경으로 봄.
		int z = +3 + 4;  // 이게 되네 양수3 더하기 4
	
		// [증감 연산자]	Ex05_06
		// [쉬프트 연산자]
		// [복합 대입 연산자]
		// [삼항 연산자 == 조건 연산자] Ex05_08
		// [instanceof 비교연산자] 지금 못함
		
		//우선순위  & > ^ > | > && > ||
		
		int a=10;
		int b =20;
		int c = (++a) + (b--);
		System.out.println(c); //31
		
		
		//정확한 계산은 int형을 쓰자
		/*
		int apple = 1;
		double pieceUnit = 0.1;  //사과 10등분했다
		int number = 7;
		
		double result = apple - number*pieceUnit;  //사과 10등분 중에서 7 먹었다(뺐다)
		System.out.println("사과 1개에서 남은 양" + result); //0.29999999999999993 정확하지 않다
		*/
		//해결법 책 88p
		
		// (암기) 
		// 두 문자열을 비교할 때 비교 연산자 사용하지 않는다.
		// [string].equals() ![string].equals() 라는 함수를 사용한다.
		
//	      String n1 = "kenik", n2;
//
//	      Scanner scanner = new Scanner(System.in);
//
//	      System.out.print("> n2 입력 ? ");
//	      n2 = scanner.next();
//
//	      System.out.println( n1 == n2 );  // false
//	      System.out.println( n1.equals(n2) ); // false
//	      System.out.println( n1.equalsIgnoreCase(n2) ); // true
	/*
	      System.out.println( n1 != n2 );  // false
	      System.out.println( !n1.equals(n2) ); // true
	*/

			
		
		
	} 

}
