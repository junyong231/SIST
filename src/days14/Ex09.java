package days14;

import java.io.IOException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 2:42:03
 * @subject		1. 오버로딩 	 (중복 함수)
 * 						2. 오버라이딩	 (재정의 함수) override = overwrite 덮어쓰기
 * 														  부모super클래스로부터 상속받은 메소드를 재정의한 것..
 * 							오버라이딩 조건... 
 * 							1) 메서드명 수정x
 * 							2) 매개변수 부모와 동일
 * 							3) 리턴타입 동일
 * 							4) 접근지정자는 부모의 접근지정자보다 같거나 넓어야 된다..
 * 							5) 부모의 메서드보다 많은 수의 예외를 선언할 수 없다..
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		
		
		
	}//main

}//class

class Parent {
	int print(String n, int a) throws IOException{ 
		return 100;
	}
}

class Child extends Parent{
	@Override
	int print(String n, int a) throws IOException, NullPointerException { 
		return 100;
	}
}