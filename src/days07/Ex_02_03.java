package days07;

import java.util.Iterator;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오전 10:46:36
 * @subject
 * @content
 */
public class Ex_02_03 {

	public static void main(String[] args) {
		
		//		__*				(1,3)
		//		_***			(2,2)	(2,4)		
		//		*****	(3,1)			(3,5)

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4&&j-i<=2?"*":"_");
			}
			System.out.println();
		}
		
		
	}//main

}//class
