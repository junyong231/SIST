package days06;

import java.util.Arrays;

//자동 임포트 : 컨트롤 쉬프트  O
/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 12:37:10
 * @subject 암기..
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
	
		
	      // 임의의 1~100 임의 정수 100개 중 max, min 출력.
		//힌트: 배열
		int [] m = new int [10]; //10개짜리 배열 선언
		int k= m[0]; // k는 배열 중 첫번째 값(피벗이라고 했던가)
		for (int i = 0; i < m.length; i++) { //모든 배열만큼 i 반복
			m[i] = (int)((Math.random()*100)+1); // 배열에 랜덤 값 하나씩 할당 (1~100)
		}//100개의 정수 배열완료
		System.out.println(Arrays.toString(m));//배열을 스트링으로 변환 (배열 안의 값 확인하려고)
		
		for (int i = 1; i < m.length; i++) {// 99번 반복 (맥스 비교 횟수)
			//k = Math.max(m[i],m[i+1]); //결국 앞뒤라서 이건 안됨ㄴ
			k = Math.max(k,m[i]); //둘 중 큰값을 계속 넣어주면서 끝까지 비교하기
		}
		System.out.println("큰놈 : "+k);
		
		for (int i = 1; i < m.length; i++) {// 99번 반복 (맥스 비교 횟수)
			k = Math.min(k,m[i]); //둘 중 작은값을 계속 넣어주면서 끝까지 비교하기
		}
		System.out.println("작은놈 : "+k);
		
//		
//	      int a, b, c, d ,e;
////	      Scanner scanner = new Scanner(System.in);
////	      System.out.print("세 정수(a,b,c)를 입력 ? ");
//	      a = (int)((Math.random()*100)+1);
//	      b = (int)((Math.random()*100)+1);
//	      c = (int)((Math.random()*100)+1);
//	      d = (int)((Math.random()*100)+1);
//	      e = (int)((Math.random()*100)+1);
//	      
//	      System.out.printf("%d,%d,%d,%d,%d",a,b,c,d,e);
//	      
//	      int max = Math.max( Math.max(a, b), c);
//	      int max2 = Math.max( Math.max(max, c),d);
//	      int max3 = Math.max( Math.max(max2, d),e);
//	      
//	      System.out.println("\n"+max3);

	      
	      
	      
	      

	      /*
	      int max = a > b ?  a : b;
	      max =  max > c ? max : c;

	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
	      */
//	      int max = Math.max( Math.max(a, b), c);
//
//	      int abMin = Math.min(a, b);
//	      int min = Math.min( c , abMin);


	}//main

}//class
