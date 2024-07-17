package days13;

public class Time {

	//field
	public int hour;
	protected int minute;
	int second; //default : package
	private long millisecond; // 1000ms =1s


	//method
	public void privateTest() {
		millisecond = 1822; //같은 클래스이므로 private인 밀리세컨 접근 가능
		System.out.println(millisecond);
	}
	
	private void test() {
		
	}
	
	void pack() {
	
	}
}
