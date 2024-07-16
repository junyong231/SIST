package days05_mine;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오전 9:41:22
 * @subject	풀이
 * @content
 */
public class Test02 {

	public static void main(String[] args) {
//		1. 대문자를 소문자로 변환하는 코딩을 하세요. 
		   char uc = 'A';  
		   char lc ;
		   
		   lc = (char) (uc + 32); // int 를 char로 바꾸기?! (char)사용
		   
//	   "A".toLowerCase() 하면 "a"가 나옴(문자열_문자열 전체를 소문자로 바꾸는 함수)
		   

//		2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
		   
		   /*
		   int sum = 0; 
		   for (int i = 1; i <= 10; i++) {
				   if (i==10) {
					   System.out.printf("%d",i);
					   sum +=i;
				} else {
					   System.out.printf("%d+",i);
					   sum +=i;
				}
			   
			}//for
		   System.out.printf("=%d",sum);
		   */
		   
		   //와 삼항연산자를 쓰면 너무 간단하네;;; 근데 더 좋은 방법이 있다?!
		   /*
		   int sum = 0; 
		   for (int i = 1; i <= 10; i++) {
			   System.out.printf(i==10? "%d" : "%d+",i);
			   sum +=i;
			}//for
		   System.out.printf("=%d",sum);
*/
		   
		   //백스페이스 이용??! ( \b )
		   int sum = 0; 
		   for (int i = 1; i <= 10; i++) {
			   System.out.printf("%d+",i);
			   sum +=i;
			}//for
		   System.out.printf("\b=%d",sum);
		   //글꼴 때문에 ㅁ 보이지만 이게 젤 좋음(if문 조건 10번 체크 안하니까) 와 !!!

		   
//		3. return 문, break 문에 대해서 설명하세요. 

		   /*
		    * 제어문 탈출 break
		    * 함수를 호출한 곳으로 함수 값을 가지고 '돌아감'(=빠져나감)
		    */
		   
		   
		   
//		4. for문을 사용해서  아래와 같이 출력하는 코딩을 하세요.

//		   [실행결과]
//		   01 - 헬로우 월드  
//		   02 - 헬로우 월드  
//		   03 - 헬로우 월드  
//		   04 - 헬로우 월드  
//		   05 - 헬로우 월드  
//		   06 - 헬로우 월드  
//		   07 - 헬로우 월드  
//		   08 - 헬로우 월드  
//		   09 - 헬로우 월드  
//		   10 - 헬로우 월드

		   for (int i = 1; i <= 10; i++) {
			   System.out.printf("%02d - 헬로우 월드\n",i);
			   //with : 2 , flag : 0 기억하는지 물어보는 질문
			
		}
		   
		   
//		5. 배열의 정의
//		동일한 자료형 + 메모리 상에 연속적으로 나열한 것 new Heap(힙) 

//		5-2. 배열의 선언 형식
//		타입 [] 배열명 = new 타입[배열크기];
		//중요: 어제 그린 그림 이해하기
		   
//		5-3. 배열의 크기를 알아오는 코딩
//		배열명.length 
//		

//		5-4. 배열의 윗첨자값(UpperBound) 알아오는 코딩
//		배열명.length - 1 :배열 마지막 요소 접근

//		6. 우리가 지금까지 배운 문자열(String)을 다루는 메서드를 모두 적으세요. 
/*
		   charAt() char 리턴
		   equals() boolean 리턴
		   equalsIgnoreCase() boolean 리턴 (대소문자 구분x 비교)
		   !equals() boolean 리턴
		   split(regex) String [] 리턴
		   toUpperCase,LowerCase()
		   trim() 앞 뒤 공백 자름 
중요	   format()
*/
//		7. [입력형식]
		   Scanner sc = new Scanner(System.in);
		   System.out.println("팀원들을 입력하세요 ? ");
		   String data = sc.nextLine();

		   

	}

}
