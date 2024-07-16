package days05_mine;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 5. -오전 9:00:00
 * @subject 복습테스트
 * @content
 */
public class Test {

	public static void main(String[] args) {
		//1. 대문자를 소문자로 변환하는 코딩을 하세요. 
		   char uc = 'A';  
		   char lc ;
		   lc = (char) (uc + 32);
		   System.out.println(lc);

		//2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
		   
		   
		   int sum = 0 ;
		   for (int i = 1; i <= 10; i++) {
			   
			   if (i==10) {
				   sum += i;
				   System.out.printf("%d",i);
				   continue;
			}
			   
			   sum += i;
			   System.out.printf("%d+",i);
			   
			}//for
		   System.out.printf("=%d",sum);
		   
		   System.out.println();
		   //3.헬로우월드 출력
		   
		    for (int i = 1; i <= 10; i++) {
		    	if (i == 10) {
		    		System.out.println(i+" - 헬로우 월드");
		    		break;
				}
		    	System.out.println("0"+i+" - 헬로우 월드");
				
			}//for
		    
		    String ss = "1,2,3,4,5";
		    String ss2 = "1,2,3,4,5,9";
		    System.out.println(ss.equals(ss2));
		    int [] ss3 = {2, 3, 4}; 

		    	
		   // int[] sss = Integer.parseInt(ss.split(","));
		    	
//		    System.out.println(sss[3]);
//		    System.out.println(sss.length);
//		    
		    
		    //7. [입력형식]
//		    팀원들을 입력하세요 ? 홍길동,이시훈, 송세호
//		    		   [출력형식]
//		    		   1. 팀원 : 홍길동
//		    		   2. 팀원 : 이시훈
//		    		   3. 팀원 : 송세호
		
		    @SuppressWarnings("resource") //이거 해주면 경고 안뜸
			Scanner sc = new Scanner(System.in); //close안해서 누수생긴다는 뜻
		    String[] team = new String[3];
//		    System.out.println(team.length);
		    
		    System.out.println("팀원들을 입력하세요 ?");
		    String teamMate =sc.nextLine(); //nextLine 안배웠었으니 배운대로만 풀라면 버퍼드리더 썼어야함
		    team = teamMate.split("\\s*,\\s*");
//		    System.out.println(team[0]);
//		    System.out.println(team[1]);
//		    System.out.println(team[2]);
		    
		    for (int i = 0; i < team.length; i++) {
				System.out.printf("%d. 팀원 : %s\n",i+1,team[i]);
			}
		    

		    
		    
		    
		    
		    
	}//main

}
