package days17;

/**
 * @author JUNYONG
 * @Date 2024. 7. 23.=오후 12:21:28
 * @subject 포장 클래스 (박싱, 언박싱)
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		int i = 100;
		Integer j ; //래퍼클래스 , j는 객체임
		j = i;
		System.out.println(j);
		//기본형이 자동으로 래퍼클래스로 형변환 : 박싱 *auto Boxing
		
		int k =j;
		System.out.println(k);
		//래퍼클래스 타입인 객체가 자동 기본형으로 형변환 
		
		test(1);
		test(4.23);
		test('ㅁ');
		test(true);
		//무엇을 집어넣던 박싱됨 => Object는 최상위 클래스이므로 오토 박싱이 됨
		
		
	}//main

	private static void test(Object o) {
		
		
	}
	
}//class
