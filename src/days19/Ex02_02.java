package days19;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오전 11:10:37
 * @subject		[Vector]
 * @content		List 	
 *						ArrayList
 *						Vector : ArrayList와 같지만 , 멀티 스레드에 안전하다 (동기화 처리가 되어있음)
 */					
public class Ex02_02 {

	public static void main(String[] args) {

	Vector vt =new Vector(); //얘도 초기값 안만지면 방 10개 준거랑 같음
	vt.addElement("김재민");
	vt.addElement("전재윤");
	vt.addElement("김선우");
	vt.addElement("최사랑");
	vt.addElement("최사랑");
	vt.addElement(null);
	
	System.out.println(vt); // 중복o
	
	ListIterator ir = vt.listIterator(); 
	while (ir.hasNext()) {
		System.out.println(ir.next());
	}
	System.out.println("-".repeat(20));
	while (ir.hasPrevious()) {
		String name = (String) ir.previous();
		System.out.println(name);
	}
	
	
	
	}//main

}//class
