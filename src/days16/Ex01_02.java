package days16;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오전 9:33:55
 * @subject 예외처리 해보기
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			try {//try 안에는 예외가 발생할 수 있을 것 같은 코드 넣자
			System.out.println("두 정수 a, b의 값을 입력 ? "); //얘는 가독성을 위해 넣음
			a = sc.nextInt();
			b = sc.nextInt();
			break;
		} catch (Exception e) {//예외처리기가 예외클래스 만들어서 캣치 문에 넘겨줌 ( 다형성- 업캐스팅으로 매개변수에 들어갈 수 있음)
			//예외 발생하면 바로 여기로 옴
			//예외 처리 코딩
			System.out.println("> 입력 값이 잘못됨");
			//a 1 입력했으면 예외지만 어쨌든 a,b에 값은 저장됐으므로 계속 무한루프 돌면서 예외뜸 ==> 스캐너를 비워줘야함
			sc.nextLine();//버퍼 비워줌 (한 줄 읽어들임)
		
			}
		}//while
		
		//if문으로 b==0일 때 안된다고 띄우는 건 예외처리라고 하지 않는다
		
		try {
			double c = a/b;
		System.out.printf("%d / %d = %.2f\n",a,b,c);
		} catch (ArithmeticException e) {// 0으로 나누면 예외.. ArithmeticException만 저격해서 확인
			System.out.println(e.toString()); //에러 내용 찍기
		} catch (Exception e) {//모든 예외에 대한 캣치문, 여기서도 자식을 위에 둬서 꼼꼼히 체크되게 한다
			//
		}
		
		
		System.out.println("end");
		



		//예외처리전)) 1 a 입력시 예외: 인풋 미스매치가 b =sc.nextInt 라인에 뜸.





	}//main

}//class
