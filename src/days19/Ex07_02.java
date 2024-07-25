package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 2:12:06
 * @subject Set 활용
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		//로또 한 게임
		
		//중복 알아서 걸러주는 Set
		
		HashSet lotto = new HashSet(); // HashSet 객체 하나가 한 게임을 의미

		
		fillLotto(lotto);
		
		dispLotto(lotto);
		
		
	}//main

	private static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			System.out.printf("[%d]",ir.next());
		}
		System.out.println();
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() <= 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
		
	}

}//class
