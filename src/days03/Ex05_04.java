package days03;


/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 4:06:42
 * @subject 논리연산자
 * @content 참/거짓
 * 
 * 					1) 일반 논리 연산자
 * 						ㄱ. &&		일반 논리 AND 연산자(논리곱)
 * 
 * 							true && true => true
 * 							true && false => false
 * 							false && true => false
 * 							false && false => false
 * 							두 피연산자가 모두 참일 때만 참이 된다.
 * 							&&을 곱하기로 생각하면 논리곱 연산자
 * 
 *						ㄴ. ||			일반 논리 OR 연산자					//엔터위에 키 쉬프트로 누르면 됨 
 *
 *							true || true => true
 *							true || false => true
 *							false || true => true
 *							false || false => false
 *							둘 다 거짓이면 거짓 (=하나라도 참이면 참)
 *
 *
 * 						ㄷ. !			부정(NOT)연산자
 * 
 * 							!true => false
 * 							!false => true
 * 
 * 					2) 비트 논리 연산자
 * 
 * 							ㄱ. &		비트논리 AND 연산자
 * 							ㄴ. |		비트논리 OR 연산자
 * 							ㄷ.^		XOR 연산자		== e[X]clusive : 배타적인
 * 							ㄹ.~		틸드연산자		(비트부정연산자)
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		System.out.println(10 & 3);  //2 
		System.out.println(10 | 3);  //11 
		System.out.println(10 ^ 3);  //9 XOR 다를때 참
		System.out.println(~10);  // -11
		//	10			0000 1010
		//	3			0000 0011 
		//	&			0000 0010  == 2
		// |			0000 1011  == 11
		// ^			0000 1011  == -11  ?
		
		//~			
		//10은 0000 1010
		//부정(~)  1111 0101
		//음의 보수법 ㄱ 1111 0100 (1빼기)
		//					  0000 1011 (보수)
		
		/*
		//System.out.println( !3 > 5);
		//The operator ! is undefined for the argument type(s) int  :3이라는 정수를 부정할 수는 없다
		//알 수 있는 것: 부정연산자가 비교연산자보다 우선순위가 높음 
		
		
		//Dead code	: &&에서 첫 항이 거짓이면 어차피 거짓이라 뒤에 것은 아예 연산을 안함 따라서 죽은 코드
		System.out.println(3>5 && 100 > 1);
		System.out.println(3<5 && 100 > 1);
		
		//Dead code	: ||에서 첫 항이 참이면 어차피 참이라 뒤에 것은 아예 연산을 안함 따라서 죽은 코드
		System.out.println(3<5 || 100 > 1);
		*/
		
		
		

	}

}
