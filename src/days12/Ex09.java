package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 4:16:23
 * @subject days10 Ex01이 객체(클래스) 배열을 사용하면 얼마나 간단해지는지 확인해보자
 * @content
 * 						내일 1번 문제~~.
 * 					
 *
 */
public class Ex09 {
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;

	//클래스 배열 선언 (이름, 점수 등등 배열 뭉탱이 한줄로 줄임)
	static Student [] students = new Student[STUDENT_COUNT]; //***

	static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	static char con = 'y';



	public static void main(String[] args) throws IOException {
		//Student.java 만들기
		studentInfomationInput();
		studentInfomationOutput();


	}//main



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
			
			//위에서 카운트는 0으로 초기화했었음
			students[count] = new Student(); //이거 안하면 널포인트 에러 뜨는거임;; *****
			students[count].name = name;
			students[count].kor=kor;
			students[count].eng=eng;
			students[count].mat=mat;
			students[count].tot=tot;
			students[count].avg=avg;
			students[count].rank=rank;

			count++; 
			// 입력 계속 ?
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			// } while ( con == 'Y' || con == 'y');
		} while ( Character.toUpperCase(con) == 'Y'   );

		processRank();

	}




	private static void studentInfomationOutput() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t",i+1);
			students[i].dispInfo();
		}

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
			//rank[i] =1;  
			students[i].rank = 1; //비교할 사람 랭크 1로 잡고 큰놈 있으면 1씩 올리기
			for (int j = 0; j < count; j++) {
				if (students[i].avg < students[j].avg) {
					students[i].rank++;
				}
			}
		}
		}


}//class
