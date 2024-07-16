package days05_mine;

import java.text.Format;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오후 4:12:59
 * @subject ASCII 코드 모두 출력 + for문 사용
 * @content
 */
public class Ex02_09 {

	public static void main(String[] args) {
		//7비트 ASCII (128문자)
		//8비트 확장 ASCII (256문자)
		
		/*
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d[%c]\n",i,i);
		}
		//9   '\t' tab이라서 공백있음
		//10 '\n LineFeed(LF)
		//13 '\r CarrageReturn(CR)
		*/
		
		
		
		
		//문제 한 라인에 10개씩 출력하자.
		
		for (int i = 0; i < 256 ; i++) {
			
			if (i%10==0) { // 줄 1부터 입력됨
				System.out.printf("%d : ",i/10+1);
			} //이제 10문자마다 줄바꿈 필요
			if (i%10==9) {
				System.out.printf("[ %c ]",i);
				System.out.println();
				continue;
			}
			
			System.out.printf("[ %c ]",i);
			
		}
		
		
		
		
		
		
		
		/*
		for (int i = 0 , ln=1; i < 256; i++) {
			
			
			if (i%10==0) System.out.printf("%d : ",(i/10)+1);
			
			
			if (i%10==0) System.out.printf("%d :",ln++);
			//  0 10 ,,일때								   ln넣고 +1 시킴
			System.out.printf("[%c]",i);
			if (i%10==9) System.out.println();
		
			
		}
		*/		
		
	}//main

}
