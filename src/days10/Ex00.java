package days10;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 10:06:59
 * @subject	복습테스트 풀이
 * @content
 *
 */
public class Ex00 {
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;

	static String [] names = new String[STUDENT_COUNT];
	static int [] kors = new int[STUDENT_COUNT];
	static int [] engs = new int[STUDENT_COUNT];
	static int [] mats = new int[STUDENT_COUNT];
	static int [] tots = new int[STUDENT_COUNT];
	static int [] ranks = new int[STUDENT_COUNT];
	static double [] avgs = new double[STUDENT_COUNT];

	static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	static char con = 'y';
	
	 // 다 전역변수로 만들었다 
	
	
	public static void main(String[] args) throws IOException {


		studentInfomationInput(); //파라미터 다 지워도 됨 

		studentInfomationOutput();
		
		

	} // main

	private static void studentInfomationOutput() {
		
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
					i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i]);
		}

	}

	private static void studentInfomationInput() throws IOException {

		do {
			System.out.printf("> %d번 학생 이,국,영,수 입력 ? ", count+1);

			name =getName(); //scanner.next();
			kor =getScore(); //scanner.nextInt();
			eng =getScore(); //scanner.nextInt();
			mat =getScore(); //scanner.nextInt();
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
		
		processRank();

	}
	private static String getName() {
		Random rnd = new Random();
		String [] lastNames = {"김","이","박","최","권"};
		int index = rnd.nextInt(lastNames.length); //인덱스 랜덤 발생
		String name = lastNames[index];
		char  [] firstNames = new char[2]; //이름 :2문자 가정
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1)+'가'); //괄호 안은 한글 갯수에 관한 문제,,  +'가'를 함으로써 가~ (갯수만큼의 범위)를 돌림
		}
		String firstName =String.valueOf(firstNames);
		name += firstName;
		return name;
	}

	public static int getScore() {
		return (int)(Math.random()*101+1);
	}
	
	public static void processRank() {
		for (int i = 0; i < count; i++) {
			//rank[i] =1;  처음에 rank =1 안했으면 해줘야댐
			for (int j = 0; j < count; j++) {
				if (tots[i] < tots[j]) {
					ranks[i]++;
				}
			}
		}
		}


} // class

