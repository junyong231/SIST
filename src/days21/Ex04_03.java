package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 10:40:35
 * @subject 파일이 여러줄 입력이 안되고 덧씌어지는 문제 해결..
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {


		String parent = ".\\src\\days21";
		String child ;
		char con = 'y';
		String content;

		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("저장할 파일명 입력 ? ");
			child = sc.next();

			File file = new File(parent, child);
			try(FileWriter writer = new FileWriter(file) ) {
			do {

				System.out.println("2. 저장할 문자열 입력 ? ");
				content = sc.next();
				writer.write(content + "\n"); //개행 가능 버전

				System.out.println("계속 ?");
				con = (char) System.in.read();
				System.in.skip(System.in.available());

			} while (Character.toUpperCase(con)=='Y');
		}catch (Exception e) {
			e.printStackTrace();
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}


}//main

}//class
