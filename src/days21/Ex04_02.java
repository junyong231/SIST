package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 10:40:35
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		//실행 후 
		// 1. 저장한 파일명 입력 ?  test.txt 
		// 2. 저장할 내용(Data) 입력 ?  문자열 입력 엔터
		//		계속 y / n

		String parent = ".\\src\\days21";
		String child ;
		char con = 'y';
		String content;
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("저장할 파일명 입력 ? ");
			child = sc.next();
			
			File file = new File(parent, child);
			
			do {
				try(FileWriter writer = new FileWriter(file, true) ) { //append true해도 해결
					System.out.println("2. 저장할 문자열 입력 ? ");
					content = sc.next();
					writer.write(content);
	            } catch (Exception e) {
	               e.printStackTrace();
	            }

				
				System.out.println("계속 ?");
				con = (char) System.in.read();
				System.in.skip(System.in.available());
				
			} while (Character.toUpperCase(con)=='Y');
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class
