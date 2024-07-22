package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오전 9:33:55
 * @subject 예외처리 해보기
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);

		
		try {//try 안에는 예외가 발생할 수 있을 것 같은 코드 넣자
			System.out.println("두 정수 a, b의 값을 입력 ? "); //얘는 가독성을 위해 넣음
			a = sc.nextInt();
			b = sc.nextInt();
			double c = a/b;
			System.out.printf("%d / %d = %.2f\n",a,b,c);
		} catch (ArithmeticException | InputMismatchException e) {//멀티 캐치 | 를 사용 .(연산자 아님)
			System.out.println(e.toString());
		} catch (Exception e) {//모든 예외에 대한 캣치문, 여기서도 자식을 위에 둬서 꼼꼼히 체크되게 한다
			e.printStackTrace();
		} finally { //예외 발생하든 안하든 반드시 들어갈 작업
			System.out.println();
		}

		System.out.println("end");




		//예외처리전)) 1 a 입력시 예외: 인풋 미스매치가 b =sc.nextInt 라인에 뜸.





	}//main

}//class
