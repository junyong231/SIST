package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 4:11:33
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		
		Idisp a1 = new A(); //Idisp가 A의 부모격이기 때문에 업캐스팅 O
		//a1.disp();
		
		

	}//main

	static void print(Idisp obj) { //매개변수 다형성.. 업캐스팅이기도 함 (뭔솔ㅋㅋ)
	
	}
	
}//class

interface Idisp {
	void disp(); //이거 앞으로 구현하기로 함. 안하면 추상클래스됨
}

class A implements Idisp {

	@Override
	public void disp() {
		// 구현됨
		
	}
	
}

class B implements Idisp {

	@Override
	public void disp() {
		// 구현됨
		
	}
	
}