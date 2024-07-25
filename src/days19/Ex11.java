package days19;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 3:37:27
 * @subject [ TreeSet ] 
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		/* 1.Set이므로 중복x 순서x
		 * 2.이진 검색 트리라는 자료 구조로 데이터를 저장하는 컬렉션 클래스..
		 * 3.'링크드리스트'처럼 노드가 서로 연결된 구조.. 
		 * 	class TreeNode{
		 *		Object value; 
		 *
		 * 		TreeNode left;
		 * 		TreeNode right;
		 *  }
		 * 4. 최상위 노드: 루트노트 
		 * 5. 노드들 간의 관계 :부모(자식), 형제
		 *  
		 */
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		
		
		
		System.out.println(ts); //정렬도 되어있음
		
		System.out.println(ts.first()); //첫번째값(1)
		System.out.println(ts.last()); //끝값(9)
		 
		//범위검색
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println(ss);
		
		//1보다 큰 값을 가진 가장 가까운 수(값)을 반환
		System.out.println(ts.higher(1));
		//4보다 작은(낮은)데 가장 가까운
		System.out.println(ts.lower(4));
		
		//지정된 값(3)과 같은 객체를 반환 없으면 작은 값을 가진 객체 중 가장 가까운 것
		System.out.println(ts.floor(3));
		System.out.println(ts.ceiling(3));
		

	}//main

}//class
