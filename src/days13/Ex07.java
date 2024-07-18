package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 2:38:30
 * @subject	[	this	]
 * @content	1. this 정의 ? """"""" 클래스 자기 자신의 주소값을 갖는 참조변수 """""""""
 *  
 * 						Tv t1 = new Tv();	//변수(참조변수) , 객체
 * 						Tv [this];
 * 
 *		0x100 [power][channel][color].. (= 인스턴스) ========참조======= [0x100]t1
 *		 자기 자신의 '주소값'을 갖는 참조변수 == 인스턴스 선언 이후여야함	 this => 0x100 (인스턴스의 주소)
 *
 *		다시 선언했을 때
 *		0x200 [power][channel][color].. (= 인스턴스) ========참조======= [0x200]t1
 *					this => 0x200
 *
 *	
 *					2. this의 용도 세가지
 *						ㄱ. 멤버(클래스의 구성요소) = 생성자, 필드, 메서드 (게터,세터,[생성자])를 가리킬 때 사용되는 this.
 *						ㄴ. 생성자에서 또 다른 생성자를 호출할 때의 this 용도
 *						ㄷ. 리턴값, 매개변수값으로 사용되는 this 용도
 */


public class Ex07 {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20); //객체 생성
		p1.plusPoint(100).dispPoint();
		
		Member m1 = new Member("\n홍길동", "목동");
		System.out.println(m1.getName()+" "+m1.getAddr());
		
		Member m2 = new Member();
		System.out.println(m2.getName()+" "+m2.getAddr());
		
	
		
		
		
	}//main

}//class

class Member {
	
	//2개의 필드
	private String name;
	private String addr;
	
	//생성자
		//Member m2 = new Member();
	public Member() { //디폴트 생성자
		//super();
		this("익명","미정"); //this의 두번째 용도
		} //다른 코딩보다 위에 있어야함 (제일)
	
	
	
	public Member(String name, String addr) { //매개변수 2개 받는 생성자
		this.name = name; 
		this.addr = addr;
	}//this사용
	
	//게터 세터
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
	
}//classMember









