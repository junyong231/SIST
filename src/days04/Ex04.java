package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 10:46:34
 * @subject 쉬프트 연산자
 * @content 비트값을 이동시킨다 (쓸 일 없을듯)
 */
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));
		// 00000000 00000000 00000000 00001010
		System.out.println(10 >> 2); //원래부호비트 유지
		// 00000000 00000000 00000000 000010 두 칸 이동
		System.out.println(14 >>> 2); //부호비트 0으로 (양수)
		// 00000000 00000000 00000000 00001110
	}

}
