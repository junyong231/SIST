package days17;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 12:14:45
 * @subject Math클래스
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//Math + 모든 멤버들(필드,메서드) : static
		
		System.out.println(Math.random());
		System.out.println(Math.pow(2,3));
		System.out.println(Math.max(2,3));
		System.out.println(Math.min(1,5));
		System.out.println(Math.abs(-3)); //절댓값
		System.out.println(Math.PI);
		System.out.println(Math.E); 
		
		//암기
		System.out.println(Math.ceil(2.0));
		System.out.println(Math.ceil(2.178));//소수점 첫째자리 올림
		System.out.println(Math.ceil(2.9485)); //소수점 첫째자리 올림
		
		System.out.println(Math.round(2.0));
		System.out.println(Math.round(2.185));//소수점 첫째자리 반올림
		System.out.println(Math.round(2.9485));//소수점 첫째자리 반올림
		
		System.out.println(Math.floor(2.1485));//소수점 첫째자리 내림
		System.out.println(Math.floor(2.5485));//소수점 첫째자리 내림
		System.out.println(Math.floor(2.9485));//소수점 첫째자리 내림
	}//main

}//class
