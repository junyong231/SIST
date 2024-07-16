package days06;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 12:19:14
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//세 정수 a,b,c 입력받아 max, min 출력
		int a=0,b=0,c =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수 a,b,c입력하시오");
		String input = sc.next();
		String [] abc = input.split(",");
		a = Integer.parseInt(abc[0]);
		b = Integer.parseInt(abc[1]);
		c = Integer.parseInt(abc[2]);
	
		
		int abmax =Math.max(a, b);
		int bcmax =Math.max(abmax,c);
		System.out.println(bcmax);
		
		int abmin =Math.min(a, b);
		int bcmin =Math.min(abmin,c);
		System.out.println(bcmin);
		
		
		//쌤코드
	      // 세 정수(a,b,c)를 입력받아서 max, min 출력.
//	      int a, b, c;
//	      Scanner scanner = new Scanner(System.in);
//	      System.out.print("세 정수(a,b,c)를 입력 ? ");
//	      a = scanner.nextInt();
//	      b = scanner.nextInt();
//	      c = scanner.nextInt();
//
//	      /*
//	      int max = a > b ?  a : b;
//	      max =  max > c ? max : c;
//
//	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
//	      */
//	      int max = Math.max( Math.max(a, b), c);
//
//	      int abMin = Math.min(a, b);
//	      int min = Math.min( c , abMin);


	}//main

}//class
