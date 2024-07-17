package days13;

public class Save {
// 저축 클래스
	
	
	// field
	private String name ; //예금주
	private long	money; //예금액
	//인스턴스 마다 부여됨 -> 인스턴스 변수(필드)
	
	

	public static double rate = 0.04 ;	//이자율 (0.04 명시적 초기화) 
	//static 붙였으므로 클래스 당 하나만 만들어짐 + 객체 생성 안해도 일단 메모리에 올림
	// 클래스 변수, 공유 변수(쉐어드) , 스태틱(정적) 변수


	//생성자
	public Save() {
		//super();

	}


	public Save(String name, long money, double rate) {
		//super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}



	//게터 세터
	
	public static double getRate() {
		return rate;
	}


	public static void setRate(double rate) {
		Save.rate = rate;
	}


	//method
	//인스턴스 메소드
	public void dispSave() {
		System.out.printf("> 예금주:%s 예금액:%d 이자율:%.2f\n",this.name,this.money,this.rate);
	}





}//class
