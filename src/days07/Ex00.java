package days07;

public class Ex00 {

	public static void main(String[] args) {
		//		//구구단 세로 출력
		//		for (int i = 1; i <= 9; i++) {
		//			//System.out.printf("%d 단\n",i);
		//			System.out.println();
		//			for (int j = 2; j <= 9; j++) {
		//				System.out.printf("%dx%d=%d\t",j,i,i*j);
		//			}
		//		}
		//		
		//2. 1/2-2/3+3/4-...7/8-8/9=???
		int sum =0;
		for (int i = 1; i < 9; i++) {
			if (i%2==0) {
				System.out.printf("-%d",i);
				sum -=i;
			} else {
				if (i==1) {
					System.out.printf("%d/%d",i,i+1);
					sum=i/i+2;
					continue;
				}
				System.out.printf("+%d",i);
				sum+=i;
			}

			System.out.printf("/%d",i+1);
			sum/=i+1;
		}//for i
		System.out.println(sum);


		//3. 아래 코딩 결과는 ? 
		//		 EXIT:for (int dan = 2; dan <= 9 ; dan++) { 
		//			   for (int i = 1; i <= 9 ; i++) {
		//			      1) if( i == 5) break EXIT;
		//			      2) if( i == 5) continue EXIT;
		//			      System.out.printf("%d*%d=%d\t", dan, i, dan * i);
		//			   }
		//			   System.out.println();
		//			 }
		//4) 구구단 세개씩
		
//		System.out.println();
//		for (int l = 2; l <= 4; l++) {
//			System.out.printf("[%d]단\t\t",l);
//		}
//		for (int i = 1; i <= 9; i++) {
//			System.out.println();
//			for (int j = 2; j <= 4; j++) {
//				System.out.printf("%dx%d=%d\t",j,i,i*j);
//			}//for j
//		}//for i
//		
//		System.out.println(); //두번째 단락
//		for (int l = 5; l <= 7; l++) {
//			System.out.printf("[%d]단\t\t",l);
//		}
//		for (int i = 1; i <= 9; i++) {
//			System.out.println();
//			for (int j = 5; j <= 7; j++) {
//				System.out.printf("%dx%d=%d\t",j,i,i*j);
//			}//for j
//		}//for i
//		
//		System.out.println(); //세번째 단락
//		for (int l = 8; l <= 9; l++) {
//			System.out.printf("[%d]단\t\t",l);
//		}
//		for (int i = 1; i <= 9; i++) {
//			System.out.println();
//			for (int j = 8; j <= 9; j++) {
//				System.out.printf("%dx%d=%d\t",j,i,i*j);
//			}//for j
//		}//for i
		
		// 2단 3단 4단
		// 5단 6단 7단
		// 8단 9단
		for (int k = 1; k <= 3; k++) {//세 토막으로 출력 위함
			System.out.printf("k=%d\n", k);
			// k=1    j = 2; j <= 4
			// k=2    j = 5; j <= 7
			// k=3    j = 8; j <= 9
			//          3*k-1
			for (int j = 3*k-1 ; j <= 3*k+1  && j != 10 ; j++) {
				System.out.printf(" [%d단]\t", j);
			} // for j
			System.out.println();

			for (int i = 1; i <= 9 ; i++) {
				for (int j = 3*k-1 ; j <= 3*k+1  && j != 10 ; j++) {
					System.out.printf("%dx%d=%d\t",j,i,i*j);
				} // for j
				System.out.println();
			} // for i

			System.out.println();
		}



	}//main

}//class
