package days03;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 2:42:49
 * @subject Scanner클래스 쓰기
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		String name;
		byte kor,eng,math;
		short sum;
		double avg;

	    Scanner scanner = new Scanner(System.in); // 무조건 읽는건 system.in 가공을 scanner가 한다
	    
	    //[입력] 박준용 98 87 77 
	    System.out.print("> 이름, 국어, 영어, 수학 입력? ");
	    name = scanner.next(); //다음 토큰을 읽어온다. 문자열로서
	    kor = scanner.nextByte(); //다음 토큰을 읽어온다. 바이트로서
	    eng = scanner.nextByte();//그러니까 kor eng math는 바이트로 선언되었기 때문에 byte값을 넣어줘야하니 nextByte쓴거
	    math = scanner.nextByte();
	    
	    sum = (short) (kor + eng + math);
	    avg = (double)sum / 3;
	    
	    System.out.printf("%s\t %d\t %d\t %d\t %d\t %f\n",name,kor,eng,math,sum,avg);
	    
	}

}
