package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 7. - 오전 1:36:27
 * @subject
 * @content
 */
public class Test_0707 {

	public static void main(String[] args) {
		/*
		[주말 복습 및 공부]
		1. 한 문자를 입력받아서 
		   한글입니다.
		   알파벳대문자입니다.
		   알파벳소문자입니다.
		   숫자입니다.
		   특수문자입니다.
		   라고 출력하기
		   ( 특수문자는 #$!%@)
		   
		   
		String st;
		boolean right = false;
		char cha;
		Scanner sc = new Scanner(System.in);

		do {
			if (right) {
				System.out.print("문자는 하나만 입력하세요\n다시 ");
			}
			right = true;
			System.out.print("아무 문자나 하나 입력하세요 ?");
			st = sc.next(); //입력값 받음
			cha = st.charAt(0); //입력값을 스트링에서 문자 배열로 전환
		} while (st.length() > 1);
		
		System.out.println(cha);
		
		String its = "";
		
		if ('0'<=cha && '9'>=cha) {
			its ="숫자";
		} else if('A' <= cha && 'Z' >= cha){
			its= "영어 대문자";
		} else if ('a' <= cha && 'z' >= cha) {
			its = "영어 소문자";
		} else if ('ㄱ' <= cha && '힣' >= cha) {
			its = "한글";
		} else if (cha == '!' || cha == '@' || cha =='#' || cha =='$' || cha == '%') {
			its = "특수문자";
		} else its = "인식불가";
		
		System.out.printf("%c은(는) %s입니다",cha,its);
		
		*/
		
		
		/*
		2. String str = "hello world!"
		  문자열을 char[] 로 변환하기
		  char []을 다시 String으로 변환하는 코딩하기
		  
		String str = "hello world!";
		char [] chaArr = new char [str.length()];
		
		//1.
//		chaArr = str.toCharArray();
//		System.out.println(chaArr);
//		String str2 =new String(chaArr);
//		System.out.println(str2);

		//2.
//		chaArr = str.toCharArray();
//		System.out.println(chaArr);
//		String str3 = String.valueOf(chaArr);
//		System.out.println(chaArr);
		
		//3.
		String re ="";
		for (int i = 0; i < chaArr.length; i++) {
			chaArr[i] = str.charAt(i) ; 
		}
		System.out.println(chaArr);
		
		for (int i = 0; i < chaArr.length; i++) {
			re += chaArr[i];
		}
		
		System.out.println(re);
*/

/*
		3. ASCII 코드값을 한 라인에 10개씩 출력하면 라인넘버를 붙이고
		   10라인을 출력하면 계속할거냐고 물어보고 엔터를 치면 다시 10라인씩
		   출력하는 코딩하기
		   
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 256; i++) {
			if (i%10 == 0) System.out.printf("%d :",i/10+1);
			if (i%10==9) { 
				if (i%100 == 99) {
					System.out.printf("[%c]",i);
					System.out.println("\n다음 10줄 출력하려면 Enter 입력");
					String go = sc.nextLine();
					if (go.equals("")) {
						continue;
					} else {
						break;
					}
				}//10줄 조건 if
				
				System.out.printf("[%c]",i);
				System.out.println();
				continue;
			}//한 줄 조건 if
			System.out.printf("[%c]",i);
		}//전체 for문
		System.out.print("\n끝");
*/

/*
		4. Math.random() 메서드를 사용해서 
		   1) 임의의 국어점수(0~100)을 발생하는 코딩하기
		   2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
		4-2. 가위,바위, 보 게임을 구현하기
		   (조건, USER(사용자)의 선택을 입력할 때 1,2,3 이 아닌 값을 입력하면 유효성 검사를 해서 다시 입력받기)
		   
		   //1) 국어 점수 생성하기
		int kor = 0;
		kor = (int)(100*Math.random());
		System.out.println(kor+"점");

		//2)로또번호 생성하기(6+1)
		int [] lotto = new int [6];
		int bonus;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(45*Math.random()+1);
		}
		bonus = (int)(45*Math.random()+1);
		System.out.printf("로또 당첨 번호는 %d %d %d %d %d %d 그리고 보너스번호 %d 입니다\n",
				lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5],bonus);
		
		
		//3 가위바위보 (입력값1,2,3아니면 다시 입력받기)
		Scanner sc = new Scanner(System.in);
		int user;
		int com;
		boolean yuhyo = false;
		do {
			if (yuhyo) {
				System.out.println("정상적인 값을 입력하세요");
			}
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 숫자로 입력하세요");
			user = sc.nextInt();
			yuhyo = true; //정상입력 했다면 while문이 안도니까 if(yuhyo)로 안가게 됨
			
		} while (user < 1 || user >3);//잘못된 값이라면 다시 반복시킴
		com = (int) (3*Math.random()+1);
		
		String result = null ;
		switch (user-com) {
		case 0: result = "무승부";
			break;
		case 1: case -2 :result = "승리";
			break;
		case -1: case 2 : result ="패배";
			break;
		}
		String _user = "";
		if (user==1) _user = "가위";
		else if(user==2) _user ="바위";
		else if(user==3) _user ="보";
		
		String _com = "";
		if (com==1) _com = "가위";
		else if(com==2) _com ="바위";
		else if(com==3) _com ="보";
		System.out.printf("사용자 : %s\n컴퓨터 : %s\n결과는 [%s]입니다",_user,_com,result);
	*/
		

		/*

		5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수(m)를 입력하세요");
		int m = sc.nextInt();
		System.out.println("두번째 정수(n)를 입력하세요");
		int n = sc.nextInt();
		
		int sum=0;
		if (m>n) {
			for (int i = n; i <= m ; i++) {
				sum+=i;
			}
		}//if
		else if(m<n) {
			for (int i = m; i <= n ; i++) {
				sum+=i;
			}
		}//if
		else {sum=0;}

		System.out.printf("%d",sum);
	*/
		
 /*
		6. 이름, 국어, 영어, 수학 을 입력받아서
		   총점, 평균을 계산하고
		   평균이 90~100 'A', 평균이 80~89 'B' ~ 평균이 0~59 'F' 로 처리해서
		   [출력 형식]
		   홍길동 90 83 92 265 83.33 'B' 
		   
		   
		String name = "";
		int sum;
		double avg;
		char [] grades = new char[3];
		grades[0] ='A';
		grades[1] ='B';
		grades[2] ='F';
			
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 국어, 영어, 수학 점수 입력하시오");
		//입력:  박, 90, 89 ,91
		String input = sc.nextLine();
		String [] inputs = new String [4]; 
		inputs = input.split("\\s*,\\s*"); //한 줄로 입력 받은것 4개로 분할
		//System.out.println(inputs[0]+"\n"+inputs[1]+"\n"+inputs[2]+"\n"+inputs[3]);
		
		int [] score = new int[3];
		for (int i = 0; i < inputs.length-1; i++) {
			score[i] =Integer.parseInt(inputs[i+1]);//점수 부분을 int로 변환해서 할당
		}
		//System.out.println(score[0]+"\n"+score[1]+"\n"+score[2]);
		sum = score[0] + score[1] + score[2];
		avg = sum/3;
		
		System.out.printf("%s님의 성적 합은 %s점이고 평균%.2f점입니다 ",inputs[0],sum,avg);
		
		if (avg >=90) {
			System.out.println("등급은 " + grades[0]);
		} else if(avg>=80){
			System.out.println("등급은 " +grades[1]);
		} else {System.out.println("등급은 " +grades[2]);}
		
	*/
		
	/*

		7. 배열 정의 : 동일한 자료형들의 값을 나열할 것
		7-2. 배열 선언 형식 : (자료형) [] 배열명 = new (자료형) (배열개수)
		7-3. 배열 크기 : 배열명.length()로 확인 가능
		7-4. 배열 UpperBound : 배열의 마지막 인덱스 번호 (끝방)
		7-5. 배열 초기화 : (타입명) 배열명 = {요소1,요소2...}
		7-6. foreach문 : 배열의 요소들을 순회하는 반복문
		에 대해서 설명하세요.

		8. 구구단(2단~9단)까지 출력하는 것을 검색해서 공부하기.
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
		for문 중첩
		
		

		9. 피보나치 수열 검색해서 공부하기
			이전 두 항의 합이 다음 항이 되는 수열
			f(n) = f(n-1) + f(n-2) (n >=2)
 */






	}//main

}//class
