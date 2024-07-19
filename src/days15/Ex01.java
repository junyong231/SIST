package days15;

import days14.Employee;

public class Ex01 {

	public static void main(String[] args) {
		
		
		Employee emp3 = new SalesMan("김준석","경기도 남양주","010-2345-8765","2021/03/12",100,30, 15 ); //자동형변환 업캐스팅
		emp3.dispEmpInfo(); //임플로이의 디스플레이가 아닌 실제 객체 emp3의 디스플레이로 감  (중요)(암기)
		
		
		Employee emp4 = new Temp("김재민","서울 목동","010-2953-5886","2020/1/5",20, 10);
		emp4.dispEmpInfo();
	
		
		//껍데기 오버라이드 만든 후
		
		System.out.println(emp3.getPay());
		System.out.println(emp4.getPay());
		//와 이제 된다
	
	}//main

}//class
