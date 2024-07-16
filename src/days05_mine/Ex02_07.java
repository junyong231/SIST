package days05_mine;

import java.util.Random;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 2:51:24
 * @subject  컴퓨터 - 사용자(USER)
 * @content  [ 가위(1), 바위(2), 보(3) 게임 ]
 *           컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 *           사용자는 1~3  입력.
 *           
 *           0점~ 100점 랜덤하게 발생시켜라
 *           1~45까지의 로또번호 발생시켜라
 */
public class Ex02_07 {

	public static void main(String[] args) {
		/* Math.random() 은 양수인 double 반환하고 값은 0.0 <= double < 1.0사이임 
		 * 0.0 <=  Math.random() < 1.0
		 * 각 항 3곱함
		 * 0.0 <=  < 3.0
		 * 강제 형변환 정수처리 (필요한게 정수니까)
		 * 0 <= < 3
		 * 각 항 +1 (끝) 
		 */
		
		
		
		int user,com;
		Scanner sc = new Scanner(System.in);
		String tsu = "가위,바위,보";
		String [] tsu2 = tsu.split(",");
		System.out.println("가위(1), 바위(2), 보(3)  ? ");
		user = sc.nextInt();
		com = (int)(3*Math.random()+1); 
		System.out.printf("사용자 : %s\n컴퓨터 : %s\n",tsu2[user-1],tsu2[com-1]);
		
		
		
		
		int result = user - com;
		
		if (result==1 || result == -2) {
			System.out.println("휴먼 승리");
		} else if (result==2 || result == -1) {
			System.out.println("컴 승리");
		} else if ( result ==0) {
			System.out.println("무승부");
		}
		
		
		
		
	}//main

}//class
