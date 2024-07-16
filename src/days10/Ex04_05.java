package days10;

import java.util.Arrays;

public class Ex04_05 {

	public static void main(String[] args) {
		//정렬
		//일정한 순서로 다시 배열하는 것.
		//오름차순(점점 올라감)  asc			내림차순(점점 내려감) desc

		// 버블 정렬
		int[] m = {3,5,2,4,1};
//		bubbleSort(m);
//		System.out.println(Arrays.toString(m));
		// 선택 정렬
		selectionSort(m);
		System.out.println(Arrays.toString(m));
		// 삽입 정렬
		// 병합 정렬




	}//main

	private static void selectionSort(int[] m) {
		//'자리'를 선택해서 정렬
		//[3,5,2,4,1]
		//01 02 03 04     i=0       j = 
		//     12 13 14
		//          23 24
		//               34
		
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = i+1; j <= 4; j++) {
				System.out.printf("%d-%d ",i,j);
				if( m[i] > m[j]) {// 
					System.out.print(" change " );
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
			
		}//for 
		
	}

	// [버블정렬]
	// 오름차순 정렬(asc) 12345
	private static void bubbleSort(int[] m) {
		//[3, 5, 2, 4, 1]
		// 0-1 1-2 2-3 3-4  i=0   j=3
		// 0-1 1-2 2-3      i=1   j=2
		// 0-1 1-2          i=2   j=1
		// 0-1              i=3   j=0
		for (int i = 0; i < 4; i++) {//회전의 단위
			for (int j = 0; j <= 3-i; j++) {//버블 비교의 단위
				System.out.printf("%d-%d비교 ", j , j+1 );
				if( m[j] > m[j+1]) {// 앞에 것이 크다면 자리 바꾸기
					System.out.print(" change " );
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}


	}

}//class
