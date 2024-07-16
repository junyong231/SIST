package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject 재귀함수
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//트리구조 처리 작업할 때 사용...
		//[팩토리얼]
		//n! = n(n-1)*(n-2)*...*1
		//0! = 1 이라고 약속됨
		int n = 5;
		//int result = factorial(n);
		int result = recursiveFactorial(n);
		System.out.println("="+result);
		
		

	}//main

	
	
	private static int recursiveFactorial(int n) {
		if (n==1) return n;
		else return n*recursiveFactorial(n-1);//자기가 자기 호출함
	}



	private static int factorial(int n) {
		int result =1;
		for (int i = n; i >= 1; i--) {
			System.out.printf("%d*",i);
			result *=i;
		}
		return result;
	}

}//class
