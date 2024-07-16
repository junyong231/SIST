package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오후 5:07:48
 * @subject
 * @content
 */
public class NewTest05 {

	public static void main(String[] args) {
		
//		4. Math.random() 메서드를 사용해서 
//		   1) 임의의 국어점수(0~100)을 발생하는 코딩하기
//		   2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
//		4-2. 가위,바위, 보 게임을 구현하기
//		   (조건, USER(사용자)의 선택을 입력할 때 1,2,3 이 아닌 값을 입력하면 유효성 검사를 해서 다시 입력받기)
		
		//1) 국어 점수 생성하기
		int kor = 0;
		kor = (int)(100*Math.random());
		System.out.println(kor+"점");

		//2)로또번호 생성하기(6+1)
		int [] lotto = new int [6];
		int bonus;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(45*Math.random()+1);
		}
		bonus = (int)(45*Math.random()+1);
		System.out.printf("로또 당첨 번호는 %d %d %d %d %d %d 그리고 보너스번호 %d 입니다\n",
				lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5],bonus);
		
		
		//3 가위바위보 (입력값1,2,3아니면 다시 입력받기)
		Scanner sc = new Scanner(System.in);
		int user;
		int com;
		boolean yuhyo = false;
		do {
			if (yuhyo) {
				System.out.println("정상적인 값을 입력하세요");
			}
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 숫자로 입력하세요");
			user = sc.nextInt();
			yuhyo = true; //정상입력 했다면 while문이 안도니까 if(yuhyo)로 안가게 됨
			
		} while (user < 1 || user >3);//잘못된 값이라면 다시 반복시킴
		com = (int) (3*Math.random()+1);
		
		String result = null ;
		switch (user-com) {
		case 0: result = "무승부";
			break;
		case 1: case -2 :result = "승리";
			break;
		case -1: case 2 : result ="패배";
			break;
		}
		String _user = "";
		if (user==1) _user = "가위";
		else if(user==2) _user ="바위";
		else if(user==3) _user ="보";
		
		String _com = "";
		if (com==1) _com = "가위";
		else if(com==2) _com ="바위";
		else if(com==3) _com ="보";
		System.out.printf("사용자 : %s\n컴퓨터 : %s\n결과는 [%s]입니다",_user,_com,result);
	

	}//main

}//class
