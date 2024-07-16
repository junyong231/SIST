package days12;

public class Tv {
	
	
	//멤버(구성요소)
	//	ㄴ 멤버 변수 (필드) - 속성 == 특징
	//		ㄴ [접][기] 자료형 필드명[=초기값];
	//지역변수는 초기화하지 않으면 사용할 수 없다.
	//멤버변수는  초기화 안해도
	public boolean power;
	public int channel = 1;
	public String color = null;
	
	//멤버함수 == 메서드 == 동작(기능)
	public void power() {
		power =!power; 
	}
	
	/*
	 * m.length 필드(멤버변수)
	 * m.length() 메소드
	 */
	
	public void channelUp() {
		channel ++;
	}
	
	public void channelDown() {
		channel --;
	}
	
	
}//class
