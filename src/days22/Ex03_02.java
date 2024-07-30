package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오후 2:25:42
 * @subject 파일 역직렬화해서 읽기
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days22\\user.ser";
		
		 try (FileInputStream fis = new FileInputStream(name);
				 ObjectInputStream ois = new ObjectInputStream(fis); ) {
			User u1 = (User) ois.readObject();
			User u2 = (User) ois.readObject();
			ArrayList<User> list = (ArrayList<User>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			
		} catch (Exception e) {
			
		}
		
		
		

	}//main

}//class
