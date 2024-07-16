package days08;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오후 5:17:20
 * @subject
 * @content
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {

		int [] m = {10, 20}; // 참조타입
		System.out.printf("> 1. main  x=%d, y=%d\n", m[0], m[1]);

		swap( m );  // 3. Call By Reference
		System.out.printf("> 2. main  x=%d, y=%d\n", m[0], m[1]);


	} // main

	private static void swap(int [] m) {
		System.out.printf("> 1. swap  x=%d, y=%d\n", m[0], m[1]);
		int temp =   m[0];
		m[0] = m[1];
		m[1] = temp;
		System.out.printf("> 2. swap  x=%d, y=%d\n", m[0], m[1]);
	}
	
	// 콜바이 밸류는 함수의 변수와 파라미터의 변수가 서로 전혀 다른 존재라고 봐야하고 (그냥 복사한 값)
	// 콜바이 레퍼런스는 참조형인 변수(배열)는 함수에서도 메인에 있는 값을 조정 가능 (서로 같은 변수)

} // class






