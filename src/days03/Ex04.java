package days03;

import java.util.Scanner; //컨트롤 쉬프트 O 로 자동 임포트 시킴

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 3:06:05
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//공식문서에서 가져온 예제 (스캐너 검색해서 들어감)
		//컨트롤 A 눌러 전체 선택 후 컨트롤 I하면 다 맞춰짐
		//블럭 단위로 하려면 선택후 tab, shift tab 으로 들여쓰기 내어쓰기 가능
		
		String input = "1   fish2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); 
		//디폴트 구분자는 스페이스(공백)인데 useDelimiter 써서 바꿈
		//         \\s*fish\\s*         [ \s ] 는 스페이스파(소문자s) \\ 두 개 줘야 인식 =\\s가 됨
		//     [ * ] 와도 좋고 안와도 좋다- 0회 이상 반복된다는 뜻      (==스페이스가 와도 좋고 안와도 좋다) 
		
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		
		System.out.println(s.next());
		System.out.println(s.next());
		s.close(); //안닫으면 리소스 손실 - 한 번 닫으면 다시 코드로 열 수는 없음

	}

}
