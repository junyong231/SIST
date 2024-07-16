package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject 10진수 16진수 만들기
 * @content
 *
 */
public class Ex04_04 {

	public static void main(String[] args) {
		//125 == 0x7d
		
		int n = 125;
		int share, reminder;
		String hex = "";
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
		
		while (n != 0) {
			share = n/16;
			reminder = n%16;
			hex = ch[reminder] + hex; //이렇게 인덱스 넣어줄 수도 있다는걸 기억
			//System.out.printf("%d",reminder);
			n=share;			
		}
		hex = "0x"+hex;
		System.out.println(hex);
		
		
		
		
		
		
		//나중에 배우는 것들 이용
		
		
//	      // 10 진수 정수 => 16진수 출력.
//	      int n = 125;     //  0x7D
//	      
//	      int remider, share;   
//	      
//	      // String strHex = "";
//	      StringBuilder sb = new StringBuilder();
//	      
//	      String hex = "0123456789ABCDEF";
//	      while ( n != 0 ) {   
//	         share = n / 16;
//	         remider = n % 16;
//	         // System.out.println(remider);
//	         sb.append(hex.charAt(remider));
//	         //sb.insert(0, hex)
//	          
//	         n = share;
//	      } // while
//	      
//	      System.out.println( sb.reverse()  );  

	}//main

}//class
