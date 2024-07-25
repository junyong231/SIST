package days19;

import java.util.Stack;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 12:21:55
 * @subject 		스택(Stack)구조								 큐(Que) 구조
 * @content 			LIFO												 
 * 						입출구 하나면 됨
 * 					들어갈 때  push()
 * 					빼낼 때     pop()- 스택에서 없어짐
 * 								peek()-스택에 남음
 * 				스택비었는지?empty() 
 * 					찾을 때	search()
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Stack s = new Stack(); //Stack의 부모는 Vector임 하지만 스택은 위에 적힌 메소드로만 다룸
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
		//s.iterator() 도 안씀
		System.out.println(s.pop()); //가장 마지막에 넣은 전재윤 스택에 남기지 않고 꺼냄
		System.out.println(s.size()); //그래서 전체가 3이됨
		System.out.println(s.peek()); //스택에 남겨놓고 꺼냄
		System.out.println(s.size());//남겨놨기 때문에 스택 사이즈 안변함
		
//		while (!s.empty()) { //비어있지 않다면
//			System.out.println(s.pop());
//		}
		
		System.out.println(s.search("김준석"));//인덱스 출력
		
		
	}//main

}//class
