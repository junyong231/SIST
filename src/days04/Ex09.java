package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 3:29:25
 * @subject break문 (만나면 탈출)
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			if (i == 6) break; //if문은 실행문이 한줄이면 걍 {}도 필요없고 옆에 써도 됨
			System.out.printf("%d+",i);
			i++;
		}
		
	}

}
