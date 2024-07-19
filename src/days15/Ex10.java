package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 4:31:52
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		
		//인터페이스 : 상수, 추상메서드만 + [ static default 메서드 ]
		
		

	}//main

}//class

interface Ia {
	//3개의 추상 메서드가 선언되어있다고 가정해보자.
	
}
interface Ib {
	//1개의 추상 메서드가 선언되어있다고 가정해보자.
	
}
interface Ic extends Ia, Ib { //인터페이스끼리의 상속 extends (구현이 implements)
	
	//3개의 추상 메서드 (Ia)
	//1개의 추상 메서드 (Ib)
	
	//1개의 추상 메서드 (Ic)
}

class A1 implements Ia{
	//오버라이딩
	//3개의 추상 메서드
}

class A2 implements Ib{
	//오버라이딩
	//1개의 추상 메서드
}

class A3 implements Ic{
	//오버라이딩
	//3개의 추상 메서드 (Ia)
	//1개의 추상 메서드 (Ib)
	
	//1개의 추상 메서드 (Ic)
	
	void newMethod() {
		//꼭 필요하더라..
	}
	
	
	
}

// 1) 디폴트 메서드와 클래스의 메서드가 충돌나면
///    ==> 디폴트 메서드는 무시가 된다. 
// 2) 여러 인터페이스를 구현하면 
//  디폴트 메서드와 충돌나면 
//    ==> 충돌나는 디폴트 메서드를 오버라이딩하면 해결.