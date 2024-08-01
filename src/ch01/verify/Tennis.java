package ch01.verify;

import java.io.IOException;

import lombok.Getter;
import lombok.Setter;

public class Tennis {

	public static void main(String[] args) throws IOException {
		//3세트 3판 2선제
		Team t1 = new Team("가렌");
		Team t2 = new Team("신지드");



		while (true) {//여기에 세트 과반 조건을 걸면 될듯함



			while (t1.getScore()<40 && t2.getScore()<40 ) { //둘 다 40미만이면 계속 게임		
				gameplay();
				if (gameplay()==1) {//t1이 포인트 땄을 때
					t1.setScore(plusScore(t1.getScore()));
					System.out.printf("%s이(가) 득점하였습니다\t\t현재점수\t%2d   :   %2d\n",t1.getName(),t1.getScore(),t2.getScore());

				}else  {//t2가 포인트 땄을 때
					t2.setScore(plusScore(t2.getScore()));
					System.out.printf("%s이(가) 득점하였습니다\t현재점수\t%2d   :   %2d\n",t2.getName(),t1.getScore(),t2.getScore());

				}


				System.out.println("> 엔터치면 진행한다.");
				System.in.read(); 
				System.in.skip( System.in.available() ); // 13,10 제거



			}//작은while(한 쪽 40점 될 때까지)

			//이제 누군가 한쪽만 40점이 탄생했다
			tryWin(t1,t2); //게임 승리 도전


			System.out.println("> 게임 끝났다. 엔터치면 다음 게임 진행한다.");
			System.in.read(); 
			System.in.skip( System.in.available() );
			
			

			
			
			t1.setScore(0);
			t2.setScore(0);
			
			
		}//큰while (게임수 듀스)




	}//main













	private static int plusScore(int teamScore) {
		teamScore += teamScore >=30 ? 10 : 15; //점수가 30점 이상이면 10점 더하고 아니면 15점씩 더함
		if (teamScore>40) teamScore=40;
		return teamScore;
	}



	private static void tryWin(Team t1, Team t2) throws IOException {
		System.out.println("게임 승리의 기회!"); //한 쪽만 40왔으니까 이번에 또 이기면 게임 가져감
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() );
		gameplay();
			if (gameplay()==1&& t1.getScore()==40) { //t1이 40점인데 또이김 => t1이 게임 획득
				t1.setWinGameTime(t1.getWinGameTime()+1); //게임 승리 횟수 +1
				System.out.printf("%s이(가) 이겼다\t이긴 게임 횟수:%d회\n",t1.getName(),t1.getWinGameTime());
				
			}else if(gameplay()==2&& t2.getScore()==40) { //t2 게임 획득
				t2.setWinGameTime(t2.getWinGameTime()+1);
				System.out.printf("%s이(가) 이겼다\t이긴 게임 횟수:%d회\n",t2.getName(),t2.getWinGameTime());
				
			}else { //40점인 쪽의 반대 팀이 이김 
				isDeuce(t1,t2); //듀스 될 수 있는지..
			}

		
	}//메서드


	private static void isDeuce(Team t1, Team t2) throws IOException{
		
		if (t1.getScore()==40) { //t1이 40이고 t2가 그 이하인데 이겨서 이 메서드로 온 상황
			t2.setScore(plusScore(t2.getScore()));
			System.out.printf("%s이(가) 득점하였습니다\t현재점수\t%2d   :   %2d\n",t2.getName(),t1.getScore(),t2.getScore());
			
		} else if (t2.getScore()==40) {//t2가 40이고 t1이 그 이하인데 이겨버려서 여기로 옴
			t1.setScore(plusScore(t1.getScore()));
			System.out.printf("%s이(가) 득점하였습니다\t\t현재점수\t%2d   :   %2d\n",t1.getName(),t1.getScore(),t2.getScore());
		} 
		
		if (t1.getScore() ==t2.getScore()) {//득점해서 듀스됐니?
			System.out.println("듀스..");
			deuceGame(t1, t2);
		}else tryWin(t1,t2); //득점해도 차이나면 보통 승패 가리기로 ㄱ (40:15 같은 상황)
		
	}
		
	private static void deuceGame(Team t1, Team t2) throws IOException {
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() );
		gameplay();
			if (gameplay()==1) {
				t1.setScore(plusScore(t1.getScore()));
				t1.setAdvStatus('A');
				System.out.printf("%s이(가) 득점하였습니다\t\t현재점수\t%C   :   %2d\n",t1.getName(),t1.getAdvStatus(),t2.getScore());
				
			}else  {
				t2.setScore(plusScore(t2.getScore()));
				t2.setAdvStatus('A');
				System.out.printf("%s이(가) 득점하였습니다\t현재점수\t%2d  :   %C\n",t2.getName(), t1.getScore(),t2.getAdvStatus());

			}
			deuceTryWin(t1, t2);
			
		}
		
	



	private static void deuceTryWin(Team t1, Team t2) throws IOException { //둘 다 score 40인 상황..
		System.out.println("듀스 게임 승리의 기회!"); 
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() );
		gameplay();
			if (gameplay()==1&&t1.getAdvStatus()=='A') { //t1이 A상태에서 이김
				t1.setWinGameTime(t1.getWinGameTime()+1); //게임 승리 횟수 +1
				System.out.printf("%s이(가) 이겼다\t 이긴 게임 횟수:%d회\n",t1.getName(),t1.getWinGameTime());
				
			}else if(gameplay()==2&& t2.getAdvStatus()=='A') { //t2 게임 획득
				t2.setWinGameTime(t2.getWinGameTime()+1);
				System.out.printf("%s이(가) 이겼다\t 이긴 게임 횟수:%d회\n",t2.getName(),t2.getWinGameTime());
				
			}else { //A인 쪽의 반대 팀이 이김 
				t1.setAdvStatus('ㅁ');
				t2.setAdvStatus('ㅁ');// 다시 듀스니까 A상태 해제
				isDeuce(t1,t2); 
			}
		
	}



	private static int gameplay() { 
		return (int) ((Math.random()*2)+1); //1아니면 2만 나오게 설정 1이면 t1승 , 2면 t2 승리
	}




}//class

@Getter
@Setter
class Team {

	private String name;
	private int score=0; //포인트
	private int earnPoint = 0; // 포인트 딴 횟수
	private int winGameTime =0; //이긴 게임 수
	private int winSetTime =0; //이긴 세트 수
	private char advStatus =' ';// adv 상태 표시..여기서 한판만 더 이기면 게임 승리
	
	public Team(String name) { //이름 입력해서 만들면 필요할까봐,.
		this.name = name;
	}

}