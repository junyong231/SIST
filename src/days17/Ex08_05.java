package days17;

import java.util.Date;

public class Ex08_05 {

	public static void main(String[] args) {
		//설문조사
		// 24.6.25 9:00:00
		// 24.7.25 18:00:00
		
		//1. 24.6.20 12:00:00  설문조사 참여 불가 (설문 전)
		//2. 24.7.20 12:00:00  설문조사 참여 불가 (설문 중)
		//3. 24.7.25 19:00:00  설문조사 참여 불가 (설문 후)
		//4. 24.8.20 12:00:00  설문조사 참여 불가 (설문 후)
		
		Date st = new Date(2024-1900,7-1,20,12,0,0);//설문 시작
		Date et = new Date(2024-1900,7-1,20,12,0,0);//설문 종료
		
		Date t1 = new Date(2024-1900,6-1,20,12,0,0);//1. 24.6.20 12:00:00 전
		Date t2 = new Date(2024-1900,7-1,20,12,0,0);//2. 24.7.20 12:00:00 중
		Date t3 = new Date(2024-1900,7-1,25,19,0,0);//3. 24.7.25 19:00:00  끝
		Date t4 = new Date(2024-1900,8-1,20,12,0,0);//4. 24.8.20 12:00:00	끝
		
		//System.out.println(st);
		
		long start = st.getTime();
		long end = et.getTime();
		
		long [] now = {t1.getTime(),t2.getTime(),t3.getTime(),t4.getTime()};
		
		for (int i = 0; i < now.length; i++) {
			if (now[i]<start) System.out.println("설문 시작 전입니다");
			else if(now[i]>=start && now[i]<=end) System.out.println("설문 참여 가능합니다");
			else System.out.println("설문 끝났다");
		}
		
		
		//이런 함수가 있었음..
		t1.after(st);
		//System.out.println(t1.after(st)); 불리언
		t1.before(et);

		if (t1.after(st)&&t1.before(et)) {
			System.out.println("가능");
		}else System.out.println("삽불가능");
		
		
	}//main

}//class
