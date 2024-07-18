package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 12:28:29
 * @subject 단일상속 ( single inheritance )			다중상속( multi inheritance ) = 자바는 지원하지 않음.
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		
		
		
		
	}//main

}//class

class Tv {
	boolean power;	
}

class VCR { //비디오 카세트 레코드..
	boolean power;
}

//Tv + VCR
//class TVCR extends Tv,VCR{ // 문법오류 => 다중상속 지원x
//	} 

//인터페이스를 사용해서 다중상속을 구현토록 한다.

