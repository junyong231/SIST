package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 4:29:46
 * @subject String을 더해서(+=) 붙이면 안되는 이유
 * @content String클래스는 '불변'을 특징으로 가지므로.. 변화x 다 부수고 다시 만듬..
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
	
		//test_String();//> 처리시간:			 4532001500ns (약 4.5초) (객체 생성-소멸 20만번)
		test_StringBuilder(); //> 처리시간:        3116300ns

	}//main

	private static void test_StringBuilder() {
		long start = System.nanoTime();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			s.append("a");
		}
		long end = System.nanoTime();
		System.out.printf("> 처리시간: %dns\n",(end-start));
		
	}

	private static void test_String() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		System.out.printf("> 처리시간: %dns\n",(end-start));
	}

	
	
}//class
