package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2024. 7. 12. - 오후 2:02:08
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		int index = 0;
		int [] m = new int[3];
		m[index++] = 10;  // index=0
		m[index++] = 20;  // 1
		m[index++] = 30;  // 2
		// index = 3
		if( m.length == index ) {
			// 풀방
			int [] temp = new int[ m.length + 3 ];//임시 배열은 m배열 +3의 크기를 가짐.
			for (int i = 0; i < m.length; i++) {//임시 배열에 m배열 요소들을 복사한다
				temp[i] = m[i];
			}
			m = temp;// m배열은 temp배열의 주소를 가진다 (방 6개짜리)
		}

		System.out.println( Arrays.toString(m) );

		/*
		 * [10][20][30]                      [0x200]m
		 * 0x100
		 *              |
		 * [10][20][30][ ][][]                       [0x200]temp
		 * 0x200
		 *
		 * 배열 복사
		 * m = temp
		 * */

	} // main

} // class





