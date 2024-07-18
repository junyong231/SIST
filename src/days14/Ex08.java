package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 2:08:18
 * @subject 상속 계층도
 * @content
 * 						모든 클래스의 최상위 = java.lang.Object
 *                |				|					
 *              Point			Shape(도형클래스)
 *             Ex03.java 					|
 *              				 Circle Triangle..
 *
 */
public class Ex08 {

	public static void main(String[] args) {

		//	Point p = new Point(1,2);
		//	p.  .찍으면 Point의 멤버 뿐만 아니라 Object의 멤버들도 나옴 => 자동 상속..
		// 객체(클래스) 복사, 복제
		// 생성자 복제
//		Point p1 = new Point();
//		p1.x  =1;
//		p1.y = 5;
//
//		Point p2 = new Point(); 



	}//main

}//class
class Shape{
	String color = "white";

	// 도형을 그리는 메서드
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}

	void 면적계산() {

	}


} // shape

//원점, 반지름
// int x;
// int y;

class Circle extends Shape {
	Point center;//  has-a 관계
	int r;

	Circle(){
		this(0,0,0);
	}
	Circle(int x, int y, int r){
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle( Point center , int r){
		this.center = center;
		this.r = r;
	}
	@Override // 아무것도 수정하면 안되는데, 부모의 접근지정자보다 크거나 같은 접근지정자를 붙이는건 괜찮다.
	void 면적계산() {

		// 반지름 * 반지름 * 3.14
	}


}

class Triangle extends Shape{

	Point [] p = null;

	public Triangle(Point [] p) {  // 생성자 DI(의존성 주입)
		this.p = p;
	}

	@Override
	void 면적계산() {
		// 가로 * 세로 * 1/2
	}

}
