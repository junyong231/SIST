package days21;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 10:07:05
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//days21 안에 Ex01.java
		//텍스트 파일 -> 문자 스트림
		//파일				+ 문자 스트림 = FileReader, FileWriter
		
		String parent = ".\\src\\days21";
		String child = "Ex01.java";
		
		
		File file = new File(parent, child); //File 클래스: 파일 +디렉토리(폴더)를 다루는 여러 기능이 구현된 클래스 (생성 삭제 정보확인 변경 등)
		System.out.println(file.length() + "byte");
		System.out.println(file.isDirectory() + "/" + file.isFile());
		
		long ms = file.lastModified();
		System.out.println(ms); //1722212032919 => 연월일 시간분초로 바꾸려면?
		Date ms2 = new Date(ms);
//		System.out.println(ms2);
//		System.out.println(ms2.toLocaleString());
		String pattern = "yyyy년 MM월 dd일 hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(ms2));
		
		
		
		try(FileReader reader = new FileReader(file)) {
			int code;
			while ( ( code = reader.read() ) != -1 )  {
				System.out.printf("%c",(char)code);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}//main

}//class
