package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 12:31:32
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
	     // 1) x는 10보다 크다.  x > 10
	      
	      // 2) x는 10보다 크고, 20보다 작다.  x > 10 && x < 20
	      
	      // 3) x는 2의 배수이다.   x%2 == 0
		  // 배수의 정의를 네이버에서 검색해서 적용함
	      
	      // 4) x는 2의 배수 또는 3의 배수이다.  x%2==0 || x%3 ==0
	      int x = 6;
	      System.out.println( x%2==0 || x%3 ==0);
	      // 5) x는 2의 배수이지만 6의 배수는 아니다. x%2==0 && x%6!=0
	      
	      System.out.println( x%2==0 && x%6!=0);
	      // 6) 한 문자(ch)가  숫자이다.  char ch =5 일 때 ch>=0 && ch <= 9
	      // 이것도 맞다_ ch =='0' || ch == '1' || ch =='2' ,,,,ch =='9'
	      
	      char ch ='A';
	      System.out.println( ch>=0 && ch <= 9);
	      System.out.println( ch>='0' && ch <= '9');
	      //System.out.println( 0<=ch<=9); 안되는 표현 방법
	      
	      // 7) 한 문자가 소문자이다. char ch ='a' 일 때 (int) ch >=97 && (int) ch <= 122
	      System.out.println( ch >=97 &&  ch <= 122); //(int) 없이도되네
	      System.out.println( ch >='a' &&  ch <= 'z');
	      // 8) 한 문자가 알파벳이다 ( 대문자이거나 또는 소문자  )  
		  //     ( (int) ch >= 65 && (int) ch <= 90 ) ) || (int) ch >= 97 && (int) ch <= 122 )  
	      System.out.println(  (int) ch >= 65 && (int) ch <= 90  || (int) ch >= 97 && (int) ch <= 122 );
	      System.out.println(   ch >= 'a' &&  ch <= 'z'  || ch >= 'A' && (int) ch <= 'Z' );
	      
	      /* 틀린 코드
	      char ch2 = 'x';
	      System.out.println( 65 <= (int)ch2 <= 122 );
	      오류 : <= 122  int 를 <에 대입할 수 없다
	      결과도 정확하지 않음: 소문자와 대문자 사이에 다른애들 껴있음(아스키코드)
	      */
	}

}
