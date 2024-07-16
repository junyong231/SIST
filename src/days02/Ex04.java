package days02;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 2:20:04
 * @subject
 * @content
 */
public class Ex04 {
//메인의 매개변수인  String[] args도 지역변수이다(main()).
	public static void main(String[] args) {
		 
		String name = "홍길동";
	    //얘도 지역변수이지만 main안에서 전부 사용가능
		
		
		//변수 범위
		//문자열 타입 String					 %s
		//숫자(실수) float(4) double(8) %f
		//숫자(정수) int(4)					 %d
		
		//나이를 저장하는 age 변수 선언
		
		{
		int age; // 박스 안에서 선언된 지역변수 age
		}
		
		//{ } 도 범위 나타내는 연산자
		
//		에러: age cannot be resolved to a variable
//		age = 20;    age가 {}안에 있어서 바깥에선 없는 변수임

//		System.out.printf("> age = %d\n", age);
		
		System.out.println(name);
		
		
		
	}//main

}//class
