package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 10:41:36
 * @subject 대-소문자 변환
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		//'A' = 65  'a' = 97
		char lowerCase = 'x' , upperCase;
		//대소문자는 코드값 32차이남
		upperCase = (char) (lowerCase -32);
		//Type mismatch: cannot convert from int to char - (char)로 강제변환해주지 않으면 우항이 숫자임
		
		System.out.println(upperCase);
	}
}
