package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오전 11:08:28
 * @subject	추상(abstract)메서드		 추상클래스
 * @content	ㄴ 바디 없는 메소드				ㄴ공통적인 멤버를 가진 클래스 설계.. 
 * 														ㄴ객체를 생성할 수는 없다 (목적도 아님)
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Parent p = new Parent(); 객체 생성 안되는 모습
		
		
		Parent p  = new Child();
		p.dispA();
		
	}

}

//꼭 추상 메서드가 있어야 추상 클래스가 되는 것은 아니다
abstract class Parent {
	//필드
	//생성자
	//추상메서드
	 abstract void dispA();
	 abstract void dispB();
	 abstract void dispC();
	//메서드
}

class Child extends Parent {//부모의 추상메서드 반드시 재정의해야함, 한개라도 안하면 얘도 추상클래스

	@Override
	void dispA() {
	
		
		
	}

	@Override
	void dispB() {
		
		
	}

	@Override
	void dispC() {
		
		
	}
	
	
	
}









