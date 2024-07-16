package days09;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject			정수 2진수로 출력(int)
 * 								8진수
 * 								16진수
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		int n = 10;
		int share, reminder ;
		

		
				
		int [] binaryArr=new int [32];
		int index = binaryArr.length-1;
		while (n != 0) {
			share = n/2;
			reminder = n%2;
			binaryArr[index--] = reminder;
			//System.out.printf("%d",reminder);
			n=share;			
		}

		//System.out.println(Arrays.toString(binaryArr));
		
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d",binaryArr[i]);
			if(i%8==7) System.out.print(" ");

		}
		System.out.println();
		
	}//main

}//class
