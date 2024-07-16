package days09;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 10. - 오후 11:46:47
 * @subject 
 * @content
 */
public class Test0710 {

	public static void main(String[] args) {
		// 콜바이 밸류는 함수의 변수와 파라미터의 변수가 서로 전혀 다른 존재라고 봐야하고 (그냥 복사한 값)
		// 콜바이 레퍼런스의 경운 참조형인 변수(배열)는 함수에서도 메인에 있는 값을 조정 가능 (서로 같은 변수)
		
		int money =123643;
		
		//for문으로 돌리자
		
		int [] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; //종류
		int share = 0; //사용한 (지폐) 수
		String[] coinName = {"오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "오원", "일원"};
		
		for (int i = 0; i < coin.length; i++) {
			share = money/coin[i]; //나눈 몫은 사용한 장 수가 된다
			money = money%coin[i];// 나눈 나머지는 남은 돈이 된다
			
			System.out.printf("%s권:\t%d장 사용\t%d원 남음\n",coinName[i],share,money);
		}
		
		
		
//주민번호로 만나이 뽑기
		
//		String rrn = "891022-2034234";
//		//연나이: 35 만나이: 생일안지났으니 34 찍혀야댐
//		
//		getYearAge(rrn); //int로 연나이 반환
//		System.out.println(getYearAge(rrn)+"세"); //35
//		
//		getAmericanAge(rrn);
//		System.out.println(getAmericanAge(rrn)+"세");//34세

	}//main

	private static int getAmericanAge(String rrn) {
		Calendar cal = Calendar.getInstance();
		int birthMD = Integer.parseInt(rrn.substring(2,6)); //1022 가져옴
		int thisMD = (cal.get(Calendar.MONTH)+1) *100 + cal.get(Calendar.DATE); //달은 0부터 시작해서 +1해주기
		
		//System.out.printf("birthMD: %d ,,  thisMD: %d",birthMD,thisMD);
		
		int yearAge =getYearAge(rrn);
		
		//생일이 더 크면 안지났다는 뜻임
		if (birthMD > thisMD) {
			yearAge-=1;
		}
		
		return yearAge;  
		
	}

	private static int getYearAge(String rrn) {
		int nensei = Integer.parseInt(rrn.substring(0,2)); //89 인트
		int century = Integer.parseInt(rrn.substring(7,8));//2
		
		switch (century) {
		case 1: case 2: case 5: case 6:
			century = 1900;
			break;
		case 3: case 4: case 7: case 8:
			century=1800;
			break;
		default:
			break;
		}//century switch
		
		int birthYear = century + nensei; //출생년도 정확하게 파악 1989
		//System.out.println(birthYear); 
		
		Calendar cal = Calendar.getInstance();//스캐너마냥 이제 쓸 수 있게됨
		int thisYear = cal.get(Calendar.YEAR);
		
		return  thisYear - birthYear; 
		
	}



}//class
