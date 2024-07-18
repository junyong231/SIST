package days14;

public class Engine {
	//field
	double speed;
	
	//method
	void moreFule (int fuel){
		this.speed += fuel*0.05;
	}	
	void lessFuel (int fuel) {
		this.speed -= fuel*0.05;
	}
	void stop() {
		this.speed = 0;
	}
}
