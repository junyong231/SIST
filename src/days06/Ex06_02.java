package days06;

import java.util.Iterator;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 3:38:18
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//구구단 세로로 2~9단 (안에 있는 놈을 단으로 잡기)
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%dx%d=%d\t",j,i,i*j);
			}//for j
			System.out.println(); //줄바꿈
		}//for i

	}//main

}//class
