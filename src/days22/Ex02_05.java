package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 10:49:56
 * @subject
 * @content
 *						days22
 *							ㄴ temp
 *								ㄴ a.txt (파일)
 *								ㄴ b.txt
 *								ㄴ subtemp (폴더)
 *										ㄴ c.txt 
 *																	만들어보자 ?
 *
 *참고: https://needjarvis.tistory.com/742
 *
 */
public class Ex02_05 {

	public static void main(String[] args) throws IOException {

		//		String pathname = ".\\src\\days22\\temp\\subtemp";
		//		File f = new File(pathname);
		//		f.mkdirs();
		//		//
		//		File atxt = new File(".\\src\\days22\\temp\\a.txt");
		//		atxt.createNewFile();
		//		File btxt = new File(".\\src\\days22\\temp\\b.txt");
		//		btxt.createNewFile();
		//		File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
		//		ctxt.createNewFile();


		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);
		File [] flist = f.listFiles();
		/* 내풀이
		if (f.exists()) {
			//System.out.println(f.delete()); //하위 디렉토리+파일이 있어서 삭제 안됨 false뜸

			//아래부터 싹 지우면서 올라와야함 = 재귀함수 이용..
			killson(flist);
			f.delete();
		}
		System.out.println(" END");
		 */

		scanDelete(f);
		f.delete();
		System.out.println(f.getName()+" 폴더 삭제");

	}//main

	private static void scanDelete(File f) {
		File[] files = f.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				file.delete();
				System.out.println(file.getName()+" 파일 삭제");
			} else {
				scanDelete(file.getAbsoluteFile());
				file.delete();
				System.out.println(file.getName()+" 폴더 삭제");
			}
		}

	}

	//내풀이
	private static void killson(File[] flist) {
		//System.out.println(flist.length); 
		for (int i = 0; i < flist.length; i++) {
			File child = flist[i];
			if (child.isDirectory()) {
				flist = child.listFiles();
				killson(flist);
			}
			child.delete();

		}
	}


}//class
