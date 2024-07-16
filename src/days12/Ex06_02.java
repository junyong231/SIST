package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 3:19:26
 * @subject 객체(클래스) 복제 clone
 * @content
 * 
 * 					얕은 복제
 * 					깊은 복제
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x =10;
		p1.y =20;
		p1.m = new int [2];
		p1.m[0]=1;
		p1.m[1]=2;
		p1.dispPoint(); //x=10 y=20 출력
		
		//복사
		Point p2 = p1; //같은 인스턴스 참조
		p2.dispPoint();
		
		//복제
		Point p3 = new Point(); // 다른 인스턴스 참조 (새로 만들었으니)
		p3.x = p1.x;
		p3.y = p1.y;
		//이렇게 하면 좌표값(필드)은 같지만 인스턴스(주소)는 다름 
		// [ 복제 ]된 인스턴스가 하나 더 생김!

		
		//얕은 복제
		p3.m=p1.m; // p1의 인스턴스도 m의 주소값을 가지고 있는 거라서 다음과 같은 코드를 쓰면
						//p3도 동일한 m의 주소를 받아서 씀 == 공유하게 됨
		
		//깊은 복제 : 아예 다 복제했기 때문에 값은 같지만 다른 배열의 주소를 참조하는 상태가 됨( 완전히 분리되어있음)
		p3.m = new int [2];
		p3.m[0] = p1.m[0];
		p3.m[1] = p1.m[1];
		
		
		
	}//main

}//class
