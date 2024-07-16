package days07;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 2:01:53
 * @subject
 * @content
 */
public class Ex_04 {

	public static void main(String[] args) {
		//[정처기 실기]
		//1+1+2+3+5+8+13+21+34+...?? (100이하 항들의 합?
//나의 슈레기 풀이
		//f(n+1) = f(n) +f(n-1)
		
//		int [] f = new int [20]; //배열의 크기를 정해버린 것이 문제임
//		f[0] = 1;
//		f[1] = 1;
//		f[2] = 2;
//		for (int i = 2; i < 20; i++) {
//			f[i] = f[i-2] + f[i-1];
//		}
//		System.out.println(Arrays.toString(f));
//		int sum = 0;
//		int k=0;
//		while (f[k] <= 100) {
//			sum +=f[k]; 
//			k++;
//		}
//		System.out.println(sum);

		
		/*
		  int firstTerm = 1;
		  int secondTerm = 1;
		  int nextTerm ;
		  int sum = firstTerm + secondTerm;
		  System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		  while( true ) {
		     nextTerm = firstTerm + secondTerm;
		     if(nextTerm>100) break;
		     System.out.printf("%d+", nextTerm);
		     sum += nextTerm;
		
		     firstTerm = secondTerm;
		     secondTerm = nextTerm;
	  } // while
	
	  System.out.printf("=%d\n", sum );
		 */
		/* 3번풀이
		  int firstTerm = 1;
		  int secondTerm = 1;
		  int nextTerm = firstTerm + secondTerm ;
		  int sum = firstTerm + secondTerm;
		  System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		  while( nextTerm <= 100 ) {
			 //nextTerm = firstTerm + secondTerm; 이게 원래있던 자리임 이미 조건문 들어오고 검사하면 뭔소용
		    // if(nextTerm>100) break;
		     System.out.printf("%d+", nextTerm);
		     sum += nextTerm;
		
		     firstTerm = secondTerm;
		     secondTerm = nextTerm;
		     nextTerm = firstTerm + secondTerm; //보통 while문에서 i++같은게 마지막에 있는거랑 비슷한 원리: 이게 다음번 유효성 검사임 뭔말알?
	  } // while
	
	  System.out.printf("=%d\n", sum );
	  */
		
		//4번풀이 (시험)
		  int firstTerm = 1;
		  int secondTerm = 1;
		  int nextTerm = firstTerm + secondTerm ;
		  int sum = firstTerm + secondTerm;
		  System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		  while( (nextTerm = firstTerm + secondTerm) <= 100 ) {
		     System.out.printf("%d+", nextTerm);
		     sum += nextTerm;
		     firstTerm = secondTerm;
		     secondTerm = nextTerm;
		     //nextTerm = firstTerm + secondTerm;
	  } // while
	
	  System.out.printf("=%d\n", sum );

	}//main

}
