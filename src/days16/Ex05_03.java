package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 3:41:00
 * @subject
 * @content
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		String [] urlArr = {
				"www.naver.com",
				"http://www.naver.com",
				"http://www.sist.com",
				"https://www.daum.net"
		};

		
		//String regex = "^http://"; 접두어가 http://
		//String regex = ".com$"; 	접미어가 .com
		
	
		for (int i = 0; i < urlArr.length; i++) {
			//if ( urlArr[i].startsWith("http://") )
			if ( urlArr[i].endsWith(".com") )
			System.out.println(urlArr[i]);
		}
		
		
	}//main

}//class
