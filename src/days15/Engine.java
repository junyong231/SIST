package days15;

public interface Engine { //인터페이스로 바꿈
	//field
	//double speed;  얘는 못옴 상수 아니라서
					//생성자도 못옴
	
	//method // 바디를 다 날려서 일반메서드 -> 추상메서드로 변경시킴
	void moreFule (int fuel);
	void lessFuel (int fuel) ;
	void stop() ;
}
