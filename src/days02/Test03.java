package days02;

public class Test03 {

	public static void main(String[] args) {
		int x=10,y=20;
		{
			int temp = x;
			x = y;
			y = temp;
		}
		 
		System.out.println();
		System.out.print("\n");
		System.out.print("\r");
		System.out.printf("교환 완료 x = %d, y = %d" , x, y);
 
		//   [출력형식] 이름="홍길동", 나이=25 
		String name = "홍길동";
		byte age = 25;
		System.out.print("\r\n"); //다 넣어도 한줄되네 ㅋㅋ
		System.out.printf("\n이름=\"%s\", 나이=%d",name,age);
	

	}
}