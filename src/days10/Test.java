package days10;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 9:02:20
 * @subject 복습테스트
 * @content
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//1. 30명 학생의 이름,국,영,수,총,평,등를 처리하는 배열을 선언
		//		하고 학생정보 입력 후 출력하는 코딩을 하세요. 
		//		 ( 조건 : 학생정보 입력 및 출력하는 메서드를 만들어서 코딩
		//		   studentInfomationInput()
		//		   studentInfomationOutput()

		//	final int STUDENT_COUNT = 30;
		final int STUDENT_COUNT = 30;
		Scanner sc = new Scanner(System.in);
		String [] names = new String [STUDENT_COUNT];
		int [] kors = new int [STUDENT_COUNT];
		int [] engs = new int [STUDENT_COUNT];
		int [] mats = new int [STUDENT_COUNT];
		int [] tots = new int [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		char con ='y';
		int count =0;
		int rank =1;
		
		do {
			System.out.println("학생 이름 국어 영어 수학 입력 ? ");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			studentInfomationInput(name,kor,eng,mat,count, names,kors,engs,mats, tots, avgs);
			count ++;
			
			System.out.println(" 계속 ? (Y/N)");
			con=(char) System.in.read();
			System.in.skip(System.in.available());


		} while (Character.toUpperCase(con)=='Y');


		studentInfomationOutput(count, names, kors, engs, mats, tots, avgs);






	}//main

	private static void studentInfomationOutput(int count,String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
					i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i]);
		}
		
	}

	public static void studentInfomationInput(String name, int kor, int eng, int mat, int count, String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs) {
		
		names[count] = name;
		kors[count] = kor;
		engs[count] = eng;
		mats[count] = mat;
		tots[count] = kors[count]+engs[count]+mats[count];
		avgs[count] = tots[count]/3;



	}//입력


}//class
