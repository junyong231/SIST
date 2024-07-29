package days21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오후 2:10:01
 * @subject
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		
		String content = "package days21;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author JUNYONG\r\n"
				+ " * @Date 2024. 7. 29.=오전 9:00:41\r\n"
				+ " * @subject enum 열거형\r\n"
				+ " * @content\r\n"
				+ " *\r\n"
				+ " */\r\n"
				+ "public class Ex01 {\r\n"
				+ "\r\n"
				+ "	//enum Direction {EAST , SOUTH, WEST, NORTH}\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400,\"▲\") ;\r\n"
				+ "		\r\n"
				+ "		private int value;\r\n"
				+ "		private String symbol;\r\n"
				+ "			\r\n"
				+ "		\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "//			this.value;\r\n"
				+ "//			this.symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		public int getValue() {\r\n"
				+ "		return this.value;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return this.symbol;\r\n"
				+ "			}\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	\r\n"
				+ "	/*\r\n"
				+ "	 * 컴파일러가 클래스로 변환시킴\r\n"
				+ "	 *  class Direction extends Enum\r\n"
				+ "	 *  	static final Direction EAST = new Direction()\r\n"
				+ "	 *  \r\n"
				+ "	 *  private String name;\r\n"
				+ "	 *  public String name() {\r\n"
				+ "	 *  	return this.name;\r\n"
				+ "	 *  }\r\n"
				+ "	 *  \r\n"
				+ "	 *  private int ordinal;\r\n"
				+ "	 *  public int ordina() {\r\n"
				+ "	 *  	return this.ordinal;\r\n"
				+ "	 *  }\r\n"
				+ "	 *  \r\n"
				+ "	 *  이렇게..\r\n"
				+ "	 */\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "//		System.out.println(Direction.EAST);\r\n"
				+ "//		System.out.println(Direction.EAST.toString());\r\n"
				+ "//		System.out.println(Direction.EAST.name());\r\n"
				+ "//		System.out.println(Direction.EAST.ordinal()); //인덱스값\r\n"
				+ "\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println();\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "	}//main\r\n"
				+ "\r\n"
				+ "}//class\r\n"
				+ "";
		
		//[문제] 21번째 라인의 문자열을 String line21에 저장 후 출력
//		String [] ct = content.split("\\n");
//		String line21 = ct[20];
//		System.out.println(line21);
		//위 풀이도 맞긴하지
		
		// 풀이 2) 메모리 스트림 StringReader, StringWriter 쓰기 
		
//		StringReader reader = new StringReader(content);
//		BufferedReader br = new BufferedReader(reader); //보조 스트림 (한글자 -> 한 라인씩 읽게 하려고)
//		for (int i =0; i<20 ; i++) br.readLine();// 20번째 줄까지 걍 읽음 출력 x
//		String line21 = br.readLine(); //21번쨰 라인 저장
//		System.out.println(line21);
		
		
		//풀이3 스트링 배열로 만들고 20번까지 스킵 후 21번째 라인 뽑아오기
		String line21 = Stream.of( content.split("\r\n") ).skip(20).findFirst().get(); //findFirst는 옵셔널스트링을 리턴하므로 한번 더 과정 거쳐야함(get())
		System.out.println(line21);
		
		
		
		
	}//main

}//class
