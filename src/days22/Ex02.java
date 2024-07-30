package days22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 9:16:44
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		//javaPro까지
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);

		//하위폴더 파일 조회
		//parent.list(); //하위 디렉토리, 파일 목록 리턴
		//parent.list(filter) //필터링된 하위 디렉토리, 파일
		//parent.listFiles();// File 배열 
		//parent.listFiles(filter);// '' 필터링된.

		/*
		String [] list = parent.list();
		for (int i = 0; i < list.length; i++) {
			//System.out.println(list[i]);

			File child = new File(parent, list[i]);
			System.out.println(child.isFile()?"파일":"폴더");
		}
		 */	

		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			String name = child.getName();
			
			long ms =  child.lastModified();
			Date ms2 = new Date(ms);
			String pattern = "yyyy-MM-dd a h:mm"; //출력형식을 파일탐색기와 같게 하라 -> ㄹㅇ 똑같게 하는 연습..
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
			
			System.out.printf("%s\t%s\t%s\t%dbyte\n",child.isFile()?"파일":"폴더", name, sdf.format(ms2) ,child.isFile()?child.length():0);
		}



	}//main

}//class
