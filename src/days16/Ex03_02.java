package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 12:32:00
 * @subject 	clone()
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		try {
			Person p1 = new Person("123456-1234567","헝길둥");
			Person p2 = (Person) p1.clone();    
			System.out.println("p1: " + p1);
			System.out.println("p2: " + p2);
		} catch (Exception e) {
			e.getStackTrace();
		}



	}//main

}//class


class Person implements Cloneable{
	//필드
	String rrn;
	String name;

	//생성자
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	//메서드
	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Person pClone = null;
		pClone = (Person) super.clone(); //다운캐스팅

		return pClone;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) { //일단 Person객체여야함
			Person p =(Person)obj; //다운캐스팅
			return this.rrn.equals(p.rrn);//주민번호 같으면 true가져감
		}
		return false;
	}

	//주민번호 같으면 해쉬코드도 맞추겠다는 의도
	@Override
	public int hashCode() { 

		return rrn.hashCode(); //주민번호를 해쉬코드값으로 찍겠다
	}

}