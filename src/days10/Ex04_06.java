package days10;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30
	            , 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
	            86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142
	            , 145, 146, 150, 151, 160, 161, 166, 168, 
	            169, 172, 181, 184, 185, 191, 198 };
		
		System.out.println(m.length);//50;
		
		int n =150;//을 찾자
		
		//int index = sequenceSearch(m,n); //순차검색 index=찾은 위치값이라고 하자
		int index = binarySearch(m,n); //순차검색 index=찾은 위치값이라고 하자
		System.out.println(index);
		if (index == -1) {
			System.out.println("찾는 정수는 없다");
		} else {
			System.out.printf("찾는 정수는 %d인덱스 위치에 있다",index);
		}
		
		// Arrays.binaryResearch()가 있음 //오름차순 정렬 안되어 있어도 정렬까지해서 알아서 함 
		
		
		
	}//main

	//내가한건 왜 안됨? 무한루프됨
//	private static int binarySearch(int[] m, int n) {
//		int bot = 0, top = m.length-1; 
//		int mid;
//		int count= 0;
//		while (top >= bot) {
//			System.out.printf("%d횟수 \n",++count);
//			mid = (bot+top)/2;
//			if (m[mid] == n) return mid; //가운데 찍었는데 답인 경우
//			else if(m[mid] > n) top = mid -1; //미들보다 큰 쪽에 답 있는 경우 
//			else if(m[mid] < n) top = mid +1;//그 반대  아 여기가 문제였네 bot인ㄷ ㅋㅋ
//		}//while	
//		return -1;
//	}
	private static int binarySearch(int[] m, int n) {
		int bot = 0, top = m.length-1;
		int mid;
		int count = 0 ;
		while (top>=bot) {
			System.out.printf("%d 횟수.\n", ++count);
			mid = (bot+top)/2;
			if( m[mid] == n ) return mid;
			else if( m[mid] > n ) top = mid-1;
			else if( m[mid] < n ) bot = mid+1;
		}
		return -1;
	}


}//class
