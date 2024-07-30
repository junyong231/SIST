package days22;

import java.io.File;


/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 9:44:26
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		/* 내풀이
		String pathName = ".\\src\\days21";
		//days21 안에서 확장자가 .java 인 파일만 조회하고 싶다 ? 
		File parent = new File(pathName);
		File [] list = parent.listFiles();
		
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			if (child.isFile()) {//파일인지 먼저 체크하는게 빠졌군!
				if (child.getName().matches(".*\\.java$")) { // .endsWith(".java") 도 있음 ㅋㅋ
				System.out.println(child.getName());
				}
			}
			
		}
		*/
		
		String pathname = ".\\src\\days21";
	      // days21 폴더 안에서   자바파일( .java )만 조회
	      File file = new File(pathname);
	      File [] list = file.listFiles();
	      int no = 1;
	      for (int i = 0; i < list.length; i++) {
	         File f = list[i];
	         if( f.isFile()) {
	            String fileName = f.getName();
	            // matches( ".*\\.java$")
	            if(  fileName.endsWith(".java") ) {
	               System.out.printf( "%d. %s\n", no++, fileName );
	            } // if

	         } // if
	      } // if


	}//main

}//class
