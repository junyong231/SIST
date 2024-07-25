package days19;

import java.util.LinkedList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 12:11:45
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("박준용");
		list.add("김준석");
		list.add("김재민");
		System.out.println(list); //순서 유지되는중

		// list.get(0);
		// list.getFirst();
		// list.getLast();
		// list.contains("홍길동");
		// list.indexOf("홍길동");

		//list.addFirst(list); //앞에 추가도 가능
		//list.addLast(list); // == list.add

		//               	 	읽기   	 		삽입/삭제     				비고
		// ArrayList     	빠르다    		 느리다       순차적으로 추가,삭제 빠르다.						얘랑 벡터는 사실상 같음 (동기화 처리만 다름)
		// LinkedList    	느리다.  		 빠르다       데이터 많으면 많을 수록 접근성은 떨어진다.
		



	}//main

}//class
