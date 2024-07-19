package days15;

import days14.Employee;
import days14.Regular;

/**
 * @author love
 * @date 2024. 7. 19. - 오전 11:25:13
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [다형성(polymorphism)]
		 * - 여러가지 형태를 가질 수 있는 능력 (다양한 성질)
		 * - E e1 = new R();
		 * - E e1 = new S();
		 * - E e1 = new T(); // 상속. . . 부모객체의 성질?
		 *  한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있는 것.
		 *    
		 * 
		 * */


//		      Regular emp1 = new Regular("최사랑","서울 양천구","010-1234-1234","2022-02-02",5000000);
//		      SalesMan emp2 = new SalesMan("김사랑","서울 양천구","010-1234-1234","2022.02.02",5000000, 20, 80000);
//		      Temp emp3 = new Temp("회사랑","서울 양천구","010-1234-1234","2022.02.02", 20, 80000);
//		      System.out.println(emp1.getPay());
//		      System.out.println(emp2.getPay());
//		      System.out.println(emp3.getPay());


//		      Employee [] emps = new Employee[3];
//		      emps[0] = new Regular("최사랑","서울 양천구","010-1234-1234","2022-02-02",5000000);
//		      emps[1] = new SalesMan("김사랑","서울 양천구","010-1234-1234","2022.02.02",5000000, 20, 80000);
//		      emps[2] = new Temp("회사랑","서울 양천구","010-1234-1234","2022.02.02", 20, 80000);


		// 클래스 배열 초기화
		Employee [] emps = {
				new Regular("최사랑","서울 양천구","010-1234-1234","2022-02-02",5000000),
				new SalesMan("김사랑","서울 양천구","010-1234-1234","2022.02.02",4000000, 20, 80000),
				new Temp("회사랑","서울 양천구","010-1234-1234","2022.02.02", 20, 80000)
		};

		for (int i = 0; i < emps.length; i++) {
			//System.out.println(emps[0].getPay());
			printEmpPay(emps[i]);
		}

	}//main																											
																															
	//                           매개변수 다형성
	public static void printEmpPay (Employee emp) {
		// Employee emp = R/S/T instanceof연산자 파악  ->  다운캐스팅 처리
		String type = null;
		if ( emp instanceof Temp) {//emp가 Temp 맞는지 물어봄
			type = "임시직 사원";
			Temp t = (Temp)emp;
		}else if (emp instanceof SalesMan) {
			type = "영업직 사원";
			SalesMan s = (SalesMan)emp;
		}else if (emp instanceof Regular) {//얘가 부모 (자식까지 포함해버림)라서 얘가 자식보단 아래에 있어야 정확한 비교 가능함 (주의사항)
			type = "정규직 사원";
			Regular r = (Regular)emp;
		}
		System.out.println( type );
	}

}//class