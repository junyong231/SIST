package days15;

import days14.Regular;

//영업직 사원 클래스
//final => 더 이상 자식 클래스를 가질 수 없는 최종(마지막)클래스
public final class SalesMan extends Regular{ 
	
	//Employee에서 n ,a, t, h disp 물려받고
	// Regular에서 getPay() 받음
	
	private int sales; // 판매량
	private int comm; //커미션
	
	public SalesMan() {
		super();
		
	}

	public SalesMan(String name, String addr, String tel, String hiredate, int basepay, int sales, int comm) {
		super(name, addr, tel, hiredate, basepay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}

	@Override
	public int getPay() {
		
//		return super.getPay(); //이렇게만 하면 기본급만 출력됨 (컨트롤 클릭해보면 나옴)
		return super.getPay() + this.sales * this.comm; 
	}

	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명: %s , 주소: %s , 연락처: %s , 입사일자: %s , 기본급: %d, 커미션: %d \n",
				this.getName(),this.getAddr(),this.getTel(),this.getHiredate(),super.getPay(),this.sales*this.comm);
	}


	
}
