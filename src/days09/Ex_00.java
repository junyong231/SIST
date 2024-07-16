package days09;

import java.util.Calendar;
import java.util.Scanner;

public class Ex_00 {

	public static void main(String[] args) {
		// 1. 머니(money)를 입력받아서 각 화폐단위의 갯수를 
//		   출력하는 코딩을 하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("money를 입력하시오 ");
		int money = sc.nextInt();
		
		int [] coin = {50000, 10000, 5000, 1000, 500, 100, 50 ,10 ,5, 1 };
		
		int share = 0;
		
		for (int i = 0; i < coin.length; i++) {
			share=money/coin[i];
			money=money%coin[i];
			System.out.printf("%d원권:\t %d장\t %d남음\n",coin[i],share,money);
		}
		

		
//		   2. 로또645 에서  로또 번호 중복 체크하는 메서드만 선언하세요
//		      isDuplicateLotto()    

		
		int [] lotto = new int [6];
		
		//isDuplicateLotto(lotto);
		




//		   3. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드만 선언하세요.
//		System.out.println("주민번호 입력"); //891001-2374567
//		int rrn = sc.nextInt();
//		String rrn2 = Integer.toString(rrn);
//		americanAge(rrn2);
//		System.out.printf("만나이 %d세",americanAge(rrn2));
		
		String rrn2 ="891001-2374567";
		americanAge(rrn2);
		System.out.printf("만나이 %d세",americanAge(rrn2));

	}//main


//	private static void isDuplicateLotto(int[] lotto,int searchNum,) {
//		
//		이렇게 가ㅑ됨
//	}


	private static int americanAge(String rrn2) {
		int birthYear =Integer.parseInt(rrn2.substring(0,2)) ; // 89
		int birthMD =Integer.parseInt(rrn2.substring(2,6)) ; // 1001
		
		
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		int thisMD = (cal.get(Calendar.MONTH)+1)*100+cal.get(Calendar.DATE);
		
		birthYear += 1900; //그냥 임의로 줬습니다
		int yearAge = thisYear - birthYear; // 연나이
		
		if (birthMD>thisMD) { //생일 지나지 않음
			yearAge-=1;
		}
		
		return yearAge;
		
		
	}


//	private static void isDuplicateLotto(int[] lotto) {
//		
//		lotto[0] =(int) ((45*Math.random())+1);
//		
//		boolean duplicate = false;
//		
//		//do while로 해야되나
//		for (int i = 1; i < lotto.length; i++) {
//			lotto[i] =(int) ((45*Math.random())+1);
//			if (lotto[i-1] == lotto[i]) { //중복이라면
//				break;
//			}//if 
//			 
//		}//for
//		
//		
//	}// 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
