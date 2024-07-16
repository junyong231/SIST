package days10;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 10:06:59
 * @subject	복습테스트 풀이
 * @content
 *
 */
public class Ex01 {

	   public static void main(String[] args) throws IOException {
		      String name;
		      int kor, eng, mat, tot, rank;
		      double avg;

		      final int STUDENT_COUNT = 30;

		      String [] names = new String[STUDENT_COUNT];
		      int [] kors = new int[STUDENT_COUNT];
		      int [] engs = new int[STUDENT_COUNT];
		      int [] mats = new int[STUDENT_COUNT];
		      int [] tots = new int[STUDENT_COUNT];
		      int [] ranks = new int[STUDENT_COUNT];
		      double [] avgs = new double[STUDENT_COUNT];

		      Scanner scanner = new Scanner(System.in);
		      int count = 0;
		      char con = 'y';

		      count = studentInfomationInput(names, kors, engs, mats, tots, ranks, avgs, scanner); //이게 중요하네 왜 count를 받는지
		      
		      studentInfomationOutput(names, kors, engs, mats, tots, ranks, avgs, count);

		   } // main

		   private static void studentInfomationOutput(String[] names, int[] kors, int[] engs, int[] mats, int[] tots,
			int[] ranks, double[] avgs, int count) {
				for (int i = 0; i < count; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
							i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i]);
				}
		
	}

		private static int studentInfomationInput(String[] names, int[] kors, int[] engs, int[] mats, int [] tots, int[] ranks,
		         double[] avgs, Scanner scanner) throws IOException {
		      String name;
		      int kor, eng, mat, tot, rank;
		      double avg;
		      
		      int count = 0 ;
		      char con = 'y';

		      do {
		         System.out.printf("> %d번 학생 이,국,영,수 입력 ? ", count+1);

		         name = scanner.next();
		         kor = scanner.nextInt();
		         eng = scanner.nextInt();
		         mat = scanner.nextInt();
		         tot = kor + eng + mat;
		         avg = (double)tot / 3;
		         rank = 1;

		         names[count] = name;
		         kors[count]=kor;
		         engs[count]=eng;
		         mats[count]=mat;
		         tots[count]=tot;
		         avgs[count]=avg;
		         ranks[count]=rank;

		         count++;
		         // 입력 계속 ?
		         System.out.print("> 학생 입력 계속 ? ");
		         con = (char)System.in.read();
		         System.in.skip(System.in.available());
		         // } while ( con == 'Y' || con == 'y');
		      } while ( Character.toUpperCase(con) == 'Y'   );

		      return 0;
		   }



		} // class

