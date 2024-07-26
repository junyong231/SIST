package days20;

import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 3:29:49
 * @subject [ 제한된 제네릭 클래스 ]
 * @content	08_04 더 이해하기
 *
 */
public class Ex08_05 {

	public static void main(String[] args) {


		
		//Box4<Toy> toybox = new Box4(); 과일 아니라서 오류남
		//Box4<Apple> applebox = new Box4();
		//Box4<빵> 빵box = new Box4(); 과일 아니라서 오류남
		//Box4<Grape> grapebox = new Box4();
		



	}//main

}//class

//class Box4<T extends Fruit> { //제네릭 클래스 - extends로 과일만 받게 제한할 수 있다
//class Box4<T extends Fruit & eatable> { //과일 & 이터블 둘 다 구현한 것만 받게 제한
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) {  this.list.add(item); }
//	int size() { return this.list.size(); }
//	T get(int i) { return this.list.get(i); }
//	public String toString() { return  this.list.toString();  }  
//}
//
//
//
//class 빵 implements eatable {
//
//}
//
//interface eatable{
//	//먹을 수 있는 음식이라고 생각하자....
//}
//
//class Fruit extends Object implements eatable{
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//class Apple extends Fruit{
//	public String toString() {
//		return "Apple";
//	}   
//}
//
//class Grape extends Fruit{
//	public String toString() {
//		return "Grape";
//	}   
//}
//
//class Toy{
//	public String toString() {
//		return "Toy";
//	}   
//}