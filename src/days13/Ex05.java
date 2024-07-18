package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 12:34:25
 * @subject	[   생성자   ] (constructor)
 * @content		
 * 		
 * 					[암기][암기][암기][암기][암기][암기][암기][암기][암기][암기][암기][암기][암기][암기][암기]
 * 		1. 일종의 메소드이다
 * 		2. 메소드의 이름이 반드시 클래스의 이름과 같아야 한다. Scanner();
 * 		3. return 자료형이 없다 (void 조차도 붙이지 않는다=>무언가 돌려주는 행위는 절대 안함)
 * 		4. 역할: 필드 초기화
 * 		5. 호출 시기: 인위적으로 호출 할 수 없다! : 객체 생성할 때 자동으로 호출됨. new Tv(); 이때 '  ()  '가 생성자를 호출한다는 의미! (a,a,a)하면 필드에 하나씩 들어감
 *		6. 오버로딩 O
 *		7. 디폴트 생성자 (default constructor) : 매개변수가 없는 생성자
 *		8. 생성자는 상속되지 않는다.*
 *		9. 생성자는 접근지정자는 사용할 수 O , 기타제어자는 X
 *		10. 컴파일러에 의해서 생성자가 1개도 없는 경우에 자동으로 default생성자를 생성한다
 *
 */
public class Ex05 {

	public Ex05() {

	}//

	public Ex05(String msg) {

	}// 생성자도 오버로딩 가능하다.

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.dispPoint();
		
		
		Point p2 = new Point();
		p2.x = 1;
		p2.y = 2;

		p1.plusPoint(p1, p2).dispPoint();
		p2.plusPoint(p1, p2).dispPoint();





	}//main

}//class
	