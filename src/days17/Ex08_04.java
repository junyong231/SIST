package days17;

import java.util.Date;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 4:17:53
 * @subject
 * @content
 *
 */
public class Ex08_04 {

	public static void main(String[] args) {
		//개강일로부터 현재까지 지난 시간 ?
		Date o =new Date(2024-1900,7-1,1,9,0,0); //오전 9시까지 맞춤
		//System.out.println(o.toLocaleString());
		
		Date t = new Date();
		//System.out.println(t.toLocaleString());

		long diffms = t.getTime() - o.getTime(); //두 날짜 간의 밀리세컨드 값
		System.out.println(diffms+"ms");
		System.out.println(diffms/1000+"s");
		System.out.println(diffms/1000/60+"m");
		System.out.println(diffms/1000/60/60+"h");
		System.out.println(diffms/1000/60/60/24+"d");
		
		long realTime [] =new long[5];
		
		int [] time = {1000,60,60,24};
		for (int i = 0; i < time.length; i++) {
			realTime[i] = diffms/time[i]; 
			
		}
		System.out.printf("%d일 %d시간 %d분 %d초 %d 지났습",realTime[4],realTime[3],realTime[2],realTime[1],realTime[0]);
		
		
		d_day(t,o); // 오늘 날짜와 개강한 날짜 넘겨서 메서드만들기
		
		
		
	}//main

	private static void d_day(Date t, Date o) {
		long diffMs = t.getTime() -o.getTime();
		
		long [] tArr = {1000*60*60*24,1000*60*60,1000*60,1000};
		
		long d = diffMs / (1000*60*60*24);
		diffMs= diffMs % (1000*60*60*24);
		System.out.print(d+"d ");
		
		long h = diffMs/(1000*60*60);
		diffMs= diffMs%(1000*60*60);
		System.out.print(d+"h ");
		
		long m = diffMs/(1000*60);
		diffMs= diffMs%(1000*60);
		System.out.print(d+"m ");
		
		long s = diffMs/(1000);
		long ms = diffMs= diffMs%(1000);
		System.out.print(d+"s "+ ms + "ms ");

		
		
		//시계가듯이 간다..
//		try {
//	         System.out.println("\n\n\n\n");
//	         Thread.sleep(1000);
//	         d_day(new Date(), o);//재귀함수
//	         
//	      } catch (InterruptedException e) { 
//	         e.printStackTrace();
//	      }
		
	}

}//class
