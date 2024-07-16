package days08;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오후 4:13:27
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// [정보처리 기사 실기]
		int money = 125760;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		int count = 0;
		int share, reminder; // 몫, 나머지 변수

		//                   /5     /2    /5    /2    /5  /2   /5  /2 /5
		int [] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };

		for (int i = 0; i < unit.length; i++) {
			count = share = money / unit[i];
			reminder = money % unit[i];
			System.out.printf("%s원 : %d 개\t\t %d\n"
					,sunit[i], count, reminder);
			money = reminder;
		}



		/*
		// 5만원 : 2개        25760
		count = share = money / 50000;
		reminder = money % 50000;
		System.out.printf("5만원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 1만원 : 2개         5760
		count = share = money / 10000;
		reminder = money % 10000;
		System.out.printf("1만원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 5천원 : 1개          760
		count = share = money / 5000;
		reminder = money % 5000;
		System.out.printf("5천원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 1천원 : 0개          760
		count = share = money / 1000;
		reminder = money % 1000;
		System.out.printf("1천원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 5백원 : 1개          260
		count = share = money / 500;
		reminder = money % 500;
		System.out.printf("5백원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 1백원 : 2개           60
		count = share = money / 100;
		reminder = money % 100;
		System.out.printf("1백원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 5십원 : 1개           10
		count = share = money / 50;
		reminder = money % 50;
		System.out.printf("5십원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 1십원 : 1개            0
		count = share = money / 10;
		reminder = money % 10;
		System.out.printf("1십원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 5원   : 0개            0
		count = share = money / 5;
		reminder = money % 5;
		System.out.printf("5원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		// 1원   : 0개            0
		count = share = money / 1;
		reminder = money % 1;
		System.out.printf("1원 : %d 개\t\t %d\n", count, reminder);
		money = reminder;
		*/



	} // main

} // class








