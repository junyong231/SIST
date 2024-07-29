package days21;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오전 9:30:49
 * @subject IO == 입출력
 * @content 컴퓨터(프로그램) -> 송신  외부장치(다른프로그램)
 * 										<- 수신	
 * 					프로그램 간에 데이터를 주고 받는 것: 데이터 입출력
 *					
 *	두 장치(프로그램) 사이를 연결해 데이터를 운반하는 통로 : 스트림( Stream ) - 단방향.
 *	스트림 1) 사전적 의미: 흐르는 물
 *			2) 단방향 : 읽기/쓰기 스트림 각각 필요 (입/출력)
 *			3) 연속적인 데이터의 흐름
 *			4) 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어져 있다
 *
 *	예) 입력장치 (외부장치)			-> 수신 		(프로그램) : 프로그램 기준에서 수신임.   -> 송신    (모니터 등)
 *					표준입력장치		입력스트림													출력스트림
 *					키보드				 System.in													System.out
 *										스트림 객체													스트림 객체
 *
 *	자바의 스트림은 2가지 종류 구분(분류)
 *		1) 문자(텍스트) 스트림
 *			최상위 부모 클래스: Reader, Writer
 *									FileReader, FileWriter: File을 문자로서 입출력하는 스트림이었던 것.
 *		2)	바이트(이진) 스트림(0,1)
 *			최상위 부모 클래스: InputStream, OutputStream
 *									Properties 컬렉션 클래스(맵 계열)
 *									FileOutputStream : File을 이진데이터로 입출력하는 스트림.
 *
 *보조 스트림: 어떤 스트림의 IO를 더 쉽도록 보조해주는 역할을 하는 스트림..
 *					FileReader reader =xx;   //한 문자씩 읽는 파일리더
 *						BufferedReader br = new BufferedReader(reader)     reader를 버퍼드 리더에 넣어 라인 단위로 읽기 가능 
 *						버퍼드 리더가 보조 스트림이 됨
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		

	}//main

}//class
