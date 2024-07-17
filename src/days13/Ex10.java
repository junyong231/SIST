package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 5:04:56
 * @subject
 * @content
 *
 */
public class Ex10 {
	
	
	//필드
	String name = "홍길동"; //인스턴스 변수			
	static double rate; //클래스 변수		0.0일 것임.
	int [] m = null;
	
	//디폴트 생성자
	Ex10() {
		name = "디폴트"; //홍길동이랑 겹치는데 처리 어떻게 되나
	}
	
	public static void main(String[] args) {
		
		Ex10 obj =new Ex10();
		System.out.println(obj.name); //디폴트 출력. 인스턴스화 될 때 초기화됨 ㅇㅇ
		
		
		int age;
		//지역변수=> 반드시 초기화해야지 사용 가능
		
		
		//클래스변수
		//인스턴스변수
		//각 타입별 기본값으로 설정. (불리언이면 F, 정수계열 0, float 0.0f, double 0.0[d], 모든 참조타입 null)
		
		
		//멤버 변수(필드)를 초기화하는 방법
		//		ㄱ. 명시적 초기화
		//		ㄴ. 생성자 초기화
		//		ㄷ. 초기화 블럭 { }
		//			1.인스턴스 초기화 블럭 : 인스턴스 변수 초기화
		//			2.클래스(static) 초기화 블럭 : 클래스 변수 초기화
		
		
	}//main

}//class
