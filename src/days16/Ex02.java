package days16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22. =오전 11:30:10
 * @subject try/catch 연습 활용
 * @content
 *
 */

public class Ex02 {

	public static void main(String[] args) {
		// try~catch 연습
		// C:\Windows\comsetup.log 파일을 읽어와서 출력.
		// 텍스트파일을 읽기/쓰기 -> FileReader/FileWriter
		FileReader reader = null;
		String fileName = "C:\\Windows\\system.ini";

		int one = -1;

		try {
			reader = new FileReader(fileName);
			//
			// int one =  reader.read();
			// System.out.printf("%c", (char)one);

			while( (one =  reader.read()) != -1) { //파일리더가 -1을 반환하면 End Of File 더 읽을 데이터 없다는 뜻
				System.out.printf("%c", (char)one); //아스키 코드를 다시 강제형변환함
			};

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					reader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // try


	} // main

} // class