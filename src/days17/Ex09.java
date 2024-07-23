package days17;

import java.util.Calendar;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 5:08:45
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		//지금까진 java util이었지만 sql은 뭘까..
		// java.util.Date의 자식이었음 sql Date는
		
		//jdk 1.1부터 추가된 java.util.Calendar 클래스를 알아보자
		
	//Calendar 추상 클래스였음 (객체 생성 불가)
		Calendar c = Calendar.getInstance(); //new연산자 x, 그레고리안(캘린더의 자식)으로 객체 생성해서 업캐스팅(Calendar)한거임
		// System.out.println(c.toString()); 이상한 스트링 나옴
		
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); //2
		
		//년
		//System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		//월
		//System.out.println(c.get(2)); //+1하라는건가?
		System.out.println(c.get(Calendar.MONTH)+1);
		//일
		
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));  //이번달의 4번째 화요일이라서 4나옴 24.07.23기준
		//시간
		
		System.out.println("시간(12기준) "+c.get(Calendar.HOUR));
		System.out.println("시간(24기준) "+c.get(Calendar.HOUR_OF_DAY));
		//분
		System.out.println("분: "+c.get(Calendar.MINUTE));
		//초
		System.out.println("초: "+c.get(Calendar.SECOND));
		//밀리초
		System.out.println("밀리: "+c.get(Calendar.MILLISECOND));
		//요일
		System.out.println("요일 넘버: "+c.get(Calendar.DAY_OF_WEEK));//일요일 ==1
		//마지막날짜
		System.out.println("막날: "+c.getActualMaximum(Calendar.DAY_OF_MONTH)); //오호
		
		//오전 오후
		System.out.println("0오전 1오후: "+c.get(Calendar.AM_PM));//0오전 1오후
	}//main

}//class
