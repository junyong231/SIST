package days21;

import java.io.File;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오전 10:33:53
 * @subject
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		
		String parent = ".\\src\\days22";
		//days22 폴더 안에 upload 폴더의 유무 확인 후 
		//없을 경우 폴더를 생성하는 코드 ?
		
		File uploadDir = new File(parent, "upload");
		
		
		//System.out.println(uploadDir.exists()); //존재하니?
		if (!uploadDir.exists()) { //업로드 없다면
			//uploadDir.mkdirs(); //upload 아래에 자식 폴더 만들고 싶을 때 사용하면 upload(원래 없던 부모 디렉)까지 만들어줌
		   System.out.println(uploadDir.mkdir()); //얘로 위와같이 했을 땐 오류남
			
		}else { //있을 때 폴더 삭제
			System.out.println(uploadDir.delete());
			//uploadDir.deleeteOnExit() 는 실행 중인 응용프로그램 종료될 때 삭제하겠다 - 프로그램 사용시 생성되는 temp같은 임시 폴더,파일들 있을 때
		}
		

	}//main

}//class
