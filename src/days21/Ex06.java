package days21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오후 12:14:14
 * @subject BinaryStream (으로 읽고 쓰기 == 카피) 
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

//		String sourceFile = "‪C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
//		String copyFile = "‪C:\\Users\\User\\Documents\\iexplore_copy.exe";
		
	      String sourceFile = "C:\\Users\\User\\Downloads\\KakaoTalk_Setup.exe";
	      String copyFile = "C:\\Users\\User\\Documents\\KakaoTalk_Setup_copy.exe";
		
		fileCopyBinaryStream(sourceFile,copyFile);


	}//main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		try(FileInputStream fis = new FileInputStream(sourceFile);
			 FileOutputStream fos = new FileOutputStream(copyFile);) {
			
			int code; //이건 같음
			
			while ( (code = fis.read() ) !=-1) {
				System.out.printf("%08d\n" , Integer.parseInt(Integer.toBinaryString(code)));
				fos.write(code);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}






}//class
