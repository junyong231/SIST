package days02;

/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 12:24:50
 * @subject 자바 표준 출력 함수
 * @content println(), printf()
 */
public class Ex03 {

	public static void main(String[] args) {
		// println() 메소드 - 출력 (자동으로 개행)
		System.out.println("박준용");
		System.out.println("송세호");
		System.out.println("이시훈");
		
		// print() 메소드 - 출력 (개행문자 없으면 개행 x)
		System.out.print("박준용"  + '\n');
		System.out.print("송세호" + '\r');
		System.out.print("송세호\r"); //같다
		System.out.print("이시훈");
		System.out.println(); // 개행 용도
		System.out.print("이시훈");
		
		//차이점: 개행 여부 == CR(캐리지 리턴 == \r ) +  LF(라인피드 == \n)  :윈도우 기준
		//                             : 커서 앞으로 땡기고            아래로 줄 내림
		
		

		
	}

}
