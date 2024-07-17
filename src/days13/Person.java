package days13;

public class Person {

	//field
	private String name;
	private int age;
	private boolean gender;


	//method
	public void dispPerson() {
		System.out.printf("이름:%s 나이:%d %s\n",name,age,(gender==false ? "여자" : "남자"));
	}

	//getter,setter (내부 메소드(프라이빗 접근 가능)를 퍼블릭으로 생성하면=> 결과적으로 외부에서도 프라이빗 접근 가능 간접적으로.)
	public void setAge(int _age) {
		if (0 > _age || _age > 150) { //나이가 유효값이 아니라면 널포인터 에러를 발생시킴
			throw new NullPointerException();
		}else {
			age = _age;
		}
	}//setter 쓰기

	public int getAge()  {
		return age;
	}//getter 읽기
	
	//Alt Shift S: 만들어지지 않은 필드에 대해서 게터 세터 바로 만들 수 있는 창 나옴
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





}
