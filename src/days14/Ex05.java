package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오전 11:38:05
 * @subject	상속관계 (is-a관계)
 * @content	상속 inheritance
 *					기존의 클래스를 재사용하여 새로운 클래스를 선언하는 것.
 *							  멤버
 *
 *	장점: 있는 코드 재사용 => 생산성 , 유지보수 이점 있음
 *[접] [기] class 클래스명 extends  부모(super)클래스 {
 *																멤버(필드 ,메서드)
 *								 						   }   
 */

public class Ex05 {

	public static void main(String[] args) {

	



	}//main

}//class

//상속을 모르던 시절..
/*
class Point3D {
	int x;
	int y;
	int z;


	Point3D() {}
	Point3D(int x, int y, int z) {
		this.x =x;
		this.y =y;
		this.z =z;
}
 */

class Point3D extends Point2D { //상속...(확장된)
	//	int x;
	//	int y; 안써도 됨
	// 생성자는 상속되지 않으므로 물려받은건 이게 다임..	**
	int z;


	Point3D() {

	}
	Point3D(int x, int y, int z) {
//		this.x =x;
//		this.y =y;
		super(x,y); //부모 것 호출
		this.z =z;	

	}
}



	//기존 클래스
	class Point2D {

		int x;
		int y;

		Point2D() {
		}
		Point2D(int x, int y) {
			this.x =x;
			this.y =y;
		}
	}