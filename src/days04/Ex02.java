package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 10:28:03
 * @subject 반올림
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		float pi = 3.141592f;
		//소수점 4번째 자리에서 반올림?
		System.out.printf("%.3f\n", pi); //이건 단순출력
		
		//방법2
		String strPi = String.format("%.3f",pi);//반올림된걸 스트링으로 반환
		double dPi = Double.parseDouble(strPi);//스트링을 더블로 반환
		System.out.println(dPi);
		
		//방법3
		int iPi = (int) (pi *1000 +0.5); //이렇게 4번째 자리에서 반올림 할수도 있구나
		System.out.println((double) iPi/1000); //다시 1000나눠서 되돌리고 double로 변환해서 소수점 살림
		
	}
}
