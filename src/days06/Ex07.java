package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 3:51:25
 * @subject
 * @content 게임 끝나면 다시할지 물어보기
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		int com, user;  
		Scanner scanner = new Scanner(System.in); 
		char con ='y'; //계속할지 'y' 'Y'입력하면 계속
		String regex = "[1-3]"; //정규표현식 : 유저 입력 유효성 검사
		String strUser ;
		do {
			//다시한다고 하면 반복시작되는 부분
			com = (int)(Math.random() * 3) + 1;  //컴퓨터 뭐낼지 선택
			
			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
				strUser = scanner.next();//유저 선택 스트링으로  받음
								
			} while (!strUser.matches(regex));//정규표현식에 안맞다면 반복
			
			user = Integer.parseInt(strUser); //유효성 검사 통과시  user에 인티저로 할당
			
			String [] rps = {"가위","바위","보"}; //숫자를 글자로 보여주려고 선언
			System.out.printf("사용자 : %s \n컴퓨터: %s\n",rps[user-1],rps[com-1]);
			//입력 받은건 1,2,3인데 스트링 배열 인덱스는 0부터니까 -1해줌

			switch (user - com) {
			case 0: 
				System.out.println("무승부");
				break;
			case 1: case -2: 
				System.out.println("사용자 승리");
				break;
			default:  
				System.out.println("컴퓨터 승리");
				break;
			}
			//  계속 여부
			System.out.print("게임 다시할거냐 ?");
			con = (char)System.in.read();//y n
			System.in.skip(System.in.available());//10,13 제거 
			
		} while (con== 'y' ||con== 'Y');
		System.out.println("게임 종료!");
		
		  

	}//main

}
