package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 2:22:46
 * @subject	제어문
 * @content	1) 조건문: if 문
 * 					2) 분기문 : switch 문
 * 					3) 반복문 : for문, 	foreach문
 * 					4) 조건반복문 : while문, do~while(최소 최초 한번은 그냥 실행)문
 * 					5) 기타 : break문, continue(for,while,do~while에서만 사용-뒤에 코딩 안하고 반복조건문으로)문				
 */
public class Ex07 {

	public static void main(String[] args) {
		
		int n = 110;
		if (n%2 == 0) {
			System.out.println("짝수");
		} //if
		if (n%2 != 0) { //n%2 == 1도 오키
			System.out.println("홀수");
		} //if

	}

}
