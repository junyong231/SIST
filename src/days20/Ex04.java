package days20;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.*;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오전 11:49:53
 * @subject [ Collections 클래스 ]
 * @content 얘랑 비슷함 --->Arrays 클래스?  : 배열을 좀 더 사용하기 쉽도록 기능이 구현된 클래스
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//		int [] m = {3,5,2,4,1};
		//		Arrays.sort(m);
		//		Arrays.binarySearch(m, 2);
		//		System.out.println(Arrays.toString(m)); 
		//		Arrays.fill(m, -1);
		//		System.out.println(Arrays.toString(m)); 

		//Collections

		ArrayList<Integer> list = new ArrayList<Integer>();
		//		list.add(3);
		//		list.add(5);
		//		list.add(2);
		//		list.add(4);
		//		list.add(1);
		//위와 같음 
		addAll(list, 3,5,2,4,1);

		System.out.println(list);

		rotate(list, 2); //(Collections.rotate(list, 2);  이거였는데 import 쪽 스태틱하고 *처리)
		//오른쪽으로 두 칸씩 이동.. -2면 왼쪽
		System.out.println(list);

		swap(list, 0, 4);//인덱스 0-4 자리바꿈
		System.out.println(list);

		shuffle(list);//무작위 섞기
		System.out.println(list);

		//sort(list);//(오름차순) 정렬
		//System.out.println(list);

		sort(list, (a,b)->b-a); //내림차순
		System.out.println(list);

		fill(list, -1);
		System.out.println(list);







	}//main

}//class
