package days13;

public class Point2 {

	//field
	private int x ;
	private int y;
	
	//constructor
	public Point2() { //생성자를 선언했다면 컴파일러가 (아래에 있는) default 생성자를 자동으로 생성하지 않는다 = 직접 해줘야됨

	}
	
	public Point2(int a, int b) {
		//생성자의 역할 : 필드 초기화
		x = a;
		y = b;
	}
	
	
	//getter setter
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	//method
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d", x, y);
	}
	
	
	public void plusPoint(Point2 p) { 
		x = x + p.x;
		y = y + p.y;
		
	
	}
	
	
	
	
	public Point2 plusPoint(Point2 p1, Point2 p2) { 
		int x = p1.x + p2.x;
		int y = p1.y + p2.y;
		
		//The constructor Point2() is undefined 
		Point2 p = new Point2();
		p.x = x;
		p.y =y;
		
		return p; 
	}
}
