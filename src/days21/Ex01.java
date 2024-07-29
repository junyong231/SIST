package days21;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 9:00:41
 * @subject enum 열거형
 * @content
 *
 */
public class Ex01 {

	//enum Direction {EAST , SOUTH, WEST, NORTH}
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;
		
		private int value;
		private String symbol;
			
		
		Direction(int value, String symbol) {
//			this.value;
//			this.symbol;
		}
		
		public int getValue() {
		return this.value;
		}
		
		public String getSymbol() {
			return this.symbol;
			}
	}

	
	/*
	 * 컴파일러가 클래스로 변환시킴
	 *  class Direction extends Enum
	 *  	static final Direction EAST = new Direction()
	 *  
	 *  private String name;
	 *  public String name() {
	 *  	return this.name;
	 *  }
	 *  
	 *  private int ordinal;
	 *  public int ordina() {
	 *  	return this.ordinal;
	 *  }
	 *  
	 *  이렇게..
	 */
	
	public static void main(String[] args) {
//		System.out.println(Direction.EAST);
//		System.out.println(Direction.EAST.toString());
//		System.out.println(Direction.EAST.name());
//		System.out.println(Direction.EAST.ordinal()); //인덱스값

		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println();
		}
		
	}//main

}//class
