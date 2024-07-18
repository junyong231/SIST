package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오전 10:28:27
 * @subject 객체(클래스) 복사와 복제
 * @content 생성자를 사용하는 복제
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		
		Point p2 = new Point(p1);
		

	}//main

}//class


//컴파일러가 자동으로 Object 클래스 상속..해버림.. (class Point extends Object(모든 클래스의 최상위) 와 같다)
class Point {
	int x,y ;
	Point(){} //기본생성자
	Point(int x, int y){
		this.x = x ;
		this.y = y ;
	}
	
	public Point(Point p) {
		this(0,0);
	}
	
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
}