package days02;


/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 3:23:53
 * @subject  논리형(boolean) - true/false    (1)
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//남녀 성별 나타내는 변수 선언
		//여러가지 방법이 있다 
		// 트루를 남자로 놓으면 폴스는 여자가 되고 뭐 등등
		
		// true  false
		//  1       0                        byte~long
		//"male" "female"             String
		// 'm'           'f'                 char
		// 활용도 따졌을 때 boolean이 낫다
		
		boolean gender;
		gender = true;  
		
		
		//%[argument_index$][flags][width][.precision]conversion
		
		System.out.printf("성별은 = %B\n",gender); //불리언은 b,B였다 (대소문자 출력차이)
		
		if(gender=false) {
			System.out.println("성별은 남자");
		}else {
				System.out.println("성별은 여자");
			}
		
		
//		전공자
		
		

		//%뭔지 찾아보는법 오라클 사이트에서 printf로 검색
		//https://docs.oracle.com/en/java/javase/11/docs/api/
		//java.io에서 printstream 이쪽에 있는거
		//Format string syntax 눌러서 ㄱ
		
		
		
		int x =10;
		System.out.printf("%d\n",x);
		System.out.printf("%o\n",x);
		System.out.printf("%1$x %1$X\n",x); //("%x %X ",x,x) 안해도 한번에 가능
		System.out.printf("%1$d %1$o %1$x\n",x); 	
		
		
		
	}

}
