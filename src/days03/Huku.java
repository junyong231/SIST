package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.lang.model.element.ElementVisitor;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 3. - 오후 9:10:14
 * @subject 3일차 복습 테스트 준비
 * @content
 */
public class Huku {

	public static void main(String[] args) throws IOException {
		//1. BufferedReader이용해서 이름 나이 입력 받고 출력
		/*
		String name;
		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(">이름을 입력하세요");
		name = br.readLine();
		
		System.out.println(">나이를 입력하세요");
		age = Byte.parseByte(br.readLine());
		
		System.out.printf("당신의 이름은 %s이고, 나이는 %d 살이로군요!",name, age);
		*/
		//작성 연습BufferedReader br = new BufferedReader(new InputStramReader(System.in));
		
		
		
		//2. Scanner를 사용해서 이름, 나이 입력 받고 출력
		/*
		String name2;
		byte age2;
		
		System.out.println(">이름, 나이 ?");
		Scanner sc = new Scanner(System.in);
		System.out.println(1);
		// 이름 나이? 밑에 바로 나오는 이유: sc는 입력을 지금부터 받겠다는게 아님.
		//											인스턴스를 생성한 것 뿐!!
		
		//Scanner 클래스의 객체(인스턴스)인 sc는 
		//Scanner의 화신이 된 느낌임. Scanner의 권능 사용가능 next()도 권능임 (메소드)
	
		
		name2 = sc.next(); //sc는 입력받고, next()는 스트링으로 반환하고 (다음 토큰 한해서)
		age2 = sc.nextByte();//sc는 입력받고, nextByte()는 byte로 반환하고(다음 토큰 한해서)
		
		System.out.printf("당신의 이름은 %s이고, 나이는 %d 살이로군요!",name2, age2);
		*/
		
		
		//3.	
		//byte i = 10; int 타입보다 작은 타입이라서 자동형변환됨
		int i = 10;
		
		System.out.println("\n"+Integer.toBinaryString(i)); 
		//매개변수 안 int 값을 2진수로 변환해서 String으로 반환한다
		//		Integer.toOctalString() // 정수를 8진수로 변환해 문자열 반환
		//		Integer.toHexString() // 16진수
		int z =Integer.MAX_VALUE; //int의 최대값(21억)으로 설정
		System.out.println(z);
		String parse = "1349";
		int x = Integer.parseInt(parse); //매개변수가 숫자로 이뤄진 string이면 int로 변환시킴
		System.out.println(x+i); // 134910이 아니라 1359가 나오므로 int형 전환됨
		//설명하라
		
		//4. 이름,국어,영어,수학을 입력 받아서 총점,평균 계산 후 출력하는 코딩
		Scanner sc2 = new Scanner(System.in);
		System.out.println(">이름 국어 영어 수학 ?(한 칸씩 띄울것)");
		String name3 = sc2.next();
		byte kor = sc2.nextByte();
		byte eng = sc2.nextByte();
		byte math = sc2.nextByte();
		short sum = (short) (kor + eng + math);
		double avg = sum/3;
		System.out.printf("이름은 \"%s\" 국어 점수 %d, 영어 점수 %d, 수학 점수 %d, 총점은 %d, 평균은 %.2f점입니다.",
									name3,kor,eng,math,sum,avg);
	
		
		//5.자동 형변환과 강제 형변환에 대해서 설명하시오
		// 타입의 크기가 큰 쪽에서 작은 쪽으로 갈 때에는 자동으로 형변환이 되고
		// 그 반대는 작은 쪽으로 강제형변환을 하여야한다. int->short의 경우 (short) int변수 처럼
		
		
		//6.삼항연산자에 대해서 설명하시오
		//	삼항연산자는 조건식이다. 조건식 ? 식1 : 식2 처럼 사용하고
		//	조건식이 참일 경우에 식1, 거짓일 경우 식2를 실행한다
		
		//6.논리연산자의 종류와 우선 순위에 대해서 설명하시오
		//	논리연산자의 종류는 일반,부정,비트 논리연산자가 있고
		// 일반에는 &&(AND 둘 다 참일 때만 참) ||(OR 둘 다 거짓일 때만 거짓)
		// 부정 연산자 !는 참 거짓의 결과를 뒤집는다
		// 비트 연산자에는 & | ^(XOR서로 다를 때만 1) ~(부정)가 있다
		//우선순위는 부정 > 비트 > 일반이다
		
		
		//7.두 문자열을 비교하는 방법을 설명하시오
		// 비교연산자 ==를 사용하지 않는다
		// string.equals(string2) :string과 string2가 같은지 비교
		// !string.equals(string2) ::string과 string2가 같지 않은지 비교

	}

}
