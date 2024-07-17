package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오전 11:50:33
 * @subject	private로 선언된 필드에 접근하는 방법
 * @content 굳이 왜 private로 막아서 둘러서 가는지 생각
 *
 */
public class Ex04 {

	
	public static void main(String[] args) {
		//Person 클래스 선언
		
		Person p1 = new Person();
		Person p2 = new Person();

	
		//1) 생성자로 접근
		//2) getter, setter 로 접근
		p1.setAge(24);//setter로 private age 접근
		System.out.println(p1.getAge()); //getter로 접근
		
		p1.dispPerson();
		
		
		p2.setAge(10);
		p2.setName("박떙땡");
		p2.setGender(true);
		p2.dispPerson();
	}//main

}//class
