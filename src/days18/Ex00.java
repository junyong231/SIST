package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {

		//		1.  년도 year를 입력받아서 
		//		    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
		//		    ( 조건 : Date 클래스 사용 )
		//		    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
		//		    
		//		    실행결과 예제)
		//		    2005년 
		//		    
		//			1월 : 31일
		//			2월 : 28일
		//			3월 : 31일
		//			4월 : 30일
		//			5월 : 31일
		//			6월 : 30일
		//			7월 : 31일
		//			8월 : 31일
		//			9월 : 30일
		//			10월 : 31일
		//			11월 : 30일
		//			12월 : 31일
		//			
		//		    int  getLastDay(int year, int month){
		//		    }
		int year = 0 ;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("> 연도 입력 ? ");
			year = sc.nextInt();
		} catch (Exception e) {

		}
		
		Date d = new Date();
		d.setYear(year);
		System.out.println(d.getYear()+"년");
		
//		for (int i = 1; i <= 12; i++) {
//			int lastDay = getLastDay(year, i);
//			System.out.printf("%d월 : %d일\n", i, lastDay);
//		}
		

		//캘린더 함수로 해본것
		System.out.println(getLastDay2(2024,7));
		
		






		//3. 수료일(2024.12.14. 18:00:00)로 부터 오늘까지 남은 일수 계산을 하세요..

		//		Calendar ca = Calendar.getInstance();
		//		ca.set(2024, 12-1, 14, 18, 0);
		//		int start = (ca.get(Calendar.MONTH)+1);
		//		System.out.println(start);

		//		Date to = new Date();
		//		System.out.println(to);
		//		Date su = new Date(2024-1900, 12-1, 14, 18, 0);
		//		System.out.println(su);
		//		long nokoru = su.getTime()-to.getTime();
		//		System.out.println("남은 시간 "+nokoru/1000/60/60/24 + "일");
		//		

		//		4. 설문조사 기간이 
		//		   시작일  2024.7.20  00:00:00
		//		   종료일  2024.7.24  00:00:00
		//		   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.

		//		Date st = new Date(2024-1900,7-1,20,0,0);
		//		Date ed = new Date(2024-1900,7-1,24,0,0);
		//		if (to.getTime()>=st.getTime()&&to.getTime()<=st.getTime()) {
		//			System.out.println("투표 가능");
		//		}else System.out.println("안됩니다");







	}//main
	//date로 마지막날짜 가져오는 함수
	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month-1,1);
		d.setMonth( d.getMonth() + 1 );
		d.setDate(  d.getDate() - 1 );

		return d.getDate();
	}
	//캘린더 함수로 마지막날짜
	private static int getLastDay2(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		int lastDay2=(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return lastDay2;
	}
}//class
