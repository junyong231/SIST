package days20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 2:12:44
 * @subject [익명 클래스 == 무명 클래스 == Anonymous Class)
 * @content	이름이 없는 클래스.
 *													
 *																	선언하는 형식
 *
 *										new 부모의 클래스 이름(super class) 또는 부모의 인터페이스 이름. 
 *													new 부모클래스명 (매개변수... ) {}
 *										@Override로 부모메서드(){} 재정의해서 계속 사용 가능 
 */	
public class Ex07 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3,5,2,4,1);
		System.out.println(list);

		list.sort(new Comparator<Integer>() { //익명클래스
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1); 
			}

		} );



		//람다식으로 하면 list.sort((o1,o2)->o2.compareTo(o1));

		System.out.println(list);


	}	//main



}//class
/*
 *  익명 아닌버전
class ListComparator implements Comparator<Integer>{

   @Override
   public int compare(Integer o1, Integer o2) {
      return o2.compareTo(o1); // 0 양수 음수
   }

}
 */
