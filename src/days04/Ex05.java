package days04;

import java.io.BufferedReader;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오전 11:03:14
 * @subject 인덱스 연산자
 * @content [] 메인 메소드의 매개변수에도 있지
 * 						배열: 동일한 자료형 + 메모리 상에 연속적으로 놓이게 한 것
 * 						배열 선언 형식.		타입[] 변수명 = new 타입[배열크기];      변수 참조변수 배열 다 맞는말
 * 						이것도 가능함 .		타입 변수명 [] = new 타입[배열크기];
 * 
 */
public class Ex05 {
									//이놈
	public static void main(String[] args) {
		// 한 학생의 국어 점수를 저장할 변수 선언
		// int kor ;
		
		// 5천명의 국어 점수를 저장할 변수 선언 
		// [배열]		타입[] 변수명 = new 타입[배열크기];
		//int [] kor = new int[5000];
		//int kor [] = new int[5000];
		
		
		//int [] kors = new int[3];
		//매우 중요 
		// 타입[] '배열명' = new 타입[배열크기];
		
		int [] kors ;
		kors = new int[3];
		// 배열명[첨자값]으로 개별개체 식별 가능
		kors[0] =100;
		kors[1] =90;
		kors[2] =75;
		System.out.println(kors[2]);
		
		//배열크기? (암기) 배열명.length
		// 배열의 가장 작은 첨자값(index) = lowerBound = 0
		// 배열의 가장 큰 첨자값(index)	 = upperBound = 배열명.length - 1
		System.out.println(kors.length); //3 
		
		//주의할 점
		kors[3] = 99; 
		//kors = new int[3];로 방 세개 만들었는데 4번째에 넣는다니까 안됨
		//빨간줄 없지만 실행할 때 오류 = 런타임 오류
		//java.lang.ArrayIndexOutOfBoundsException
		
		
		
		
		
		
	}
}
