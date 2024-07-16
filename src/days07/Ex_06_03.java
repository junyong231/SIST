package days07;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 4:28:19
 * @subject 오버로딩 무한정 할 수는 없으니 배열로 받자
 * @content
 */
public class Ex_06_03 {

	public static void main(String[] args) {
		
		int [] m = {1,2,3,4,5,6,7,8,9,10};
		int result = hap(m);
		System.out.println(result);
	}//main

	public static int hap(int[] m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i]; 
		}
		return result;
	}

}//class
