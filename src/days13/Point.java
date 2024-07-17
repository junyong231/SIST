package days13;

public class Point {

	//field
	public int x ;
	public int y;
	
	//method
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d", x, y);
	}
	
	
	//p1.plusPoint(p2);
	public void plusPoint(Point p) { //p의 경우 식별자이므로 개발자 마음대로
		x = x + p.x;
		y = y + p.y;
		
		// x는 호출한 객체 p1
		// p.x는 매개변수 p2 것인 것을 이해하라
	}
	
	
	
	//Duplicate method plusPoint(Point) in type Point 
	//public Point plusPoint(Point p) 일 때 : 리턴자료형으로 구분 못함 => 중복으로 인식
	
	
	//		p1.plusPoint(p1, p2).dispPoint();
	public Point plusPoint(Point p1, Point p2) { //p의 경우 식별자이므로 개발자 마음대로
		int x = p1.x + p2.x;
		int y = p1.y + p2.y;
		
		Point p = new Point();
		p.x = x;
		p.y =y;
		
		return p; // 새로운 객체 p의 주소값을 넘긴다
	}
}
