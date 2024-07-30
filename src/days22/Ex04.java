package days22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author JUNYONG
 * @Date 2024. 7. 30.=오후 2:33:38
 * @subject [직렬화/역직렬화] 확인할 것들. 
 * @content  1) 부모가 직렬화 할 수 있는 (즉, implements Serializable ) 클래스라면
 * 					    자식은  Serializable  구현하지 않아도 직렬화 가능하다 (당연)
 * 
 * 					2)  자식만 구현되어 있다면 부모의 멤버는 직렬화 대상에서 제외된다.
 *					3) 부모클래스 안건들고 자식 클래스만 손대서 둘 다 직렬화 가능케 하려면?
 */
public class Ex04 {

	public static void main(String[] args) {


		Child c = new Child();
		c.name="홍길동";
		c.age=10;
		//직렬화 대상에서 부모의 멤버는 제외된다. (name은 제외)
		String name = ".\\src\\days22\\child.ser"; //확장자 의미없다
		try(FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { //oos는 보조스트림 (fos)를 함 더 가공

			oos.writeObject(c);

			oos.flush(); //실제 쓰기 작업 실행

			System.out.println(">c  객체를 직렬화 시켜서 oos 파일로 저장 완료!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
class Parent{ 
	String name;

}

class Child extends Parent implements Serializable {
	int age;
	
	//3)
	private void writeObject(ObjectOutputStream out) throws IOException {//쓸 때
		out.writeUTF(name); // 개발자 직접  추가 (부모의 멤버)
		out.defaultWriteObject(); // 자동 추가   (직렬화 구현한 애들) 
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {//읽을 때
		name = in.readUTF(); // 개발자 직접  추가
		in.defaultReadObject();  // age
	}
}



//class Parent implements Serializable{ 
//	String name;
//
//}
//
//class Child extends Parent {
//	int age;
//}