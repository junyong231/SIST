package days09;

/**
 * @author JUNYONG
 * @Date 2024. 7. 11.
 * @subject 10진수 16진수 만들기
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//125 == 0x7d
		
		int n = 125;
		int share, reminder;
		String hex = "";
//		String [] hexa = {"A","B","C","D","E",};
		
		while (n != 0) {
			share = n/16;
			reminder = n%16;
			//System.out.printf("%d",reminder);
			switch (reminder) {
			case 10: 
				hex = 'A' + hex;
				break;
			case 11: 
				hex = 'B' + hex;
				break;
			case 12: 
				hex = 'C' + hex;
				break;
			case 13: 
				hex = 'D' + hex;
				break;
			case 14: 
				hex = 'E' + hex;
				break;
			case 15: 
				hex = 'F' + hex;
				break;

			default:hex = reminder + hex;
				break;
			}
			n=share;			
		}
		hex = "0x"+hex;
		System.out.println(hex);
	}//main

}//class
