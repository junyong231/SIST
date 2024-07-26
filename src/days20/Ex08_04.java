package days20;

import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 3:19:41
 * @subject	[ 제네릭 클래스의 객체 생성과 사용 ]
 * @content
 *
 */
public class Ex08_04 {

	public static void main(String[] args) {
		/*
		Box3<Fruit> fruitBox = new Box3();
		Box3<Fruit> appleBx = new Box3();
		Box3<Fruit> grapeBox = new Box3();
		Box3<Fruit> toyBox = new Box3();

		//		Box3<Apple> box1 = new Box3<grape>();
		//오류 :타입 안맞음	: Box3<grape> cannot be resolved to a type

		//Box3<Fruit> box1 = new Box<Grape>();
		//위와 같이 안됨 : 업캐스팅 따위 없음
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape()); //이건 업캐스팅 가능
		
		//fruitBox.add(new Toy()); // 상속 관계 없어서 안됨!
*/

	}//main

}//class
/*
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

class Toy{
	public String toString() {
		return "Toy";
	}   
}

class Box3<T> { //T의 박스3 이라는 제네릭 클래스를 만들었다
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {  this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	public String toString() { return  this.list.toString();  }  

}
*/