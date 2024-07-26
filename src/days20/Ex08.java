package days20;

import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 2:34:34
 * @subject 제네릭 Generics 
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 제네릭 Generics 
		 * 1. jdk 1.5 제네릭     1.8람다식  빅업뎃
		 * 
		 * 2. 제네릭이란?
		 * 		다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에서 컴파일 시에 타입을 체크해주는 기능
		 * 		왜 개체의 타입을 컴파일 시에 체크하나? 
		 * 			ㄴ 객체의 타입 안정성을 높이기 위해..
		 * 			ㄴ 형변환에 번거로움을 줄이기 위해서...    이 두가지가 제네릭의 장점 
		 * 
		 */
		
		/*
	      ArrayList list = new ArrayList(); //여러가지 타입을 받을 수 있는 리스트..
	      list.add(100); // int
	      list.add(3.14); // double
	      list.add(true); // boolean
	      list.add('a'); // char
	      list.add("name"); // String
	      list.add(new Person()); // 
	      
	       int i =  (int) list.get(0);
	       double d =  (double) list.get(1); // 그래서 꺼낼 때 형변환 해줘야함... => 제네릭이 형변환 번거로움 덜어주는 이유
	       boolean b = (boolean) list.get(2);
	       Person p = (Person) list.get(5);
	       */
	      
	      ArrayList<String> list = new ArrayList<>(); //제네릭으로 스트링만 받겠다고 선언함 기본형 뿐 아니라 Person 등 클래스를 타입으로 하는 것도 가능
	      list.add("홍길동");
	      list.add("관리자");
	      
	      // list.add(100); //정수 넣으면 오류 뜸
	      
	      String name = list.get(0);

		
		
		
		
		
	}//main

}//class
