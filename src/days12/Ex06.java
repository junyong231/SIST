package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 2:51:18
 * @subject	[ 객체(클래스) 복사와 복제 ]
 * @content					 copy  clone
 * 
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		t1.color = "red";
		System.out.println(t1.color);
		
		//객체 복사copy
		Tv t2 = t1; 
		t2.color ="blue";
		System.out.println(t1.color);//뭐임 왜 블루임 -> 인스턴스(주소)를 생각해보면 됨, 주소를 복사한 것.(=같은 인스턴스를 참조한다)
		
		tvTest(t1);
		System.out.println(t1.color);
		

	}//main

	private static void tvTest(Tv t) {//t1을 매개변수로 넣었기 때문에 (주소값을 넣음) , t라는 명칭 자체는 중요x 주소가 t1이랑 같은게 중요=> Tv t = t1;   객체 복사라는 뜻
		t.color = "green";
		
	}

}//class
