package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 2:10:57
 * @subject NullPointerException
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		/*
		int [] m = null;
		System.out.println(m[0]); 
		//*** java.lang.NullPointerException => 인스턴스 생성 안되어 있을 때 발생하는 오류!!
		*/
		
		Tv t1 = null;
		//System.out.println(t1.channel);
		
		t1 = new Tv();
		tvTest(t1);
		
	}//main

	private static void tvTest(Tv t1) {
		System.out.println(t1.channel);
		
	}

}//class
