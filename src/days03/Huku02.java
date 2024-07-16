package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Huku02 {

	public static void main(String[] args) throws IOException {
		String name;
		byte age;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력받을 수 있는 객체 br 만듬
		
		System.out.println("이름을 입력하세요");
		name = br.readLine();
		System.out.println("나이를 입력하세요");
		age = Byte.parseByte(br.readLine()) ;
		
		System.out.printf("당신의 이름은 %s, 나이는 %d 이군요",name,age);
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이 ?");
		name = sc.next();
		age = sc.nextByte();
		
		System.out.printf("당신의 이름은 %s , 나이는 %d 이군요",name,age);
		*/
		
		//int 데이터타입의 변수를 2,8,16진수의 스트링으로 변환함
		//int 데이터 타입의 최댓값(21억)을 뜻함
		//int 타입 범위 안의 string을 int로 변환해줌
		
		// %#o하면 8진수, %#x하면 16진수 이렇게 해당하는 진법의 수를 출력해줌 (10진수만 가능 2진에서 8진 불가)
		// %,d 하면 숫자를 3자리마다 쉼표 표시해줌
		
		
		String studentName;
		byte kor;
		byte eng;
		byte math;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 국어, 영어, 수학 점수 입력");
		studentName = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		math = sc.nextByte();
		
		short sum = (short) (kor + eng + math); //얘 위치 여기 아니면 에러나네 초기화 안했다고
		double avg = sum/3;					
		
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균점수: %.2f",
									studentName,kor,eng,math,sum,avg);
		
		
		//자동 타입 변환은 타입의 크기가 변환시키려는 타입보다 크기가 큰 경우 자동으로 타입이 변하는 것을 말함
		//강제 타입 변환은 타입 크기 상관없이 강제로 변환시킬 수 있는 것으로 (short)를 사용하면 int도 short로 변환 가능하다
		
		//삼항연산자는 조건식 ? 표현식1 : 표현식2 의 꼴을 하고 있고
		//조건식이 참일 경우 표현식1, 거짓일 경우 표현식 2를 실행한다.
		
		//논리연산자의 종류는 일반,부정,비트연산자가 있고
		//일반: && || , 부정: ! , 비트: & | ^(XOR) ~(부정)
		//우선순위는 부정연산자 > 비트연산자(& > ^ >|) > 일반연산자(&& > ||)
		
		//두 문자열을 비교할 때 비교연산자 ==은 쓰지 않고
		//대상 string.equals(비교할string) 으로 비교한다 같으면 참이 나온다
		//같지 않은지 비교하는 !string.equals(비교할string)도 있다.
	}

}
