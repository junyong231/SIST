package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 10:23:49
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
	         if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
	         System.out.printf("[%d]", i);
	         if (i%10 == 9) {
	        	 if (lineNumber%10==1) {
	        		 System.out.println("\n다음 10줄 출력하려면 Enter 입력");
	        		 int nextByte = System.in.read();
	        		 System.in.skip(System.in.available()); 
						if (nextByte==13) {
							continue;
						} else {
							break;
						}
				}//if linNumber
	        	 System.out.println(); //한줄개행
	         }//if i%10 == 9 (개행자리)
	         
	      } // for
		
		
		/*강의
		 *    public static void main(String[] args) throws IOException {
      for (int i = 0, lineNumber = 1; i < 256; i++) {
         if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
         System.out.printf("[%c]", i);
         if (i%10 == 9) {
            System.out.println();
            
            if (i%100==99) {
               System.out.print("엔터치면 계속합니다.");
               System.in.read(); // 13,10
               System.in.skip(System.in.available());
            }
         }

		 */

	}//main

}//class
