package days16;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		/*
	      문제 설명

	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는
	      문자열을 리턴하는 함수, solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 
	      리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
		 */

		System.out.println(solution(10));


		
		
	}//main

	
	private static String solution(int n) {
		StringBuilder answer = new StringBuilder();
		int 몫 = n/2 ;
		int 나머지 = n%2;
		for (int i = 0; i <  몫; i++) {
			answer.append("수박");
		}
		if ( 나머지 == 1) answer.append('수');
		return answer.toString();
	}
	 
	
	//? 풀이
//	private static String solution(int n) {
//		return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());
//	}

	
	
	
	//내풀이
	/*
	private static String solution(int n) {
		StringBuilder answer = new StringBuilder();

		char [] wm = {'수','박'};

		int count =n;
		while (count >0) {
			if (n%2==1) {
				answer.append(wm[(count+1)%2]);
				count--;
				continue;
			}
			answer.append(wm[(count)%2]);
			count--;
		}


		return answer.toString();
	}


//sw변수로 매번 다르게 (수,박) 찍게 하는게 %안물어보니까 이득이네

	 */




}//class
