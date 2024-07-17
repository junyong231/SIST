package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오전 11:13:10
 * @subject	메소드 리턴자료형 참조형(中클래스)인 경우
 *					메소드 매개변수 참조형(中클래스)인 경우
 * @content
 * 중요한 예제임!
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//메소드 리턴자료형 참조형(中클래스)인 경우
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;

		Point p2 = new Point();
		p2.x = 1;
		p2.y = 2;
		//p2.dispPoint(); //x,y는 p2꺼가 됨 p2.했으니!

		//p1.plusPoint(p2);
		//p1.dispPoint();

		p1.plusPoint(p1, p2).dispPoint();
		p2.plusPoint(p1, p2).dispPoint();
		//이 함수에선 호출한 객체는 의미없고, 새로운 객체 p가 리턴된다

		Point p3 = p1.plusPoint(p1, p2);
		p3.dispPoint(); //같은 코드다.
		p2.plusPoint(p1, p2).dispPoint();

	}//main

}//class
