package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오후 2:01:14
 * @subject [ 메모리 스트림 ]
 * @content 주로 다른 곳에 입,출력하기 전에
 * 					메모리 상에서 데이터를 임시로 저장할 목적으로 사용하는 스트림.
 *					1) 바이트 스트림 (안씀
 *					ByteStream[InputStream]/ByteArray[OutputStream]
 *					2) 문자 스트림 (안씀
 *					CharArray[Reader]/CharArray[Writer]
 *					3) 문자열 스트림 (씀_
 *					StringReader/StringWriter
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		try (ByteArrayInputStream bis = new ByteArrayInputStream(buf);
			  ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
			
			int code;
			while ((code = bis.read()) != -1) {
				System.out.println(code);
				bos.write(code);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//main

}//class
