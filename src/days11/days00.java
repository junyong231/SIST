package days11;

import java.util.Arrays;

public class days00 {

	public static void main(String[] args) {
//		int[] m = {1,2,3,4,5,6};
//		int[] n = {1,8,4,7,3,6};
//		int search = 2;
//		binarySearch(m,search);
		
//		bubbleSort(n);
		
//		int [] m = {1,2,3};
////		   위의 배열에 1번째 인덱스에 4를 삽입하는 코딩을 하세요.
//		int [] temp = new int [4];
//		for (int i = 0; i < m.length; i++) {
//			temp[i] = m[i];
//		}
//		m=temp;
//		
//		for (int i = 2; i >= 1; i--) {   //뒤에 숫자가 앞의 수를 넘겨받는 작업 2번 수행
//			m[i+1] =m[i];
//		}
//		m[1] = 4;
//		
//		System.out.println(Arrays.toString(m));
//		arraycopy 메소드 쓸 수도 있군
//		System.arraycopy(m,1,n,index+1,m.length-1);
		//고정값 지양하라
		
//		

//		4. 1차원 배열을 2차원 배열로 변환
		   int [] m = {1,2,3,4,5,6};
		   int [][] n = new int[2][3];  
			
		
		for (int i = 0; i < n.length; i++) {//행 선정 (2번)
			for (int j = 0; j < n[i].length; j++) {
				if (i==1) {
					n[i][j]=m[j+3];
					continue;
				}
				n[i][j]=m[j];
			}	
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i])); //이렇게만 하면 배열이 나오니까 끝이네
			for (int j = 0; j < n[i].length; j++) {
				//System.out.print(n[i][j]);
			}
		}
//쌤 풀이
		/*
	      int [] m = {1,2,3,4,5,6};
	      int [][] n = new int[2][3];

	      // i=0              0 0
	      // i=1              0 1
	      // i=2              0 2
	      // i=3              1 0
	      // i=4              1 1
	      // i=5              1 2
	      for (int i = 0; i < m.length; i++) {
	         System.out.printf("%d - [%d][%d] \n"
	               , i, i/(n[0].length), i%(n[0].length));
	         n[i/n[0].length][i%n[0].length] = m[i];
	      }
	      //
	      for (int i = 0; i < n.length; i++) {
	         System.out.println(Arrays.toString(n[i]));
	      }
		*/
	}//main

	private static void bubbleSort(int[] n) {
		int temp = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length-1; j++) {
				if (n[j]<n[j+1]) {
					temp = n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

	private static int binarySearch(int[] m, int search) {
		int top =m.length-1;
		int bot = 0;
		while (top>=bot) {
			int mid = (top + bot)/2;
			if (mid == search) return mid;
			else if(mid < search) bot =mid +1;
			else if(mid > search) top =mid -1;
		}
			

		return -1;
		
	}

}//class
