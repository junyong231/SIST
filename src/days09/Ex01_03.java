package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		for (int year = 2020; year <= 2025; year++) {
			for (int month = 1; month <= 12; month++) {
				Ex01.printCalendar(year, month);
			}
			System.out.println("X".repeat(50));
		}
		

	}//main

}//class
