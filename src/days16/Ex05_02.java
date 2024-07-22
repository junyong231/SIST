package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 2:48:16
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//days16 Ex01 읽어와서
		//예외 라는 문자열이 있는 위치값 모두 출력
		String fileName = ".\\src\\days16\\Ex01.java"; //상대경로

		String content = getFileContent(fileName);

		System.out.println(content);

		/*
		//days11 Ex03에서 가져온 코드 조금 수정
		int index, fromIndex = 0;
		while (  (index = content.indexOf("예외", fromIndex) ) != -1  ) {
			 System.out.println( index );
			 fromIndex = index + 1;
		}
		 */
		
		//이번엔 예외라는 문자열 삭제해보자
		//content = content.replace("예외", "[ ]"); //예외는 다  [ ]로 바뀜 //문자열은 불변이라 리턴만 줌 = content로 다시 받아서 출력
		
		//얘는 정규표현식으로
		//content = content.replaceAll();
		System.out.println(content);
		
		
	}//main

	private static String getFileContent(String fileName) {
		//String fileName ="C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days16\\Ex01.java";


		try(	FileReader reader = new FileReader(fileName);
				//보조스트림
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			String line = null;
			//int lineNumber = 1;

			while ((line = bufferedReader.readLine()) != null) {
				//System.out.printf("%d: %s\n", lineNumber++, line);
				fileName+=line+"\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName; 
	}

}//class
