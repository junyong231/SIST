package days22;

import java.io.File;
import java.io.FilenameFilter;

public class Ex02_02_02 {

	public static void main(String[] args) {

		String pathname = ".\\src\\days21";
		// days21 폴더 안에서   자바파일( .java )만 조회
		File file = new File(pathname);

		/*
		File [] list =  file.listFiles(new FilenameFilter() { //익명 클래스
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});		
*/
		//람다식 표현 
		File [] list2 = file.listFiles( (dir, name) -> name.endsWith(".java") );
		
		
		
		for (int i = 0; i < list2.length; i++) {
			File f = list2[i];
			System.out.println(f.getName());
		}
	}//main

}//class
