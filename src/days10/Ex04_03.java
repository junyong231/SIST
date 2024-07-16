package days10;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오후 2:23:50
 * @subject
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//배열 복사 
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		int[] temp = new int[m.length+5];
		//System.out.println(Arrays.toString(temp));
		
//		for (int i = 1 ; i < m.length-1; i++) {
//			temp[i+4] = m[i];
//		}
		
		System.arraycopy(m, 0, temp, 1, 5); //(복사할 배열, 복사시작index, 복사배열받는배열, 받는시작index, 받는갯수)
		System.out.println(Arrays.toString(temp));
	}//main

}//class
