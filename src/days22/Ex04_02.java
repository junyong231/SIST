package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오후 2:33:49
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days22\\child.ser";
		
		 try (FileInputStream fis = new FileInputStream(name);
				 ObjectInputStream ois = new ObjectInputStream(fis); ) {
			Child c = (Child) ois.readObject();
			
			System.out.println(c.name+"/"+c.age); //name은 부모에게 상속받은거라 자식만 구현클래스일 경우 name 부분 null로 찍힘
			
		} catch (Exception e) { 
			
		}

	}//main

}//class
