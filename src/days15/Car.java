package days15;

public class Car {

	// field
	String name;
	String gearType;
	int door;
	private Engine engine; //has-a 관계 카 클래스가 엔진 클래스를 가짐
	
	
	//Engine engine = new Engine(); 
	//위 코드는 결합력이 높아 좋은 코드가 아니다 ?!
	//설계도(class)안에 인스턴스화 시키는 코드가 있다 - 밖에서 설계도 따라 만들 때에 항상 엔진이 붙어져서 나옴
	
	//constructor
	
	Car() { //결합력 높음
		//this.engine = new Engine();
	}
	
	public Car(Engine engine) { // 의존성 주입(외부에서 엔진 받아옴)
		this.engine = engine;
	}; 
	
	//게터세터
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	//method
	void speedUp(int fuel) {
		this.engine.moreFule(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop(int fuel) {
		this.engine.stop();
	}
}
