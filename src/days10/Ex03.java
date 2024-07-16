package days10;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 11:10:46
 * @subject 복습 문제 3 풀이 (누승)
 * @content 합 구하는 재귀함수를 이해하고 외워두자..
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		double result = recursivePow(2,3);
		System.out.println(result);
		result = recursivePow(2,-3);
		System.out.println(result);
		result = recursivePow(2,3);
		System.out.println(result);
	}//main

	private static double recursivePow(int i, int j) {
		if (j<0) return 1/recursivePow(i, -j) ; //-로 양수로 바꿔줌
		if (j > 1) return i * recursivePow(i, j-1);
		else if (j==0) return 1;
		else return i; //if (j ==1) 와 같다
	}

	private static double pow(int i, int j) {
		double result = 1;						 
		int exp = Math.abs(j); //절댓값 구하는 메소드 
				//j < 0 ? -j : j; 
		
			for (int k =0; k < exp; k++) { //곱하는 횟수
				result *= i ; 						
			}
		return j >0 ? result : 1/result;
	}

	
}//class
