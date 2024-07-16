package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Renshu {

	static Student [] students = new Student[30];
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	static char con = 'Y';


	public static void main(String[] args) throws IOException {



		studentInfomationInput();
		studentInfomationOutput();


	}//main
	
	
	private static void studentInfomationOutput() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t",i+1);
			students[i].dispInfo();
		}

	}
	
	private static void studentInfomationInput() throws IOException {
		do {
			System.out.println("> 학생 이름 국어 영어 수학 점수 입력 ? ");

			students[count] = new Student();
			students[count].name = getName(); 
			students[count].kor = getScore();
			students[count].eng = getScore();
			students[count].mat = getScore();
			students[count].tot =students[count].kor+students[count].eng+students[count].mat;
			students[count].avg = (double) (students[count].tot/3);
			students[count].rank = 1;
			
			count ++;

			System.out.println("> 계속 입력 (Y/N) ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());


		} while (Character.toUpperCase(con)=='Y');

		processRank();
		
	}
	private static void processRank() {
		
		for (int i = 0; i < count; i++) {
			students[i].rank =1;
			for (int j = 0; j < count; j++) {
				if (students[i].avg < students[j].avg) {
					students[i].rank ++;
				}
			}
				
		}//  for i		
	}
	public static int getScore() {
		return (int)(Math.random()*101+1);
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
}//class
