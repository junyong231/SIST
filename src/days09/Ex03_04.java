package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//[문제] 
		//거듭제곱 2^3 (밑수 2를 지수 3만큼 반복해서 곱함) == 8
		double result = pow(2,-3);
		System.out.println(result);

	}//main



	private static double pow(int i, int j) {
		double result = 1;						 
		int exp = j < 0 ? -j : j; 
		
			for (int k =0; k < exp; k++) { //곱하는 횟수
				result *= i ; 						
			}
		return j >0 ? result : 1/result;
	}	//일반함수



}//class
