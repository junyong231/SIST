package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 3:44:20
 * @subject 객체(클래스) 배열
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
			     //*배열명 (객체명 아님)
		Point point = new Point(); //객체화
		Point [] points =  new Point[500]; //배열 선언 (객체 아님.) 타입이 Point(클래스)일 뿐
		
		for (int i = 0; i < points.length; i++) {
			points[i] = point;
		}
		
		
		//클래스 배열 사용시 주의할 점 *
		//points[0] = new Points(); 만 해도 됨
		
		points[0].x =10;
		points[0].y =20;
		points[0].dispPoint(); //Nullpointer에러 : 인스턴스화(객체 안됨)
		
		
		
	}//main

}//class
