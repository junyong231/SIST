package days02;

import java.util.Objects;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 12:35:49
 * @subject 자바 표준 출력 함수
 * @content println(), print(), printf()
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String myName; double myHeight;
		//세미콜론 찍혀있을 때는 줄바꿈 안해도 ㅇㅋ
		
		//초기화
		myName = "박준용";
		myHeight = 190.31;
		
		//[출력형식]
		//이름은 "박준용"이고, 키는 190.31cm이다.    이렇게 출력해라
//		System.out.print("이름은 ");
//	      System.out.print(name);
//	      System.out.print("이고, 키는 ");
//	      System.out.print(height);
//	      System.out.print("cm 이다.");

		
		
	    System.out.printf("이름은 \"" + myName + "\" 이고, 키는" +myHeight + "cm 이다.\n");
		// \" 하면 "출력됨

		//출력형식이 있는 경우 출력하는 메소드: printf()     +f는 포맷(format)
		
	    //[출력형식]
		//이름은 "박준용"이고, 키는 190.31cm이다.
		// 메소드 볼 때 1.기능  2.매개변수   3.리턴값 PrintStream 확인하자
		
		//System.out.printf(String format, Objects...args );
		//System.out.printf("출력형식", "출력값,,,");
		System.out.printf("이름은 \"%s\"이고, 키는 %fcm이다.\n", myName, myHeight );
		//그냥 [출력형식] 복붙한건데 알아서 \" 반영됨
		
		//%s 스트링, %f 더블         여기서 s,f는 컨버젼conversion
		System.out.printf("이름은 \"%s\"이고, 키는 %.2fcm이다.", myName, myHeight);
		//소숫점 제약 .2f로 바꿨음
		
	}


}
