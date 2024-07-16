package days08;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오전 7:04:32
 * @subject  [로또6/45 게임]
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {

		int [] lotto = new int[6];

		fillLotto(lotto);
		dispLotto(lotto);

	} // main

	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int)(Math.random()*45)+1;
		System.out.println( lotto[0] );
		// [23][12][0][0][0][0]
		//          ↑
		//          23
		int index = 1;
		while(index <= 5) {
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.println( lottoNumber );
			if( !isDuplicate(lotto, lottoNumber, index) )
				lotto[index++] = lottoNumber;
		} // while

	}

	private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {//중복인지 체크하는 메소드
		for (int i = 0; i < index; i++) {
			if(lotto[i] == lottoNumber) {//i번 방(인덱스 기준 아래애들)이랑 중복인지 비교하는거 ex01이랑 똑같네
				return true;//중복이면 트루
			}
		}
		return false;//아니먄 폴스 반환 -> 방배정 후 인덱스 ++
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

} // class
