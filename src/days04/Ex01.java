package days04;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 9:01:24
 * @subject 복습테스트
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 	3 + 5 + 0			8
		 * 	3 + 5 + "0"		"80" 
		 * 	3 + 5 + '0' 		아 문자를 정수 계열 형에 넣어놨던 이유!! (문자표) 8+48이 되어 56
		 */

		String name;
		char grade;  //char써야됨 
		byte age;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 등급을 입력하세요 ? ");
		name = sc.next();
		age = sc.nextByte();
		grade = sc.next().charAt(0);    
		//String =? char는 사실 논리적으로 말이 안됨 (여러글자 => 한글자)
		//A : 식별자	"A" : 'A' + '\0'	'A' 문자
		//그래서 인덱스에 맞는 문자를 문자열에서 추출해주는 .charAt()을 사용한다
		System.out.printf("이름 = \"%s\", 나이 = %d살, 등급 = \'%c\'",name,age,grade);
		// 캐스트연산자 (short) 같은건 같은 숫자타입끼리만 됨  String => short 안됨.. + 클래스 간의 형변환도 가능

		//byte,short,int,long,float,double + "" 붙이면 그냥 스트링 되잖아!!!!!!!!!!!!!!!
		
	}

}
