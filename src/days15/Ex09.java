package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 4:16:26
 * @subject		클래스 간의 관계
 * @content		1. has - a 포함관계 (Car, Engine)
 * 						2. is -a 상속관계
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		//HEngine - 클래스 완성 안됐어도 개발 쌉가능
		Engine hengine = new HEngine();
		Car c1 = new Car(hengine);
		
		Engine kengine = new KEngine();
		Car c50001 = new Car(kengine);
		
		
		Engine sengine = new SEngine();
		c50001.setEngine(sengine);
		
	}//main

}//class
