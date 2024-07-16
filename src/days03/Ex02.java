package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; //인풋스트림 받아온 곳(망치-관리실에서 빌린 비유)
//System은 이런거 안해도 되는 이유: java.lang인데 얘네는 자동으로 됨

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오전 10:51:24
 * @subject [S]canner (클래스 == 물건 객체)
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		//이름을 표준입력장치(키보드)로 부터 입력받아서 출력
		//키보드 -> System.in(키보드로 입력 받는 역할-바이트로) -> 문자변환(InputSt,,의 역할) 
		// -> 문자열 변환(BufferedReader의 역할)
		
		BufferedReader br =	new BufferedReader(new InputStreamReader( System.in));
		
		System.out.print("이름: ");
		
		String name = br.readLine(); //readLine() 한 라인 전체 읽어온다
		// 1.기능(라인읽기) 2. 매개변수(없음) 3.리턴값(String임 컨+스페 할때 확인가능)
		//String name = br.readLine(); 하니 에러뜸: Unhandled exception type IOException
		//에러나니 클릭하고 throws ,,클릭해서 퀵해결 - 메인에 뭐하나 붙고 임포트도 하나 생김
		// 단축기 CTRL + SHIFT + O 하면 빨간 밑줄애들한테 필요한 임포트 구문 다 추가됨

		System.out.println("당신의 이름은 "+ name );
	}

}
 