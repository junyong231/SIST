package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22. =오전 11:30:10
 * @subject try/catch 연습 활용
 * @content 라인번호 붙여서 출력. (리소스 자동닫기 try-with-resource 구문   try에 괄호 열어서 처리)
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		//C:\Windows\comsetup.log 
		//위 파일 읽어와서 화면 상에 출력 ?
		//텍스트 읽/쓰 하려면 -> FileReader/FileWriter 라는 객체 필요



		String fileName ="C:\\Windows\\comsetup.log";


		try(	FileReader reader = new FileReader(fileName);
				//보조스트림
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			String line = null;
			int lineNumber = 1;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} 


	}//main

}//class
