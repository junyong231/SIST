package days16;



/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 12:07:28
 * @subject Object 클래스
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

		Item item1 = new Item(10);
		Item item2 = new Item(10);
		// item1.hashCode();
		//				ㄴ 객체 생성이 되면 객체의 주소값을 해싱기법을 사용해서 해시코드 만들어 반환.
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode()); //밸류값 똑같이 줘도 다른 주소 반환 (당연..)

		System.out.println( item1.toString() ); //인스턴스에 대한 정보를 문자열로 반환 (  패키지.클래스명@해시코드의 16진수값  days16.Item@73a28541  )
		//toString을 오버라이딩해서 밸류를 뽑게 만들었더니 10이 나옴

		//getClass() 객체 자신의 클래스 정보 담고 있는 class라는 인스턴스 반환하는 메소드
		//item1.getClass(); 
		Class cls = item1.getClass(); //객체에 클래스 정보를 가지고 있는 인스턴스 cls
		
		System.out.println(cls.getName()); //days16.Item 나옴
		System.out.println(cls.getConstructors()); //어떤 생성자..
		System.out.println(cls.getMethods()); //어떤 메서드..
		
		
		//clone()
		


	}//main

}//class

class Item { // extends Object 는 생략되어있다

	@Override
	public String toString() {
		return "Item [value=" + value + "]";
	}

	//필드
	int value;

	//생성자
	Item(int value) {
		this.value = value;
	}



}//class Item