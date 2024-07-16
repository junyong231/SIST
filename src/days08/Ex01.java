package days08;

/**
 * @author kenik
 * @date 2024. 7. 10. - 오전 7:04:32
 * @subject  [로또6/45 게임]
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		int [] lotto = new int[6]; //int형 빈방 6개 생성

		fillLotto(lotto);
		dispLotto(lotto);

	} // main

	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int)(Math.random()*45)+1; //첫번째 방에 랜덤 정수 하나 생성
		System.out.println( lotto[0] );
		// [23][12][0][0][0][0]
		//          ↑
		//          23
		int index = 1; //인덱스 0번은 채웠으니 1번부터 5번까지 while로 채우는 작전
		boolean isDuplicate = false;
		while(index <= 5) {
			isDuplicate = false;
			lottoNumber = (int)(Math.random()*45)+1;//랜덤번호 생성
			System.out.println( lottoNumber );
			// 중복체크를 한 후에 중복되지 X
			for (int i = 0; i < index; i++) {//중복체쿠
			   if(lotto[i] == lottoNumber) {//i번 방에 있는 애들이랑 방금 만든 로또 넘버 중복 체크-> 겹치면 트루되고 포문탈출
				   isDuplicate = true;				//안겹치면 트루로 바뀌고 포문 나갈때까지 돌리다 나가겠지
				   break;
			   }
			}
			if( !isDuplicate ) lotto[index++] = lottoNumber;//false유지(중복체크 통과)하면 로또 배열에 방 배정 인덱스는++
		} // while

	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

} // class
