package days17;

import java.util.Calendar;

public class Ex09_02 {

	public static void main(String[] args) {
		//개강일로부터 현재까지 d h m s ms.. 출력 
		//Calendar 사용해서 해보자
		
		Calendar c = Calendar.getInstance();
		
		
		
		c.set(2024, 7, 1, 9, 0, 0); //시작
		int start = c.get(Calendar.DATE);//설정완료
		c.get(Calendar.SECOND);//설정완료
		c.setTimeInMillis(start);
		
		System.out.println(c.get(Calendar.SECOND));
		
		int now = c.get(Calendar.MILLISECOND);
		System.out.println(now);

		
		
		
	}//메인

}//클래스
