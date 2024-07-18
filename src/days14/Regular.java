package days14;

public class Regular extends Employee {
	//Object 상속
	//Employee 상속 ( name, addr, tel, hiredate, ,,method..)

	private int basePay = 100; //기본급

	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basepay) {
		super(name,addr,tel,hiredate);
		//		this.name = name; //Employee의 필드가 프라이빗이라 에러..
		//		this.addr = addr; //상속은 받았으나 '접근'이 안됨
		//		this.tel = tel;
		//		this.hiredate = hiredate;
		this.basePay = basepay;
		System.out.println(">Regular 5 생성자 호출됨");
	}

	
	//게터세터
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getPay() {
		return this.basePay;
	}
	
}
