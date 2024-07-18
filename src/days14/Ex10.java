package days14;

//static import 문..
//import static java.lang.Math.random;
import static java.lang.Math.*;



/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 3:13:09
 * @subject		패키지
 * @content		서로 관련있는 클래스, 인터페이스들의 묶음.. (클래스의 효율적인 관리)
 *						예) java.io , java.net 패키지 .. 다들 관련있는 것들끼리 묶여있다
 *							java.util 패키지도 마찬가지 
 *
 *						패키지명 + 동일한 이름의 클래스
 *						패키지명을 충돌을 막기 위해서 도메인 이름을 패키지 이름으로 사용하면 된다.
 *						com.naver.프로젝트명
 *
 *						패키지명 = 물리적으로는 디렉토리(폴더) 생성
 *						java.io 패키지명		java 폴더
 *														ㄴ io폴더 생성
 *
 *						java파일의 첫 문장에 package 패키지명;
 *						패키지명은 소문자로 작명한다.
 *						다른 패키지의 클래스를 사용할 때는 import문을 사용해서 클래스가 포함된 패키지명을 적어준다.
 *						
 *						full name을 적으시오 ? 패키지명~~.클래스명 까지 적으면 된다.
 *
 *						import문이 없는 경우에는 CTRL SHIFT O를 누르면 자동으로 필요한 것들 생성/삭제 해줌
 *
 *						import.java.io.*;			패키지 안에 모든 클래스를 임포트한다는 뜻.
 *
 *						예 ) 				com.sist
 *												  ㄴStudent.class
 *											com.sist.class5
 *														ㄴMember.class
 *
 *											import com.sist.*하면 ======> Member은 적용안됨 (= 하위 디렉토리까진 ㄴㄴ)
 *
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		
	 // 스태틱 임포트해서 Math. 안써도 쌉가능
		System.out.println(random());
		System.out.println(PI);
		
	}//main

}//class
