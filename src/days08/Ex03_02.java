package days08;

import java.util.Calendar;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오전 11:23:53
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [주민등록번호]
		// *** 5. 나이( 만나이, 세는나이 )
		String rrn = "890123-1700001";

		/*                 2022.12.31 2023.1.1  23.12.31 24.1.1
		 * 1. 한국식 나이      1살       2살       2살     3살
		 *                 올해년도-생일년도 +1 =1살
		 * 2. 연나이 = 올해년도 - 생일년도
		 * 2. 만 나이          0살       0살       1살     1살
		 *                = 올해년도-생일년도    생일지나지않으면 1살 빼기
		 *                    2024  - 2022      = 2살 -1 = 1살
		 *
		 *                            2살-1
		 * */

		int koreaAge = getKoreaAge(rrn);    //  한국식 나이
		System.out.printf("> 한국식(세는) 나이 : %d 살.\n", koreaAge);
		int americanAge = getAmericanAge(rrn); //  만 나이
		System.out.printf("> 만 나이 : %d 살.\n", americanAge);
	} // main

	// 연 나이 = 올해년도 - 생일년도
    private static int getYearAge(String rrn) {
    	//               "1999년 1월 23일"          "1999"
    	int birthYear = Integer.parseInt( Ex03.getBirthday(rrn).substring(0, 4) );
    	// Calendar 클래스 현재(올해)년도
    	Calendar cal = Calendar.getInstance();
    	int thisYear = cal.get(Calendar.YEAR);

		return thisYear - birthYear;
	}
	// 세는 나이(한국나이) = 연나이 + 1
	private static int getKoreaAge(String rrn) {
		return getYearAge(rrn) + 1;
	}

	// 만 나이 = 연나이       -1(생일이 지나지 않으면 1살 뺀다)
	/*
	private static int getAmericanAge(String rrn) {
		int americanAge = getYearAge(rrn);
		// 오늘 날짜가 생일 날짜 지나지 않았다면  -1
		int thisMonth = 7, thisDay = 10;
		int birthMonth, birthDay;
		birthMonth = Integer.parseInt( rrn.substring(2, 4) );
		birthDay = Integer.parseInt( rrn.substring(4, 6) );

		 // 1 풀이
//		if (thisMonth < birthMonth ) {
//			americanAge--;
//		}else if( thisMonth == birthMonth && thisDay < birthDay  ) {
//			americanAge--;
//		}

		// 2 풀이
//		if (thisMonth < birthMonth || thisMonth == birthMonth && thisDay < birthDay) {
//			americanAge--;
//		}
		return americanAge;
	}
	*/

	// 710
	// 123
	private static int getAmericanAge(String rrn) {  // 시험 [만나이]
		int americanAge = getYearAge(rrn);
		// 오늘 날짜가 생일 날짜 지나지 않았다면  -1
		int thisMonth = 7, thisDay = 10;
		Calendar cal = Calendar.getInstance();
		thisMonth = cal.get(Calendar.MONTH) + 1;
		thisDay = cal.get(Calendar.DATE);
		int thisMD = 7*100 + 10;
		int birthMD = Integer.parseInt( rrn.substring(2, 6) );
		if( thisMD < birthMD ) {
			americanAge--;
		}
		return americanAge;
	}


	private static String getBirthday(String rrn) {
		//  YYMMDD G
		// "990123-1700001"
		int year = Integer.parseInt( rrn.substring(0, 2) );  // "99"->99
		int month = Integer.parseInt( rrn.substring(2, 4) );
	    int day = Integer.parseInt( rrn.substring(4, 6) );

	    String gender = getGender(rrn);  // "1900/남/외국인"

	    int century = Integer.parseInt( gender.split("/")[0] ) ;

	    year = century + year; // 1999

	    // "1999년 1월 23일"
	    String birthday = String.format("%d년 %d월 %d일"
	    		                       , year, month, day);
		return birthday;
	}

	private static String getGender(String rrn) {
		// "1900/남/외국인"
	    //  YYMMDD G
		// "990123-1700001"
		int gender = Integer.parseInt( rrn.substring(7, 8) );  // 1


		char 성별 = gender%2==0 ? '여' : '남';
		String 국적 = "내국인";
		// [5-8]
		if( 5 <= gender && gender <= 8 ) 국적 = "외국인";

		int 세기 = 1800;
		switch (gender) {
		case 1: case 2: case 5: case 6:
			세기 = 1900;
			break;
		case 3: case 4: case 7: case 8:
            세기 = 2000;
            break;
		default:
			세기 = 1800;
			break;
		}

		return String.format("%d/%c/%s", 세기, 성별, 국적);
	}

} // class





