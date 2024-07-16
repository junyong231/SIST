package days07;

import java.util.stream.IntStream;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 4:36:04
 * @subject
 * @content
 */
public class Ex_06_04 {

	public static void main(String[] args) {

		int result = 0;

		result = hap(1,2);
		System.out.println( result);

		result = hap(1,2,3,4,5);
		System.out.println( result);

		result = hap(1,2,3,4,5,6,7,8,9,10);
		System.out.println( result);

		int [] m = {10,20,30};
		result = hap( m );
		System.out.println( result);

	} // main

	// 가변인자 
	
	//람다식과 스트림
	public static int hap(int...args) {
		return IntStream.of(args).sum();	
	}//
	
	
/*	
	public static int hap(int...args) {
		int result = 0;
		
//		      for (int i = 0; i < args.length; i++) {
//		         result += args[i];
//		      }
		
//		foreach문으로도 다 매개변수로 만들기 가능		      
//		for (int n : args) {
//			result += n;
//		}
		return result;
	}
*/



}//class
