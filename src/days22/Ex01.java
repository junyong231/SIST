package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 9:01:30
 * @subject [ File 클래스 ]
 * @content	ㄴ파일, 디렉토리
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		String pathname = "C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days21\\Ex01.java";
		File file = new File(pathname);
		
		System.out.println(file.getParent()); //파일명 앞까지 경로 나옴
		System.out.println(file.getName()); //파일명
		//어제 서브스트링 하던 쇼 안해도 되는거였음
		
		System.out.println(file.getPath()); //상대 경로
		System.out.println(file.getAbsolutePath());//절대경로
		System.out.println(file.getCanonicalPath());
		
		System.out.println(file.isFile()); 
		System.out.println(file.isDirectory());
		System.out.println(file.length()); //크기
		System.out.println(file.exists()); //존재유무
		
		System.out.println(file.pathSeparator); //os에서 사용하는 경로 구분자 
		System.out.println(file.separator ); // os에서 사용하는 이름 구분자
		
		String fileName = file.getName();
		//확장자
		//확장자 제외 파일명
		//days21에 했다.?
				

	}//main

}//class
