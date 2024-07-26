package days20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오전 9:01:11
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
//		2. 로또 게임 횟수를 입력받아서 게임 횟수 만큼 로또 번호를 출력하는 전체 코딩을 하세요.
//		  ( 조건 : 컬렉션 클래스 선택 후 사용 )
//		  ( 조건 : 각 로또번호가 오름차순 정렬 후 출력 )
//		    
//		[출력형식]  
//		1게임 : [09][14][18][27][34][36]
//		2게임 : [12][18][29][36][39][42]
//		3게임 : [09][14][20][24][27][35]
//		4게임 : [06][24][29][32][39][42]
//		5게임 : [02][11][23][42][44][45]  
		Scanner sc = new Scanner(System.in);
		//HashSet lotto = new HashSet();
		
		System.out.println("몇 게임?");
		int game = sc.nextInt();
		
		
		for (int i = 1,line=1; i <= game; i++) {
			HashSet lottogame = new HashSet();
			fillLott(lottogame);
			ArrayList ls = new ArrayList(lottogame);
			Collections.sort(ls);
			System.out.printf("%d게임: ",line);
			dispLott(ls);
			line++;
		}

		
	}//main
	
	
	
	
	

	
	
	private static void dispLott(ArrayList ls) {
		
		
		
		Iterator irr = ls.iterator();
		while (irr.hasNext()) {
			System.out.printf("[%02d]",irr.next());
		}
		System.out.println();
	}


	private static void fillLott(HashSet lottogame) {
		 while (lottogame.size() < 6) {
	            int n = (int) (45 * Math.random() + 1);
	            lottogame.add(n);
	        }
		 
	}

}//class
