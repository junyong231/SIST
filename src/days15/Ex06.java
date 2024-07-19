package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 2:31:07
 * @subject		[ final ]
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		//final + 변수 = 상수
		final double PI = 3.141592;
		
		final int 값없음; //final인데 값없으면?
		값없음 = 10;
		//처음 한 번은 초기화가 됨 
		//값없음 = 12; 한번 더하려니 안됨
		
		FinalTest ft = new FinalTest();
		ft.test(10);
		
		
		

	}//main

}//class

//final + class 최종(마지막) 클래스 : 자식x
final class FinalTest{
	
	void test(final int n) {
		// n=100;  에러: ft.test로 10 초기화함. PI랑 같은 경우임
	}
}

class P{
	
	//필드
	final int MAX_VALUE =1; //명시적 초기화
	final int MIN_VALUE;	
	
	P(int minValue) { // 생성자 초기화
		MIN_VALUE = minValue;
	}

	
	final int disp() {//메소드 앞에 fianl = 재정의 할 수 없음 (마지막이랑 비슷한 느낌)
		return 0;
	}
}

//class C extends P{ //상속 후 재정의 = 오버라이딩
//	@Override
//	int disp() {
//		return 100;
//	}	
//}














