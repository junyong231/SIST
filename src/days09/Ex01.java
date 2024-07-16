package days09;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author User
 * @Date 2024. 7. 11.
 * @subject 	만년 달력
 * @content		년도, 월 입력
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month;
		int [] ymArr = getInputYM(sc);//년도 월 입력받는 메소드로 ㄱㄱ 배열이라 값도 저장 가능
		
		year = ymArr[0]; //메소드에서 받아옴
		month = ymArr[1];//메소드에서 받아옴
		
		printCalendar(year,month); //연도와 월을 입력받아 달력 출력하는 메소드
		
		
		
	}//main

	public static void printCalendar(int year, int month) {
		// 1) 년 월 받고 그 해당월의 1일이 몇요일인지가 제일 중요
		// 1) 해당월의 마지막날이 며칠인지 알아야함
		
		int dayOfWeek = getdayOfWeek(year, month, 1); //연월1을 주면 요일값을 가져오겠다. 1은 1일임. 1일을 찾는게 중요하니까(시작점)
		int lastDay = getLastDay(year,month); //해당월의 마지막날 반환- 5월의 경우 31
		
		//진짜 그리기
		System.out.printf("\t\t\t[%d년 %d월]\n",year,month);
		System.out.println("-".repeat(50)); //선
		String strWeek = "일월화수목금토";
		for (int i = 0; i < strWeek.length(); i++) {
			System.out.printf("\t%c",strWeek.charAt(i));
		}
		System.out.println();
		System.out.println("-".repeat(50));
		System.out.println("-".repeat(50)); //달력 기본틀 그리기
		
		
		//날짜출력
		//공백찍는 for문 : 1의 위치 잡기 (별찍기를 기억하라)
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		System.out.printf("\t%d",1);
		for (int i = 2; i < lastDay; i++) {
			System.out.printf("\t%d",i);
			if ((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		

		
		
		
	}//method

	private static int getLastDay(int year, int month) {
		int lastDay = 0;		
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1]; //months가 배열이라 인덱스로 지정하려면 -1해야됨
		if (Ex02.isLeapYear(year)&&month==2) {//2월이 윤년이면 마지막 날이 하루 늘어남
			lastDay++;
		}
		//스위치보다 훨 간결한 코드
		
//		switch (month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			lastDay= 31;
//			break;
//			
//		case 4: case 6: case 9: case 11:
//			lastDay=30;
//			break;
//		case 2:
//			lastDay = Ex02.isLeapYear(year) ? 29 : 28; //윤년이면 2월은 29일, 아니면 28
//			break;
//		}
		return lastDay;
	}

	private static int getdayOfWeek(int year, int month, int day) {//요일을 찾는 메소드네
		//2020년 5월 입력해보자 //1년 1월 1일 == 월요일
		int totalDays=getTotalDays(year,month,day); // 
		int dayOfWeek=totalDays % 7; //0 일 ~6 토요일
		
		System.out.printf("%d.%d.%d [%d]일 [%c]요일\n" , year,month,day,totalDays,
									"일월화수목금토일".charAt(dayOfWeek) );
		
		return dayOfWeek;//5넣으면 5반환(금)
	}

	private static int getTotalDays(int year, int month, int day) {
		//1.1.1 ~ 2020년 5월 1일까지 어떻게?
		//365 x (2020-1)365+  31+28(29)+31+30+1
		//year(2020) 이전 년도까지의 총 날짜수
		int totalDays =0;
		for (int i = 1; i < year; i++) {//년도 단위까지의 토탈데이즈
			totalDays += Ex02.isLeapYear(i) ? 366 :365; //
		}				    	
								//1월 2월..  (1월의 인덱스는 0임을 인지)
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1; i++) {//그래서 -1있음 //월 단위까지의 토탈데이즈
			totalDays+=months[i];
		}
		if (Ex02.isLeapYear(year)&&month>=3) { //윤년이면서 내가 입력한 달이 3월달 이상이면 토탈데이+1
			//그럼 1,2월은? 
			totalDays++;
		}
		totalDays++;// 이제까지 계산한건 month단위까지라 7월찍으면 1일이 찍혀야되는 날까지 고려해서 1일 더 추가해야됨?? 집가서 더 분석 
		
		return totalDays;
	}

	private static int[] getInputYM(Scanner sc) {
		int [] ymArr = new int[2];
		System.out.print("년도, 월 입력 ?");
		int year = sc.nextInt();
		int month = sc.nextInt();
		ymArr[0] = year;
		ymArr[1] = month;

		return ymArr;
	}

}//class
