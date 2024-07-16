package days03;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오전 10:27:44
 * @subject
 * @content
 */

public class Ex01 {

	public static void main(String[] args) {
		//정수: bye, short, int, long
		//논리: boolean
		//문자: char
		//실수: float,      double
		//       3.14f        3.14[d]     같은 3.14지만 다른 값이다.
		
	
		//char 2바이트 [] []   부호비트 자리가 없음 (양수만 나옴)
		//short 2바이트 [s] []
		
		
		// int 4바이트  [s] [] [] []
		
		 //                       [E]지수  [M]가수(실제 소수점 부분)
		// float 4바이트 [s] [E8] [M23] 
		//+-M x 10^E
		
		//double 8바이트 [s] [E11] [M52]  가수부분이 float비해서 소수점 부분 2배 정도 많음 (배정도 정확도)
		
		// 정규화
		// 9.1234567 실수
		//1001.000111111001101011011011... (무한실수)
		//1.001000111111001101011011011... 2^3곱하면 이렇게 됨(2진수니까)
		
	}

}
