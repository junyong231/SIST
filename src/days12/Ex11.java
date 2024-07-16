package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 5:17:31
 * @subject int[] 을 매개변수로 써보자 (참조형)
 * @content
 *
 */
public class Ex11 {
	
	 String name;
	
	public static void main(String[] args) {
		
		// 기본형 or 참조형(리턴타입) 메서드 (매개변수)
		//									ㄴ기본형 매개변수
		//									ㄴ참조형 매개변수
		
		int [] m = new int[3];
		System.out.println(m.length); //3
		
		Ex11 ex = new Ex11();
		
		//ex.name ="홍길동"; // 객체명.필드명
		m = ex.increaseArray(m);
		System.out.println(m.length); //6
	}//main

	public int[] increaseArray(int[] m) {//참조형 매개변수 //static을 지웠다  
		int [] temp = new int[m.length+3];
		//m = temp; //안됨
		return temp;
	}

}//class
