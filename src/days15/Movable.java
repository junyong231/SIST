package days15;

interface Movable {
	//	[↓안붙여도 자동 생성]	
	public abstract void move(int x, int y); //public abstract 생략해도됨 
	int COLOR =1; //public static final 생략
}


//[모든 유닛 공통이라 abstract 씀]
//   ↓
abstract class Unit{
	int currentHP; // 현재 유닛의 체력
	int x ; //유닛 x좌표 
	int y ; //유닛 y좌표
}

interface Attackable{
	void attack(Unit unit);
}

//인터페이스끼리 다중상속이 가능함. 
interface Fightable extends Movable, Attackable{

}
//공중유닛
class AirUnit extends Unit {

}
//지상유닛
class GroundUnit extends Unit{ 

}
//드랍쉽
class DropShip extends AirUnit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub

	}

}

//군인
//class Fighter implements Movable, Attackable {

class Fighter extends GroundUnit implements Fightable {

	@Override
	public void move(int x, int y) {
		//		걷기, 뛰기, 

	}

	@Override
	public void attack(Unit unit) {
		//총, 칼

	}

}


class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void move(int x, int y) {
		//탱크 이동

	}

	@Override
	public void attack(Unit unit) {
		//포 공격

	}

}

interface Repairable{}


//공격 수리 건축 수리(탱크,scv) 수리 불가: human
class SCV implements  Fightable, Repairable{
	@Override
	public void move(int x, int y) {
		

	}

	@Override
	public void attack(Unit unit) {
		

	}


	void repair(Repairable unit) {

		if (unit instanceof Tank) {
			//탱크 수리 코딩
		}else if (unit instanceof SCV) {
			//scv수리 코딩
		}

	}
}
//해상
class Marine extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}

