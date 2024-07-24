package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 3:30:30
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {

		//배열 단점 _ 크기 고정
		int [] m = {1,2,3};
		System.out.println(m.length); //3

		//100추가 append => 오류 뜸 (풀방)
		//삭제도 불편하고

		//<E> 제네릭클래스  E는 Element(요소)
		ArrayList list = new ArrayList(3); // 아무것도 안주면 초기 용량 10
		System.out.println(list.size()); //요소가 들어가 있는 방의 수..
		list.add("이시훈");
		list.add("원충희");
		list.add("김준석");
		System.out.println(list.size());
		System.out.println(list.toString());//왜 @이상한 값 안나옴? -> 오버라이딩된거임
		System.out.println(list);
		//초기 용량 3인데 한 명 더 집어넣을 수 있나? 배열이면 오류
		list.add("빅준용");
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.contains("빅준용")); // 있냐 없냐 불리언 나옴
		System.out.println( list.indexOf("원충희") ); //앞에서부터 찾기, 위치 인덱스 나옴

		list.add("원충희"); //동명이인 전학
		//list 중복허용임
		System.out.println( list.lastIndexOf("원충희") ); //뒤에서부터 찾음 = 전학 온 동명이인 인덱스 출력

		// 인덱스 3인 요소의 값 출력?
		// 배열명 [3]
		//list.clear(); //모든 엘리먼트 삭제 
		//System.out.println(list);

		list.set(1, "전재윤"); //1번째 위치 재설정(수정)
		System.out.println(list);

		System.out.println(list.get(3)); //인덱스 3인 빅준용 출력

		//원충희 삭제 ?
		int index = list.indexOf("원충희"); //4 찾음
		list.remove(index);//삭제
		System.out.println(list);
		//<E> element
		//<T> type
		/*
		list.removeIf(new Predicate<String>() { //리무브 '이프'니까 안에 조건식 참이면 삭제 

			@Override
			public boolean test(String t) {

				return t.equals("원충희") ;
			}
		});
		 */

		//		list.removeIf( n -> n.equals("원충희"));
		//		System.out.println(list);


		//System.out.println( list.isEmpty() );
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); //o2 , o2 자리 바꾸면 내림차순됨
			}
		});
		System.out.println(list);
		list.sort(Comparator.reverseOrder()); //로꾸꺼
		System.out.println(list);
		
		
		//list모든 요소 출력
		//list.get(index)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// iterator == 반복자 (반복적으로 접근해서 처리)
		list.iterator();
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		
		
		
		
		
	}//main

}//class
