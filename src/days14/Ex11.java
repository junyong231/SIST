package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 3:30:17
 * @subject 			★★★ 중요한 예제★★★
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		 *  	[4개 클래스]
		 *  		Object
		 *  |					|	
		 * Temp 		Employee	사원클래스( 공통적으로 가지고 있는 멤버 구현..)
		 *  					|
		 *					Regular		정규직 사원클래스
		 *						|
		 *					SalesMan	영업직 사원클래스
		 *
		 *	★★★[들어간 개념]★★★
		 *	상속
		 *	오버로딩/오버라이딩
		 *	this/super
		 *	추상메서드 추상클래스
		 *	인터페이스
		 *	다형성
		 *	업캐스팅/다운캐스팅 등등 설명가능..
		 *  
		 *  
		 *  lombok 설치...
		 */

		//1. 사원 객체 생성해서 출력
//		Employee emp1 = new Employee("송세호","서울 강남구",
//				"010-1234-5678","2022.12.12");
//		emp1.dispEmpInfo();
		
		//2. 레귤러 객체 만들어서 사원정보 출력 _ 기본급 출력 안되는 문제 O
		Regular emp2 = new Regular("정규진", "서울시 강북구",
				"010-5656-4545","2023.1.10",200);
		emp2.dispEmpInfo(); // 기본급이 출력이 안댐..
		System.out.println( emp2.getPay()); //기본급 출력O
		
		//2-2. 다형성 이해하면 알게 된다..?
		// 		정규진은(R) 사원(E)이다 (O)
		//부모타입					 자식객체
		Employee emp3 = new Regular("정규진", "서울시 강2북구",
				"010-5656-4545","2023.1.10",200); //
		emp3.dispEmpInfo();
		//System.out.println( emp3.getPay());//빨간줄 : Employee는 겟페이 없지
		//ㄴ	'자동형변환'이 이루어짐 (자식객체-작음 => 부모타입-큼) 이라서 ㅇㅇ(하위->상위)
		//						이를 [ 업캐스팅 ] 이라고 한다..!
		
		// Point p = new Regular(); 상속관계 없어서 형변환X 
		
		//부모객체를 자식객체로 변환 : [ 다운캐스팅 ] = 자동아니고 cast연산자 써야됨(강제형변환)
		Regular emp4 =(Regular) emp3; // 다운 캐스팅이 되는 모습
		//emp3는 시작부터 업캐스팅된 부모객체고 11_02는 성골 부모객체라서 안됨
		
		// 
		
		
	}//main

}//class
