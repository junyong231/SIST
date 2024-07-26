package days20;

import days13.Person;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오후 3:02:03
 * @subject	제네릭 타입은 클래스, 메서드에 선언할 수 있다....
 * @content		1) 제네릭 클래스 **
 * 						2) 제네릭 메서드
 *					
 *		   원시타입ㄱ
 *					Box<T>는  				제네릭 클래스,			 T의 박스라고 읽음
 *							 ㄴ 타입 변수 (T E V K ...)
 *
 *
 */
public class Ex08_02 {

	public static void main(String[] args) {

		/*
		Box b1 = new Box();
		b1.setItem(100);
		 */
		/*
	      Box b1 = new Box();
	      b1.setItem("홍길동");
	      System.out.println( b1.getItem());
		 */

		/*
		Box b1 = new Box();
		b1.setItem(3.14);
		System.out.println( (double)b1.getItem());
		 */

		Box<Person> b1 = new Box();
		b1.setItem(new Person());
		Person p = b1.getItem();
		System.out.println(p);
		
	} // main

} // class


//T : Type 
//E : Element
//V : Value
//K : Key

class Box<T>{
	T item; //필드
	
	
	//게터세터
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}   
}





/*
	class Box{
	   Object item;

	   public Object getItem() {
	      return item;
	   }

	   public void setItem(Object item) {
	      this.item = item;
	   }   
	} 
 */
/*
	class Box{
	   double item;

	   public double getItem() {
	      return item;
	   }

	   public void setItem(double item) {
	      this.item = item;
	   }   
	} 
 */

/*
	class Box{
	   String item;

	   public String getItem() {
	      return item;
	   }

	   public void setItem(String item) {
	      this.item = item;
	   }   
	} 
 */

/*
	class Box{
	   int item;

	   public int getItem() {
	      return item;
	   }

	   public void setItem(int item) {
	      this.item = item;
	   }   
	}
 */
