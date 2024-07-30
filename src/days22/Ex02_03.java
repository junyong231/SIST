package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 10:16:33
 * @subject
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {

		String pathname = ".\\src\\days21";
		String keyword = "DataInputStream"; //이게 포함된 라인번호,텍스트,path 가져오기
		File file = new File(pathname);
		
		File [] list = file.listFiles( (dir, name) -> name.endsWith(".java") ); //java파일 중에서만 고려
		
		File child = null;
		int line = 0;
		String text = null;
		String path = null;
		String fileName = null;
		String strLine = null; //읽어온 라인
		
		
		for (int i = 0; i < list.length; i++) {
			child = list[i];
			fileName = child.getName();
			line= 1; //파일 읽을 때마다 라인번호 초기화 해야함!!
			try( FileReader reader = new FileReader(child);
					BufferedReader br = new BufferedReader(reader);) { // 파일 한 줄씩 읽자
				while ( (strLine = br.readLine()) != null ) {
					if (strLine.contains(keyword)) {
						strLine = strLine.replace(keyword, "***"+keyword+"***");
						System.out.printf("%d\t%s\t%s\n",line,strLine,fileName);
					}
					line++;
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
		
		
		
	}//main

}//class
