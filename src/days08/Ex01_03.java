package days08;

import java.util.Random;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오전 11:16:35
 * @subject
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {
		new Random()
		   .ints(1, 46)  // 1~45 정수
		   .distinct()   // 중복 제거
		   .limit(6)     // 6개
		   .forEach(System.out::println); // 메서드 참조
		   // .forEach( lotto -> System.out.println(lotto) )
	}

}
