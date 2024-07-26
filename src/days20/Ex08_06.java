package days20;

import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 3:42:28
 * @subject 	<? extends T> : 이놈과 이놈 자식들은 ㅇㅈ 
 * @content 	<? super T> :  이놈과 이놈 부모들은 ㅇㅈ
 *					<?> == <? extends Object> : 다받어 
 *											? == 와일드 카드 	
 *[ 제네릭 메서드 ]
 */
public class Ex08_06 {

	public static void main(String[] args) {


		FruitBox<Fruit> fruitBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();

//		Juice juice = Juicer.makeJuice(grapeBox);
//		Juice juice2 = Juicer.makeJuice(appleBox);
//		Juice juice3= Juicer.makeJuice(fruitBox); 
		//다 가능한 모습..


	}//main

}//class

class FruitBox<T extends Fruit> extends Box5<T>{ //제한된 제네릭 클래스

}

class Juice {//일반 클래스

}

//과일(사과 포토)상자로부터 주스를 만드는 기기
class Juicer {
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) { //와일드카드 : 모든 과일상자(+과일 상속한) 받으니 토이는 제외됨
		return new Juice();
	}
	 */
//위의 static 메서드를 (makeJuice) 제네릭 메서드로 수정해보자.
	// [ 제네릭 메서드 ]
	//		ㄴ메서드의 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라고 부른다
	//		선언형식 : 접근지정자 static <T> 리턴자료형 제네릭메서드명 (매개변수..) {}
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) { 
		return new Juice();
	}//위의 메서드와 100퍼센트 같은 기능임


	/* 잘못된 문법 (오버로딩이 안됨..!)
	 * 제네릭 타입의 매개변수는 오버로딩이 되지 않는다.
	 * 문제점 ? 그럼 어떻게 해당 상자를 받게 하지??
	 *  => 해결은 <?> 와일드카드였음..! ==> Object(모든 타입)와 같은 의미.....
	 *  
	static Juice makeJuice(FruitBox<Fruit> box) {
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	}
	 */


}

class Fruit extends Object{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}   
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}   
}
class Box5<T> { //제한없음. 모든 타입 받음 (T)
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {  this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	public String toString() { return  this.list.toString();  }  
}


//제네릭 메서드 예제..

/* public static void printAll(ArrayList<? extends Product> list,
 * 										ArrayList<? extends Product> list2)
 *를 제네릭 메서드로 바꿔보자 
 *(차이점 확인해보기) , 기능은 완전히 같음
 *
 * public static<? extends Product> void printAll(ArrayList<T> list,
 * 										ArrayList<T> list2)
 * 
 * 
 * 				<T extends Comparable<? super T>>
 * 
 * 
 * 
 * 
 */

