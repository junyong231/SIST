package days06;

import java.util.Iterator;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 5:08:07
 * @subject 별찍기
 * @content
 * /*


 *
 **
 ***
 ****

 ****
 ***
 **
 *

___*
__**
_***
 ****

 ****
_***
__**
___*

 이등변삼각형
__*
_***
 *****

 *
_*
__*
___*
____*

____*
___*
__*
_*
 *

 *___*
_*_*
__*
_*_*
 *___*

마름모

__*
_***
 *****
_***
__*

모래시계
 * */


public class Ex09 {

	public static void main(String[] args) {
		//1 
		//		*
		//		**
		//		***
		//		****	
		//System.out.print("*");


		//		for (int i = 0; i < 4; i++) { //4줄
		//			for (int j = 0; j <= i; j++) { //별은 점점 늘어나므로 j++ 이용하고 j++이니 조건식 j <(=)i여야 무한루프 x
		//				System.out.print("*");				
		//			}
		//			System.out.println();
		//		}



		//		****
		//		***
		//		**
		//		*		

		/*		
		for (int i = 0; i < 4; i++) {//4줄
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */		



		//		___*
		//		__**
		//		_***
		//		****

		/*
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j > i; j--) { //공백 , 점점 줄어드니 --
				System.out.print("_");
			}
			for (int k = 0; k <= i; k++) {//별, 점점 늘어나니 ++
				System.out.print("*");
			}
			System.out.println();
		}
		 */




		//		****
		//		_***
		//		__**
		//		___*


		//		for (int i = 0; i < 4; i++) {
		//			for (int j = 0; j < i; j++) {
		//				System.out.print("_");
		//			}
		//			for (int k = 4; k > i; k--) { // i는 0부터고 k는 4부터니 k>i에서 최대 반복수는 4번(=별4개)
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}




		//		__*
		//		_***
		//		*****		


		//		for (int i = 0; i < 3; i++) { //3줄
		//			for (int j = 2; j > i; j--) {//공백 점점 줄어듬 
		//				System.out.print("_");
		//			}
		//			for (int k = 0; k <= i*2; k++) { //이건 i조건을 잘 생각해줘야함
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}




		//		*
		//		_*
		//		__*
		//		___*
		//		____*


		//		for (int i = 0; i < 5; i++) { //5줄
		//			for (int j = 0; j < i; j++) {//공백은 점점 늘어남 
		//				System.out.print("_");
		//			}
		//			System.out.print("*"); //행마다 한개니까 i로 돌게하자
		//			System.out.println();
		//		}

		//		____*
		//		___*
		//		__*
		//		_*
		//		*


		//		for (int i = 0; i < 5; i++) {
		//			for (int j = 4; j > i; j--) {
		//				System.out.print("_");
		//			}
		//			System.out.print("*");
		//			System.out.println();
		//		}


		//		*___*
		//		_*_*
		//		__*
		//		_*_*
		//		*___*


		//...이거 말고는 도저히 모르겠습니다..

		/*
		for (int i = 0; i < 5; i++) { //5줄
					if (i==0) {
						System.out.print("*___*");
					}else if (i==1) {
						System.out.print("_*_*");
					}else if(i==2) {
						System.out.print("__*");
					}else if(i==3) {
						System.out.print("_*_*");
					}else if(i==4) {
						System.out.print("*___*");
					}

			System.out.println();
		}//for i
		 */


		//		__*
		//		_***
		//		*****
		//		_***
		//		__*

		/*
		for (int i = 0; i < 5; i++) { //5줄
			for (int j = 2; j > i; j--) { //공백 점점 줄어듬
				if(i<3) {
				System.out.print("_");
				}//if
			}//for j
			for (int k = 0; k <= i*2; k++) {//별, 점점 늘어남
				if (i<3) {//3행까지만 적용
					System.out.print("*");					
				}
			}//for k
			for (int j2 = 2; j2 < i; j2++) {//공백 3행 이후로는 점점 늘어남
				if (i>2) {
					System.out.print("_");	
					}//if
				}//for j2
			for (int k2 = 9; k2 > i*2 ; k2--) { //별 점점 줄어듬
				if (i>2) {
					System.out.print("*");
				}
			}//for k2
			System.out.println();
			}//for i
		 */





		//알아낸것? (팁?)
		// 1) 조건문이 j(* , _) > i(행) 일 때 for문이 돌아간다면 j++이면 무한루프 (반대도 성립)임을 외워두자
		// 2) 행(보통 i)이 넘어갈 때 '증가'하는 것(*이나 _)들은 j++이 들어가는 식으로 해야함(반대도 성립)
		//		ㄴ i가 늘어날 때 j가 줄어들면 반복 횟수가 적어지기 때문 (=별(또는_)이 적어지기 때문
		//3) 마름모처럼 경향이 바뀌면 새로 만들어야함 (새 구간은) 


		//복습문제

		//1. 1-2+3-4...-8+9-10=-5
		//홀수는 더하고 짝수는 뺸다

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.printf("-%d",i);
				sum-=i;
			} else {
				System.out.printf("+%d",i);
				sum+=i;
			}
		}//for i
		System.out.printf("=%d",sum);

		//2. 구구단 (2단~9단) 가로, 세로 출력
		//세로
		for (int i = 2; i <= 9; i++) {
			System.out.printf("\n%d단\n",i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%d\n",i,j,i*j);				
			}//for j
		}//for i

		System.out.println();

		//가로 (1)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%d\t",i,j,i*j);				
			}//for j
			System.out.println();
		}//for i

		
		System.out.println();
		
		//가로 (2)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) { //계속 바뀌는건 j
				System.out.printf("%dx%d=%d\t",j,i,i*j);				
			}//for j
			System.out.println();
		}//for i

		System.out.println();
		
		/*
				3. 아래 코딩 결과는 ? 
				 EXIT:for (int dan = 2; dan <= 9 ; dan++) { 
				   for (int i = 1; i <= 9 ; i++) {
				      //if( i == 5) break EXIT;
				       if( i == 5) continue;
				      System.out.printf("%d*%d=%d\t", dan, i, dan * i);
				   }
				   System.out.println();
				 }
		*/
		
				 //break EXIT는 2*4=8 에서 코드 종료 (EXIT를 빠져나감)
				 //그냥 break면 자기랑 가장 가까운 반복문만 빠져나가므로 다시 3단 진행 -> 3*4에서 5단 진행 반복..
				 
				 //continue EXIT는 2*4=8 출력하고 EXIT의 증감식으로 가기 때문에 3단 출력
				 //그냥 continue면 가장 가까운 반복문의 증감식으로 가니까 2*6부터 출력






	}//main

}//class
