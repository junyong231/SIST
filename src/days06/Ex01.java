package days06;

import java.io.IOException;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오전 9:46:52
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		char one;
		System.out.print("> 한 문자 입력 ?"); 
		int nextByte = System.in.read(); //Reads the next byte of data from the input stream 바이트값으로 읽어줌
		System.out.println(nextByte);  //바이트값 나옴
//		one = (char) System.in.read();
//		System.out.println(nextByte); //문자 나옴
		
// 		스트림? (빨대)		위에서  A 치고 엔터치면 \r \n도 입력된거기 때문에 얘넬 빼줘야 다음 문자 입력 가능
//		System.in.read(); //13
//		System.in.read(); //10
		//22,23행 없어도 아래와 같이 하면 된다
		
		System.in.skip(System.in.available());//여러개 스트림 들어간거 스킵
		//원리: available이 현재 읽을 수 있는 스트림 반환(이 경우 한문자 + \r + \n이었고 프린트로 한문자는 읽었으니 개행문자 두개 남음
		//skip이 available이 반환한 값을 스킵함 : 이제 빨대 깨끗해짐
		// *버퍼링된 입력을 모두 제거하는 코드*
		
//		복붙 - 왜 프로그램 끝남? - 스트림
		System.out.print("> 한 문자 입력 ?");
		nextByte = System.in.read();
		System.out.println(nextByte); 
//		one = (char) System.in.read();
		
		
		
		
	}//main

}//class
