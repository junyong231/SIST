package days23;

/**
 * @author JUNYONG
 * @Date 2024. 8. 2.=오전 10:40:26
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		//최종 연산의 결과 타입이 Optional인 경우가 있음
		//Optional<T>	'T타입의 객체' 래퍼클래스이다
		//모든 타입의 참조변수를 저장할 수 있는 객체이다
		
		//최종연산() Optional 객체 생성
		//1) of()					of(null) 예외발생
		//2) ofNullable()		=> null이라는 값을 가지는 객체가 됨
		
		//2. Optional 객체로 부터 값을 얻어오는 방법
		//1) get()	null 예외 발생
		//2) orElse null => ""리턴 (빈 문자열)
		//	   orElseGet() => Null일때 , 빈 문자열이 아닌 다른 값을 반환할 수도  
		
		//3. isPresent() : Optional 객체의 값이 null이면  true/false 반환
		
		//Optional<T>
		//OptionalInt, OprtionalLong, OptionalDouble ..
		//getAsInt(),		getAsLong()...
		
		
	}//main

}//class
