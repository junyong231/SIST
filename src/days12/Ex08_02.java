package days12;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 4:07:08
 * @subject [ 클래스 배열 초기화 ]
 * @content
 *
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		/* 방법 1
		Tv [] tvArr = new Tv[3]; //클래스 배열 선언
		tvArr[0] =new Tv();
		tvArr[1] =new Tv();
		tvArr[2] =new Tv();
		*/
		
		
			//방법2
		 Tv [] tvArr =  {
                 new Tv(), //   tvArr[0] = new Tv(); 라는 뜻. tvArr은 배열 선언할 때 타입이 Tv인것도 명시했음 즉 Tv tvArr[0] = new Tv(); 로 초기화 된 것
                 new Tv(),
                 new Tv()
              };  


	}//main

}//class
