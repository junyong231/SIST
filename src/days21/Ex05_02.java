package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 11:47:19
 * @subject	1문자씩 읽기하니까(Ex05) 오래 걸림, buffer로 해보자
 * @content	BufferedReader, BufferedWriter
 *
 */
public class Ex05_02 {

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

		final int BUFFER_SIZE = 1024;
		
		try(FileReader reader = new FileReader(sourceFile);
			 FileWriter writer = new FileWriter(copyFile);
			 BufferedReader br = new BufferedReader(reader,BUFFER_SIZE);
			 BufferedWriter bw = new BufferedWriter(writer,BUFFER_SIZE)	) {
			
			/* 한줄로 나오네
			String line;
			while ( (line = br.readLine()) != null ) {
				bw.write(line);
			}
			*/
			char [] cbuf = new char[BUFFER_SIZE]; //읽어온 문자 저장할 배열
			int readCharNumber; //읽어온 갯수
			while ( (readCharNumber = br.read(cbuf) ) != -1 ) {
				bw.write(cbuf, 0, readCharNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}






}//class
