package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 3:23:59
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		//나는 이 리스트에↓ 이 타입 저장한다 ( 제네릭 '<>'에는 기본형 X 래퍼클래스O)
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1); //오토 박싱/언박싱으로 Integer 안써줘도 1이 자동으로 변환됨
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);




		// 1) a U b  합집합 [1, 2, 3, 4, 5, 6, 7, 8] 								=> 중복x니까 Set


		HashSet<Integer> hab =new HashSet<Integer>(a); //a 해쉬셋에 넣고
		hab.addAll(b);													//b 다 때려박음 (자동으로 중복 거름)
		System.out.println(hab);


		// 2) a - b  차집합 [1, 2, 3]
		a.removeAll(b);
		System.out.println(a);


		// 3) a ∩b  교집합 [4, 5]
		ArrayList<Integer> kyo = new ArrayList<>();
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i =  ir.next();
			if( a.contains(i) ) kyo.add(i);
		}
		System.out.println( kyo);



	}//main

}//class
