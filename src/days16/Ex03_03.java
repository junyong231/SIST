package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 2:01:47
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567","헝길둥");
		Person p2 = new Person("123456-1234567","홍길동");
		System.out.println(p1 == p2); //다른 인스턴스여서
		
		//System.out.println( p1.equals(p2)); //equals 따로 오버라이딩 안함 , 결국 ==랑 동일한 결과값..
		
		//주민번호만 같으면 같은 사람으로 처리를 하자.
		//Ex03_02가서 equals()를 오버라이딩하여 처리함
		System.out.println( p1.equals(p2)); //이제 트루나옴
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		//주민번호 같으면 해쉬코드도 맞추도록 처리함(같은값)
		
	}//main

}//class
