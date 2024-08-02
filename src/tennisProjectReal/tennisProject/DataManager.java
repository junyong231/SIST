package tennisProject;

public class DataManager {

	private static DataManager instance = new DataManager();

	private int totalSetNumber = 0;
	private String[] players = new String[2];

	private int[] point = {0, 0};
	private int[] gameScore = {0, 0};
	private int[] setScore = {0, 0};

	private boolean isStop = false;
	private boolean isTieBreak = false;
	private boolean nowTieBreak = false;

	private DataManager() { }

	public static DataManager getInstance() {
		if (instance == null)
			instance = new DataManager();
		return instance;
	}

	public void pointWinner(int teamNumber) {

		this.point[teamNumber]++; 
		// Point score 로직
		if (point[teamNumber]>=3 && !nowTieBreak) {

			if (point[0] == point[1]) {
				point[0] =3;
				point[1] =3;
				System.out.println("\t\t듀스 발생");
			}

			if(Math.abs(point[0] - point[1]) >= 2 && point[teamNumber] == 4) {//한 놈 40A오고 2점 차이나면
				
				gameScore[teamNumber]++; //게임 이긴거임 
				point = new int[]{0, 0};
				
			}else if (point[teamNumber]==5) { //40A의 다음에 도달하는 경우: 40:40 -> 40A:40 -> 40AA(승):40 밖에 없으니 듀스일 때 승리조건
				
				System.out.println("\t\t연속 득점 승리!");//듀스에서 연속 득점하여 승리
				gameScore[teamNumber]++;
				point = new int[]{0, 0};
				
			}
		}

		// Game score 로직
		if (isTieBreak && gameScore[teamNumber] == 6 && (gameScore[0] == gameScore[1])) { //타이 옵션on,둘이 게임6점으로 동점일때
			
			nowTieBreak = true;// 타이브레이크 전용 디스플레이 전환 + 일반적인 포인트 계산방법(15,30..) 사용X
			tieBreakGame(teamNumber);

		}else if(gameScore[teamNumber] >= 6) {

			if (Math.abs(gameScore[0] - gameScore[1]) < 2) {
			}
			else{
				setScore[teamNumber]++;
				gameScore = new int[]{0, 0};
				////승리
			}
		}
		
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
		
		if (point[teamNumber]>=6 && point[0]==point[1] ) {
			System.out.println("\t타이 포인트 듀스");
		}
		
		if (point[teamNumber]>=7 &&Math.abs(point[0]-point[1]) >=2 ) {//타이포인트 듀스던 아니던 모두 적용 - 2점차이 나고 7점 이상이면 이김
				setScore[teamNumber]++; 
				point = new int[]{0, 0}; //다시 일반 포인트 계산법으로 돌아가야하니 그 전에 초기화
				gameScore = new int[]{0, 0}; // 세트 결정났으니 게임도 초기화
				System.out.println("타이브레이크 승리!!");
				nowTieBreak = false;//일반 게임 방식으로 돌아가기 위함
			}

	}

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
