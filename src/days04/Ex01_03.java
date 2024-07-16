package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 11:41:24
 * @subject buffered 사용해서 배열로 받기
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name ;
		byte age;
		char grade;

		// "홍길동,23,A"
		System.out.println("이름 나이 등급 입력하시오");
		String data =br.readLine(); // "홍길동,23,A"
		// ,를 기준으로 자를 수 있다면? 그 다음은 name 등에 넣기만하면 됨
		
		/* 1.
		String regex = ",";
		String [] datas = data.split(regex); //datas String인 이유는 split()의 리턴값이 문자열이기 때문이다
		//토글로 중단점 잡고 여기까지 디버깅해보자
		name = datas[0];
		age = Byte.parseByte(datas[1]);
		grade = datas[2].charAt(0);
		*/ //trim()으로 공백 거르고 받을수도
		
		String regex = "\\s*,\\s*";
		String [] datas = data.split(regex); //datas String인 이유는 split()의 리턴값이 문자열이기 때문이다
		//토글로 중단점 잡고 여기까지 디버깅해보자
		name = datas[0];
		age = Byte.parseByte(datas[1]);
		grade = datas[2].charAt(0);
		
		System.out.printf("이름: %s , 나이 %d, 성적 \'%c'",name,age,grade);
	}

}
