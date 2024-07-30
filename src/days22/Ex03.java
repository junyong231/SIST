package days22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오후 12:23:58
 * @subject [직렬화 Serialization] 
 * @content 	객체를 스트림으로 만든 것..
 *								ㄴ데이터 송/수신 위한 것
 *				  [역직렬화 descrialization]
 */
public class Ex03 {

	public static void main(String[] args) {
		//객체를 직렬화/역직렬화할 수 있는 바이트 스트림
		//ObjectInputStream
		//ObjectOutputStream
		
		//사람(사용자) 정보를 송/수신
		// 이름,주소,나이 등등 있겠지
		// String info = "홍길동/서울/23/.."; 문자열에 구분자를 둬서 할 수도 있으나..
		//
		
		User u1 = new User("이시훈","1234",25);
		User u2 = new User("원충희","4321",29);
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		
		//u1 ,u2 ,list 객체를 직렬화 -> 파일에 쓰기(저장) ?
		
		String name = ".\\src\\days22\\user.ser"; //확장자 의미없다
		try(FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { //oos는 보조스트림 (fos)를 함 더 가공
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush(); //실제 쓰기 작업 실행
			
			System.out.println(">u1,u2,list  객체를 직렬화 시켜서 oos 파일로 저장 완료!!!");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}//main

}//class
