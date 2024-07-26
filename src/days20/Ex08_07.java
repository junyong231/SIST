package days20;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 4:24:05
 * @subject
 * @content
 *
 */
public class Ex08_07 {

	public static void main(String[] args) {

		//일반 클래스
		// ArrayList is a raw type(원시타입). References to generic type ArrayList<E> should be parameterized
		ArrayList list = new ArrayList();
		//ArrayList<Object> list = new ArrayList<Object>(); 과 같다

		//제네릭 클래스
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//원시 타입과 제네릭 타입간의 형변환 ; 경고만 발생시키고 자동으로 변환해서 사용 가능..
		
		
		
	}//main

}//class
