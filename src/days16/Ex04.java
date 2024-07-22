package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 2:13:00
 * @subject 객체로부터 Class객체를 얻어오는 방법 3가지.
 * @content	
 * 				시험)))			Class 클래스 타입? 
 * 
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. Object.getClass()
		Person p1 = new Person("123456-1234567", "홍길동");
		Class cls =  p1.getClass();

		// 2. 모든 클래스 마다   class 클래스 변수가 있다.
		Class cls2 = Person.class;
		// Person p1 = new Person();
		try {
			Person p2 = (Person) cls2.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		// 3. Class.forName()
		String fullName = "days16.Person";
		try {
			Class cls3 =	Class.forName(fullName); // JDBC
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	} // main

} // class
