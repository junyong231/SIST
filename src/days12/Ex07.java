package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 3:33:57
 * @subject Call by Reference 객체도 먹음 ('참조'변수)
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		System.out.printf("x=%d, y=%d\n", p1.x, p1.y);
		swap( p1 ); // Call By Reference      
		System.out.printf("x=%d, y=%d\n", p1.x, p1.y);

	} // main

	private static void swap(Point p1) { //얘도 객체 복사
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
	}

	private static void swap(int [] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}

} // class
