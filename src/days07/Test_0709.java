package days07;

import java.util.Random;

public class Test_0709 {

	public static void main(String[] args) {
//		1. 이등변 삼각형 
//      __*  				(1,3)
//      _*** 			(2,2)(2,4)
//      *****		(3,1)			(3,5)
		
		//보드판이라고 생각
		for (int i = 1; i <= 3; i++) {//행 3개
			for (int j = 1; j <=5; j++) {//열갯수
				System.out.print(i+j>=4&&j-i<=2 ?"*":"_");
			}
			System.out.println();
		}
				

//2. 피보나치 수열 f(n) = f(n-1) + f(n-2)
// 1 1 2 3 5 8 13 21 34 55 89..
		
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm = 0;
		
		
		while (firstTerm < 100) { //출력을 위해 제한해놓음
			System.out.printf("%d+",firstTerm);
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm =nextTerm;
		}
	//이런 식의 구조를 가짐
		
		
//3. 문자열 메서드 정리
		System.out.println();
		String a = "trues";
		System.out.println(a.valueOf(false));

		/*
		 * .equals(비교할 문자열) 문자열이 같은지 비교 , 불리언 반환 
		 * .charAt(인덱스) 인덱스 넘버에 맞는 문자 반환
		 * .length() 문자열의 길이 반환
		 * .substring(a,b) a<=x<b의 인덱스에 해당하는 문자열 반환
		 * .toLower/UpperCase() 해당 문자열을 모두 소문자/대문자로 변환하여 반환
		 * .trim() 앞뒤 공백 제거하고 반환
		 * .split(regex) 정규표현식을 기준으로 문자열을 나누어 문자열로 반환
		 * .concat(합칠 스트링 이름) 스트링 둘을 결합하여 문자열 반환
		 * .valueOf(자료형) 자료형 상관없이 해당값을 문자열로 반환 
		 * .indexOf(문자열) 해당 문자열이 시작되는 인덱스 반환
		 * .join(" 구분자? ", 이어붙일 문자열 배열 or 문자열 ) 배열을 구분자로 구분하여 이어붙여 문자열 반환 
		 */
		
		
//
//4. 가변인자 설명
		//매개변수의 갯수가 가변적일 때 가변인자 (int...처럼)으로 처리하면
		//추가로 함수를 오버로딩하지 않고도 함수를 사용할 수 있게 해준다. 
	}

}
