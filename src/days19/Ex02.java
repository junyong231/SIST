package days19;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오전 11:10:37
 * @subject		[Vector]
 * @content		List 	
 *						ArrayList
 *						Vector : ArrayList와 같지만 , 멀티 스레드에 안전하다 (동기화 처리가 되어있음)
 *
 *		미완
 */					
public class Ex02 {

	public static void main(String[] args) {

		Vector vt =new Vector(); //얘도 초기값 안만지면 방 10개 준거랑 같음
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("최사랑");
		vt.addElement(null);

		System.out.println(vt); // 중복o
		System.out.println(vt.size()); // null도 요소로 인식
		System.out.println(vt.capacity()); //초기 방 갯수 안정해줌= 자동 10개 부여
		vt.trimToSize();
		System.out.println(vt.capacity()); // 남은방 잘라서 6개됨

		System.out.println(vt.get(1)); //1번방 출력
		System.out.println(vt.elementAt(1)); //1번방 출력

		vt.remove(1);
		//vt.removeElementAt(1);
		//vt.remove("전재윤");
		//vt.removeElement("전재윤);

		System.out.println(vt); // 1번방(전재윤) 삭제

		//	vt.removeAllElements();
		//	System.out.println(vt); //모두삭제

		vt.set(1, "벅준용");
		vt.setElementAt("홍길동", 3); //이건 인덱스를 뒤에
		System.out.println(vt);

		//모든 요소 출력 : Iterator

		Iterator ir = vt.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

		//null 삭제
		vt.removeIf(e -> e==null ); 
		System.out.println(vt);

		System.out.println("-".repeat(20));

		/* while없이도 이렇게 출력 가능
	vt.forEach(new Consumer<String>() {

		@Override
		public void accept(String n) {
			System.out.println(n);

		}
	});
		 */	

		
		System.out.println();
		
		
		
		
		
		




	}//main

}//class
