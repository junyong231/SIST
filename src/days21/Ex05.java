package days21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 11:15:10
 * @subject Ex01.java -> Ex01Copy.java
 * @content FileReader FileWriter 써서 복사 가능
 *
 */
public class Ex05 {

	public static void main(String[] args) {

		String sourceFile = ".\\src\\days21\\Ex01.java";
		String copyFile = "";
		String [] newSc = sourceFile.split("\\\\");
		System.out.println(Arrays.toString(newSc));
		int last = newSc.length -1;
		System.out.println(newSc[last]);
		int idx = newSc[last].indexOf(".");
		String copyN = newSc[last].substring(0,idx) + "Copy";
		System.out.println(copyN);
		copyFile = ".\\src\\days21\\"+ copyN+"1.java";
		System.out.println(copyFile);

		fileCopyTextStream(sourceFile,copyFile);


	}//main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {

		try(FileReader reader = new FileReader(sourceFile);
			 FileWriter writer = new FileWriter(copyFile);) {
			int code;
			while ( (code = reader.read()) !=-1) {
				writer.write(code);
			}
			writer.flush(); //이거 없으면 저장 안된다..?
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}






}//class
