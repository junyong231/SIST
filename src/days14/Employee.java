package days14;

//롬복 있었는데 걍 지워버림

//사원클래스
//모든 사원들이 공통적으로 가지고 있을 멤버들을 선언

//@Getter
//		ㄴ롬복으로 만든 어노테이션: 컴파일러가 나중에 알아서 게터로 바꿔줌

public class Employee {

	//필드
	private String name;
	private String addr;
	private String tel;
	private String hiredate;


	public void nado(String name, String addr, String tel, String hiredate) {//super가 왜 여긴 안오고 생성자로 가는거지 super는 생성자로 우선 가나
		System.out.println("나도 슈퍼야");
	}
	
	public Employee() {//디폴트 생성자
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨");
	}

	
	//게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	//사원 정보 출력 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명: %s , 주소: %s , 연락처: %s , 입사일자: %s \n",this.name,this.addr,this.tel,this.hiredate);
	}
	
	
}//class