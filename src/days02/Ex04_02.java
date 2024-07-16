package days02;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 2:20:04
 * @subject (암기)
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		// int x, y; 
		// int x = 10;
		// int y = 20;
		// 위 코드는 아래와 정확히 같다
		int x = 10, y = 20; //(콤마연산자 이용)
		System.out.printf("교환 전 > x=%d, y=%d" , x, y);
		//두 기억공간을 바꾸기 ->'임시'기억공간 활용 
		{
			int temp;
			temp = x; //temp = 10
			x = y; //x = 20
			y = temp; //y = 10
			
		}//이걸로 지역변수인 temp는 이 괄호 벗어나면 없어짐 ㄷ 메모리 낭비 없는 좋은 코드
		
		System.out.printf("\n교환 후 > x=%d, y=%d",x , y);
		
	}//main

}//class
