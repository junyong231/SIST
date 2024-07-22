package days16;

import java.util.StringTokenizer;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 5:25:14
 * @subject StringTokenizer 클래스
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String s ="이시훈, 원충희, 김준석, 송세호";
		//한 명씩 자르려면
		/* 사실 이게 더 낫지만 (정규표현식)
		String regex = "\\s*,\\s*";
		String [] names =s.split(regex);
		for (String name : names) {
			System.out.println(name);
		}
		*/
		s = s.replace(" ",""); //띄어쓰기 삭제
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s, ",");//,로 자르겠다
		
	//	st.hasMoreTokens(); 
	//	st.nextToken();
		
		while (st.hasMoreTokens()) { //토큰있냐
			String name = st.nextToken();//토큰 name에 넣기
			System.out.println(name); 
		}
		
		
		
	}//main

}//class

