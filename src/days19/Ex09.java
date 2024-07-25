package days19;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 2:47:50
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		//List: AL, V, LL, Q, PQ (어레이리스트 벡터 라승트인라스으
		//Set : HashSet, LinkedHashSet
		//				순서, 중복 X
		
//		new Person()
//			.builder()
//				.name("홍길동")
//				.age(20)
//				.id("kenik")
//				.build();
		
	Set s	=new LinkedHashSet();  //업캐스팅
	s.add(new Person("kenik", "홍길동", 20));
	s.add(new Person("admin", "관리자", 40));
	s.add(new Person("hong", "홍길남", 22));
	
	//id가 똑같은 Person객체는 중복 처리해서 추가X // 밑에 오버라이딩 된 애들 확인
	s.add(new Person("admin", "관리자2", 28));
	System.out.println(s.size());
	
	}//main

}//class


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person {
	String id;
	String name;
	int age;
	
	
	@Override
	public int hashCode() {
		
		return this.id.hashCode(); //id로 해쉬코드 구분
	}


	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Person) {
			Person p = (Person) obj;
			return p.id.equals(this.id);
		}
		return false;
	}
	
}














