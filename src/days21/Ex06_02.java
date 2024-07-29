package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
 * @content BufferedInputStream, BufferedOutputStream 이용.. (개빠름)
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {

		//		String sourceFile = "‪C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		//		String copyFile = "‪C:\\Users\\User\\Documents\\iexplore_copy.exe";


		String sourceFile = "C:\\Users\\User\\Downloads\\KakaoTalk_Setup.exe";
		String copyFile = "C:\\Users\\User\\Documents\\KakaoTalk_Setup_copy.exe";

		fileCopyBinaryStream(sourceFile,copyFile);


	}//main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {
		final int BUFFER_SIZE = 1024;
		try(FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis,BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos,BUFFER_SIZE)) {

			int code; //이건 같음
			
			byte [] b = new byte [BUFFER_SIZE];
			int readByteNumber;

			while ( ( readByteNumber = bis.read(b) ) !=-1) { //여기도 고쳐준거임
//				System.out.printf("%08d\n" , Integer.parseInt(Integer.toBinaryString(code)));
//				fos.write(code);
				bos.write(b, 0, readByteNumber);
			}
			bos.flush();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}






}//class
