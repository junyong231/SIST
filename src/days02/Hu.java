package days02;

public class Hu {

	public static void main(String[] args) {
		//식별자: 개발자가 설정할 수 있는 이름
		//키워드(예약어): 원래 설정되어 있는 이름
		
		int x = 10; int y= 20;
		System.out.printf("교환 전입니다. x=%d, y=%d \n",x,y);
		{
			int temp = y;
			y = x;
			x = temp;
		}
		System.out.printf("교환되었다. x = %d , y = %d ", x,y);
		
		/* 자바의 타입
		 * -기본형
		 * 		1.숫자형
		 * 			1) 정수형 byte(1바이트) short(2) int(4) long(8)
		 * 				문자 char(2)
		 * 			2) 실수형 float(4바이트) double(8바이트)
		 * 		2.논리형 Boolean(1)
		 * -참조형 : 배열, 클래스(String), 인터페이스	
		*/
		
		/* 지역변수
		 * 지역: 지정된 지역에서만 활용되는 변수  
		 */
		
		//개행 코드
		System.out.println();
		System.out.println("1");
		System.out.print("2\n");
		System.out.println("3\r");
		
		//print 매개변수를 출력함 
		//println 매개변수를 출력하고 개행함
		//printf 매개변수를 출력하고 출력형식에 맞추어 출력해줌
	}

}
