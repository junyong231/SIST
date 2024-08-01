package tennisProject;

/**
 * @author wch
 *
 */
public class DataManager {

	private static DataManager instance = new DataManager();

	private int totalSetNumber = 0;
	private String[] players = new String[2];

	private int[] point = {0, 0};
	private int[] gameScore = {0, 0};
	private int[] setScore = {0, 0};

	private boolean isStop = false;
	private boolean isTieBreak = true; //환경설정으로 타이브레이크 설정했는가
	private boolean nowTieBreak = false;//지금 타이브레이크 중인가

	private DataManager() { }

	public static DataManager getInstance() {
		if (instance == null)
			instance = new DataManager();
		return instance;
	}

	public void pointWinner(int teamNumber) {
		point[teamNumber]++;

		
		
		// Point score 로직
		if (point[teamNumber]>=3 && !nowTieBreak) { // 한명 40점 도달 +타이브레이크 아닐 때만 (평상 게임)

			if (point[0]==point[1]) {// 듀스 (둘 다 40)
				point[0] =3; //40A에서 돌아왔을 경우가 있으니 둘 다 40으로 초기화 시켜줌
				point[1] =3;
				System.out.println("\t\t듀스 발생");
			}

			if(Math.abs(point[0]-point[1]) >=2 && point[teamNumber]==4) { //2스코어 차이가 나고 + 점수를 딴 사람이 40A에 도달 (듀스 없이 승리)
				gameScore[teamNumber]++; 
				point = new int[]{0, 0};
			}else if (point[teamNumber]==5) {// 40A에서 또 득점한 경우는 무조건 승리한다 (듀스 상황 승리)
				System.out.println("\t\t연속 득점 승리!");
				gameScore[teamNumber]++;
				point = new int[]{0, 0};
			}
		}

		//타이브레이크
		if (isTieBreak && gameScore[teamNumber]==6 && (gameScore[0]==gameScore[1])) {
			nowTieBreak = true;
			tieBreakGame(teamNumber);
			
		}else if(gameScore[teamNumber]>=6) {
			
			if (Math.abs(gameScore[0] - gameScore[1]) < 2) {
			}
			else{
				setScore[teamNumber]++;
				gameScore = new int[]{0, 0};
				////승리
			}
		}
		
		
		// Game score 로직
		
		
		// 승리팀 결정
		if (setScore[teamNumber] > totalSetNumber / 2) {
			System.out.println("*".repeat(50));
			System.out.printf("\t\t%s 승리\n", players[teamNumber]); 
			System.out.println("*".repeat(50));
			setScore = new int[]{0, 0};
			isStop = true;
		}
	}

	private void tieBreakGame(int teamNumber) {

		System.out.println("\t타이 진행중");
			
			if (point[teamNumber]==7) { //듀스던 아니던간에 7점따면 승리 // 0 15 30 40 40A 0 1 2 3 4 5 6 7
				setScore[teamNumber]++; 
				point = new int[]{0, 0};
				gameScore = new int[]{0, 0};
				System.out.println("타이브레이크 승리!!");
				nowTieBreak = false;
			}

	}//tiegame

	public void reset() {
		totalSetNumber = 0;
		setScore = new int[]{0, 0};
		gameScore = new int[]{0, 0};
		point = new int[]{0, 0};
		isStop = false;
	}

	public void setTotalSetNumber(int totalSetNumber) {
		this.totalSetNumber = totalSetNumber;
	}
	public void setTieBreak(boolean isTieBreak) {
		this.isTieBreak = isTieBreak;
	}
	public void setPlayers(String[] players) {
		this.players = players;
	}
	public String[] getPlayers() {
		return players;
	}
	public int[] getGameScore() {
		return gameScore;
	}
	public int[] getSetScore() {
		return setScore;
	}
	public int[] getPoint() {
		return point;
	}
	public boolean isStop() {
		return isStop;
	}
	public boolean nowTieBreak() {
		return nowTieBreak;
	}
}
