package days13;


/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 2:12:49
 * @subject Point2 (생성자 만든버전)이랑 연결
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		
		
		//객체(클래스) 배열
		Point2 [] points = {
				new Point2(10,20),
				new Point2(1,2)
		};
		
		points[1].dispPoint();

		
		
		/*
		Point2 p1 = new Point2(10,20);
//		p1.x = 10;
//		p1.y = 20;

		Point2 p2 = new Point2(1,2);
//		p2.x = 1;
//		p2.y = 2;
		//p2.dispPoint();

		//p1.plusPoint(p2);
		//p1.dispPoint();

		p1.plusPoint(p1, p2).dispPoint();
		p2.plusPoint(p1, p2).dispPoint();
		//이 함수에선 호출한 객체는 의미없고, 새로운 객체 p가 리턴된다

		Point2 p3 = p1.plusPoint(p1, p2);
		p3.dispPoint(); //같은 코드다.
		p2.plusPoint(p1, p2).dispPoint();
		*/
	}//main

}//class
