package days15;

class BookEx {
	int speed ;
	void run() {
		System.out.println(speed + "으로 달립니다");
	}

	static void simulate() { // 스태틱(정적) 메서드
		BookEx myCar = new BookEx();
		myCar.speed = 25;
		myCar.run();
	}
	public void simul2() { //인스턴스 메서드
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		simulate(); //  객체 생성없이도 스태틱 메서드는 호출되는 모습
//		simul2();
//		simul2 s2 = new simul2();
//		s2();  다 안됨
		//인스턴스 메서드는 객체 없이 호출하려고 했기 때문이지
		
		BookEx myCar = new BookEx(); // 객체 생성 이제 인스턴스 메서드 사용쌉가능
		myCar.speed = 200; //인스턴스 필드 호출 가능
		myCar.run();//인스턴스 메서드 호출 가능
		myCar.simul2(); //인스턴스 메서드 호출 가능

		//클래스는 설계도, 인스턴스는 제품.
		//
	}
}//BookEx