package days06;

import java.util.Scanner;


/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 12:37:10
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
	
		
	      // 임의의 다섯 정수(a,b,c,d,e) max, min 출력.
		
	      int a, b, c, d ,e;
//	      Scanner scanner = new Scanner(System.in);
//	      System.out.print("세 정수(a,b,c)를 입력 ? ");
	      a = (int)((Math.random()*100)+1);
	      b = (int)((Math.random()*100)+1);
	      c = (int)((Math.random()*100)+1);
	      d = (int)((Math.random()*100)+1);
	      e = (int)((Math.random()*100)+1);
	      
	      System.out.printf("%d,%d,%d,%d,%d",a,b,c,d,e);
	      
	      int max = Math.max( Math.max(a, b), c);
	      int max2 = Math.max( Math.max(max, c),d);
	      int max3 = Math.max( Math.max(max2, d),e);
	      
	      System.out.println("\n"+max3);

	      
	      
	      
	      

	      /*
	      int max = a > b ?  a : b;
	      max =  max > c ? max : c;

	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
	      */
//	      int max = Math.max( Math.max(a, b), c);
//
//	      int abMin = Math.min(a, b);
//	      int min = Math.min( c , abMin);


	}//main

}//class
