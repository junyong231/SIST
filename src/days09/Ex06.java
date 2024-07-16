package days09;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.=오후 5:05:20
 * @subject 30명의 이름~ 성적 데이터 받기
 * @content 내일 시험!
 *
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		final int STUDENT_COUNT = 30; //이것만 수정하면 학생 수 수정 쉬움
		
		String name;
		int kor,eng,mat,tot,rank;
		double avg;
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		
		Scanner sc =new Scanner(System.in);
		int count = 0; //입력받은 학생 수
		char con = 'y'; //입력 계속할지 컨펌받는 변수
		
		do {
			System.out.printf("> %d번 학생 이름,국,영,수 입력 ? ",count+1);
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			tot = kor + eng + mat;
			avg=(double) tot/3;
			rank =1; //일단
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;
			//count로 방번호 바꿔주면 됨
			
			
			count ++;
			//입력 계속 ?
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} //while (con == 'Y' || con =='y');
		while( Character.toUpperCase(con)=='Y'); //이렇게 하면 ||안써도 됨
	
		System.out.printf("");

	}//main

}//class
