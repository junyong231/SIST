package days06;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 3:11:19
 * @subject 이름(Label)이 붙은 반복문
 * @content		break문			break 라벨명;
 * 						continue문		continue 라벨명;
 * 
 * 	수업 중에 나온거 바로 쓸수있도록 집에서 연습하자
 */
public class Ex06 {

	public static void main(String[] args) {
		
		
//		ㄱ,냥 break쓰면 안쪽만 나가짐
		
//		for (int i = 2; i < 10; i++) {
//			System.out.printf(i + "단 ");
//			for (int j = 1; j < 10; j++) {
//				if (j==5) {
//					break;//안쪽 for문만 빠져나감
//				}
//				System.out.printf("%dx%d=%d\t ",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		//바깥 for문 빠져나가는법
		EXIT:for (int i = 2; i < 10; i++) { //라벨링.
			System.out.printf(i + "단 ");
			for (int j = 1; j < 10; j++) {
				if (j==5) {
				//	break EXIT;//라벨링 된 for문까지 빠져나감
					continue EXIT;  //라벨링 된 EXIT의 증감식으로 감 : 따라서 밑에 개행코드도 안만남
				}
				System.out.printf("%dx%d=%d\t ",i,j,i*j);
			}
			System.out.println();
		}
		
		
		/* 어쨌든 찍는법
	      int dan = 2;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 3;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 4;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      :
	      dan = 9;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      */
		
		
		
	}//main

}//class
