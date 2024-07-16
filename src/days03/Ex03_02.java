package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 12:26:40
 * @subject (전체 암기 시험!)
 * @content 오늘 것 중에 젤 중요하네
 */
public class Ex03_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		int i = 2147483647;
		*/
		int i = Integer.MAX_VALUE; //다 대문자니까 상수네 + 래퍼클래스 Integer
		int j = 100;
		
		int k = i + j; //산술 오버플로 발생 (반대의 경우 언더플로)
		long m = (long)i+j; // 해결
		 System.out.printf("%d + %d = %d\n",i,j,k);  // 음수가 나와버림
		 System.out.printf("%d + %d = %d\n",i,j,m);  // 해결
		 
		
		//String이름
		//byte국 영 수 입력받아
		//short총점, double평균 계산
		//[출력형식] 홍길동 90 89 91 270 90.00
		String name;
		byte kor,eng,math;
		short sum;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	[입력을 받아주는 클래스] br을 선언했으니 br클래스 이용하면 입력 받을 수 있다
		
		System.out.print("이름: ? ");
	    name = br.readLine(); //두줄씩 잡아서도 컨알방향키로 복사가능
	    //리드라인: 한줄 읽는 기능 (string저장) -> name에 저장
	    System.out.print("국어: ?(숫자만 입력) ");
	    kor =Byte.parseByte(br.readLine()) ; 
	    System.out.print("영어: ?(숫자만 입력) ");
	    eng =Byte.parseByte(br.readLine()) ; 
	    System.out.print("수학: ?(숫자만 입력) ");
	    math =Byte.parseByte(br.readLine()) ; 
	    
	    sum = (short) (kor + eng + math); //Type mismatch: cannot convert from int to short 왜 저 셋을 int로 인식하지
	   // byte 끼리의 연산일지라도 cpu에서 int로 연산함 그래서 에러 메세지에 int있는거
	    //
	    //avg = sum / 3; //        short/int가 되므로 int로 저장됨 소숫점 제대로 안나옴
	    
	    avg = (double)sum / 3; 
	    //둘 중 하나를 더블로 바꾸면 되지만 3.00과목은 없으니 sum에 붙임
	    
	    System.out.printf("%s\t %d\t %d\t %d\t %d\t %f\n",name,kor,eng,math,sum,avg);
	    
	    //박준용	10
	    //박준	10  띄어쓰기로 맞추지 말고 탭(=역슬t)으로 맞추자 여기서 용 지워서 2글자도 되도 10 안딸려옴

	}

}
