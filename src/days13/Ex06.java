package days13;

import java.util.Date;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 2:21:19
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Person p1 =new Person("홍길동",20,true);
		p1.dispPerson();
		Person p2 =new Person("김길동");   // 이렇게만 만들고 싶다면 또 이것만 받는 생성자 필요
		Person p3 =new Person("박길동",30);
		p2.dispPerson();
		p3.dispPerson();
		
		Date now =new Date(); //Ctrl 스페이스 해보면 나오는 애들=> 다 생성자 => 해당값 가지고 가서 필드 초기화!!!!!!!!!!!!!
		
	}//main

}//class
