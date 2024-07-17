package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days12.Student;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오전 9:51:59
 * @subject	3반 30명 성적처리
 * @content	클래스 배열 사용
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT =3;
		final int STUDENT_COUNT = 30;
		
		Student [][] students = new Student [CLASS_COUNT][STUDENT_COUNT]; 

		int [] counts = new int [3];		

		char con = 'y';

		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		Scanner sc = new Scanner(System.in);

		int cIdx; //0,1,2로 저장되게 해보자
		do {
			System.out.printf("반 입력 ? ");
			cIdx = sc.nextInt() -1;

			//그 반의 학생 정보 입력
			System.out.printf("> %d반의 [%d]번 학생의 이름 국어 영어 수학 점수 입력 ? ",cIdx +1 ,counts[cIdx]+1);

			name =getName();
			kor =getScore();
			eng =getScore(); 
			mat =getScore();
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			rank = 1;
			wrank = 1;

			students[cIdx][counts[cIdx]] = new Student();
			
			students[cIdx][counts[cIdx]].name = name;
			students[cIdx][counts[cIdx]].kor = kor; 
			students[cIdx][counts[cIdx]].eng = eng; 
			students[cIdx][counts[cIdx]].mat = mat;
			students[cIdx][counts[cIdx]].tot = tot;
			students[cIdx][counts[cIdx]].avg = avg;
			students[cIdx][counts[cIdx]].wrank = wrank; 
			students[cIdx][counts[cIdx]].rank = rank;

			counts[cIdx] ++;

			System.out.println("입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());


		} while (Character.toUpperCase(con)=='Y');
		
		//반, 전 등수 처리 시작
		
		for (int i = 0; i <counts.length; i++) { //등수 정하려는애(의 반) 고름
			for (int j = 0; j < counts[i]; j++) {// 그 반의 몇번째 학생인지 선정
				
					for (int i2 = 0; i2 < counts.length; i2++) {// 비교 대상 (전교생)의 반
						for (int j2 = 0; j2 < counts[i2]; j2++) {//비교 대상은 그 반의 몇번째 학생인가? => i2로 돌려야지 그 반의 학생수만큼 for문 돌음. j2로 해서 오류났었음
							if (students[i][j].avg < students[i2][j2].avg) {
								students[i][j].wrank++;
								if (i==i2) { //반까지 같다면
									students[i][j].rank++;
								}
							}
							
						}
					}
			}//for j
		}//for i
		
		//반, 전 등수 처리 끝
		
		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t학생 정보 출력 ( %d명 )\n",총학생수);
		for (int i = 0; i < counts.length; i++) { //반 수만큼 돌리기
			System.out.printf("[%d반 : %d 명]\n",i+1,counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("[%d] ",j+1);
				students[i][j].dispInfo();
			}
		}


	}//main

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

}//class
