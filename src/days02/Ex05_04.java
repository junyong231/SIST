package days02;


/**
 * @author JUNYONG
 * @date 2024. 7. 2. -오후 4:32:09
 * @subject  진법 변환 설명
 * @content 자바 문자 타입
 * 					 char 유니코드 2byte
 */

public class Ex05_04 {

	public static void main(String[] args) {
		
		char ch = 'A'; //A를 메모리에 어케 저장? = 문자코드표
		//A = 65 , a =97 , 0(문자) = 48 ascii(문자코드표)
		
		/*
		 * String %s
		 * float double %f
		 * byte short int long %d (%o %x)
		 * boolean %b  %B
		 * char %c  %C
		 */
		
		System.out.printf("\'%c \' - %d\n ", ch ,(int)ch); // A
		System.out.printf("\'%c \' - %d\n ", 'Z' ,(int)'Z'); 
		System.out.printf("\'%c \' - %d\n ", 'a' ,(int)'a'); 
		System.out.printf("\'%c \' - %d\n ", 'z' ,(int)'z'); 
		System.out.printf("\'%c \' - %d\n ", '0' ,(int)'0'); 
		System.out.printf("\'%c \' - %d\n ", '9' ,(int)'9');
		//한글
		System.out.printf("\'%c \' - %d\n ", '가' ,(int)'가'); 
		System.out.printf("\'%c \' - %d\n ", '힣' ,(int)'힣'); //힣이 마지막 한글임 
		
		
		char c = 'A'; 
		char c2 = 65; 
		char c3 = 0x0041; 
		char c4 = '\u0041'; //홑따옴표 안인데 여러문자? 가 아니고 (유니코드 2바이트짜리 문자란 뜻) 
		
		
		
		//63
		// 128   64   32   16   8    4    2    1
		//   0      0     1    1    1    1    1    1 =2진수값  [00111111]
		//8진수 변환 (3비트씩 끊기) [00 111 111] = 0 7 7 = 77 = 정확한 표현 077
		//16진수 변환(4비트씩 끊기) [0011 1111] = 3 15 = 3f = 정확한 표현 0x3f 
		// 012 = 8진수 12  , 0x12 = 16진수 12
		
		
	}

}
