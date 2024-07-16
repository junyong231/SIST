package days03;


/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 3:44:44
 * @subject 비교연산자
 * @content 크다 작다 같거나크다 같거나작다 같다 다르다
 * 					**결과는 불리언(t/f)
 */

public class Ex05_03 {

	public static void main(String[] args) {
		int i = 10, j =3;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i >= j);
		System.out.println(i == j); // = 하나쓰면 대입되어버리니 주의 (이 경우 결과 3나옴)
		System.out.println(i != j);
		
		//System.out.println(i =! j); 
		//The operator ! is undefined for the argument type(s) int 
		//위 식대로 하려면 j를 부정한 후에 대입하라는건데 int를 부정할 수는 없으니 에러
		
		

	}

}
