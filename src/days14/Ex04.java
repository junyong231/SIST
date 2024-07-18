package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오전 10:37:06
 * @subject	 클래스들 간의 관계
 * @content
 * 
 * 1. has-a 관계	(포함관계)
 * 		~~을 갖다
 * 		A라는 클래스가 B라는 클래스를 가지는 관계
 * 		차 - 엔진 클래스
 * 2.	is-a	관계	(상속관계)
 *		~은~이다
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Engine engine = new Engine(); //'이렇게 주입하게 된다면 엔진만 바꿀 수 있다'는 뜻 => 다른 설계도(class)에서 찍어오면 됨.
		
		//의존성 주입
		//1) 생성자 통해서 주입
		//2)setter 통해서 주입
		Car myCar =new Car();
		myCar.setEngine(engine);//2)setter 통해서 주입
		
		myCar.speedUp(10);
		//double currentSpeed = myCar.engine.speed;
		double currentSpeed = myCar.getEngine().speed;//getter
		System.out.println("현재 속도 : "+ currentSpeed);
		
		
	}//mn

}//class
