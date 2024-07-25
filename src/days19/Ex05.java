package days19;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 12:36:13
 * @subject Queue 큐 구조
 * @content FIFO	
 * 							집어 넣을 때 offer()
 * 							가져올 때 poll()/peek()
 * 							
 *
 */
public class Ex05 {

	public static void main(String[] args) {

		//더블 큐 (입구를 출구로, 출구를 입구로도 사용할 수 있음)  DeQue
		
		Queue q = new LinkedList(); //LinkedList가 DeQue 구현클래스이고 DeQue는 Queue의 자식 클래스이다
		q.offer("박준용");
		q.offer("김준석");
		q.offer("김재민");
		q.offer("전재윤");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll()); //먼저 들어가 있는 요소부터 나옴
		}
		
		
		
	
		
		
		
		
	}//main

}//class
