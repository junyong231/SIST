package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오전 9:03:12
 * @subject 3반 30명 이름 국어 영어 수학 총점 반등수 전교등수
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT =3;
		final int STUDENT_COUNT = 30;

		//String [] names = new String[30];
		String [][] names = new String [CLASS_COUNT][STUDENT_COUNT];
		int [][][] infos = new int [6][CLASS_COUNT][STUDENT_COUNT]; //0국어,1영어,2수학,3총점,4등수,5전교등수 = 6면 필요
		//행 - 반을 나타냄 , 열 - 학생들 
		//ex) 2반 19번 학생의 수학 점수 == infos[2][1][18] 

		double [][] avgs =new double[CLASS_COUNT][STUDENT_COUNT];

		//입력받은 학생 수 저장할 변수
		int [] counts = new int [3];		

		char con = 'y'; //입력 계속할건지 물어볼 변수

		//한 명의 학생에 대한 정보
		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		Scanner sc = new Scanner(System.in);

		int ban; //1,2,3 반
		do {
			System.out.printf("반 입력 ? ");
			ban = sc.nextInt();

			//그 반의 학생 정보 입력
			System.out.printf("> %d반의 [%d]번 학생의 이름 국어 영어 수학 점수 입력 ? ",ban,counts[ban-1]+1); //+1 해야 '1번'부터 입력임
			//counts[ban-1]은 인덱스 값 때문에 한 것 맞음 : ban은 배열이기 때문에 해당 반 맞추려고 ㅇㅇ 그다음 그 반 카운트에 +1 해주는거지
			name =getName(); //scanner.next();
			kor =getScore(); //scanner.nextInt();
			eng =getScore(); //scanner.nextInt();
			mat =getScore(); //scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			rank = 1;
			wrank = 1;
			
			names[ban-1][counts[ban-1]] = name;
			infos[0][ban-1][counts[ban-1]] = kor; //0면은 국어
			infos[1][ban-1][counts[ban-1]] = eng; 
			infos[2][ban-1][counts[ban-1]] = mat;
			infos[3][ban-1][counts[ban-1]] = tot; 
			infos[4][ban-1][counts[ban-1]] = rank;
			infos[5][ban-1][counts[ban-1]] = wrank; 
			avgs[ban-1][counts[ban-1]] = avg;

			counts[ban-1] ++;

			System.out.println("입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t학생 정보 출력 ( %d명 )\n",총학생수);
		for (int i = 0; i < counts.length; i++) { //반 수만큼 돌리기
			System.out.printf("[%d반 : %d 명]\n",i+1,counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\t%d\t\n",
						j+1,names[i][j],infos[0][i][j],infos[1][i][j],infos[2][i][j],infos[3][i][j],avgs[i][j],infos[4][i][j],infos[5][i][j]);
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
