package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오후 5:07:48
 * @subject
 * @content
 */
public class NewTest04 {

	public static void main(String[] args) {

//				3. ASCII 코드값을 한 라인에 10개씩 출력하면 라인넘버를 붙이고
//				   10라인을 출력하면 계속할거냐고 물어보고 엔터를 치면 다시 10라인씩
//				   출력하는 코딩하기

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 256; i++) {
			if (i%10 == 0) System.out.printf("%d :",i/10+1);
			if (i%10==9) { 
				if (i%100 == 99) {
					System.out.printf("[%c]",i);
					System.out.println("\n다음 10줄 출력하려면 Enter 입력");
					String go = sc.nextLine();
					if (go.equals("")) {
						continue;
					} else {
						break;
					}
				}//10줄 조건 if
				
				System.out.printf("[%c]",i);
				System.out.println();
				continue;
			}//한 줄 조건 if
			System.out.printf("[%c]",i);
		}//전체 for문
		System.out.print("\n끝");



	}

}
