package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 12:46:13
 * @subject	PriorityQueue 우선순위가 있는 큐
 * @content	우선순위가 높은 것부터 나오는 큐.
 * 
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		//작은 숫자가 우선 순위가 높다
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}//main

}//class
