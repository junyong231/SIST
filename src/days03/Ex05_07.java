package days03;


/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 5:27:47
 * @subject
 * @content
 */
public class Ex05_07 {

	public static void main(String[] args) {
		
		// ++
		int x = 10;
		// int y = ++x;  x=11, y=11
		int y = x++;
		//증감연산자가 우선이니 먼저 도달하지만, 후위형이라 형님먼저 시전함
		//그래서 y=10을 받고 나서야 증감연산자 발동 x=11
		System.out.printf("x=%d, y=%d\n",x,y);
		
		int m = 100;
		//System.out.println(m++ == 100); //true 후위라서 '비교할 때는' 100
		//System.out.println(++m == 100); //false 101임
		
		while( m++ <= 110) {
			System.out.println(m); //m=100이었는데 비교 끝나니 m++ 적용된 값 나옴
												//m=110이었는데 비교 끝나니 m++적용된 값 나옴 111
		}
		/*
		 * int n = 10;
		 * 5증가, 10감소 시켜보자
		 * n += 5;
		 * n -= 10;
		 * 
		 */
		
	}

}
