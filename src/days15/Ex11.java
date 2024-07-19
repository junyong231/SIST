package days15;

/**
 * @author JUNYONG
 * @Date 2024. 7. 19.=오후 5:06:24
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		
		String parsingFile = "hello.html";
		String docType = "html";
		
		Parseable parser = ParseManager.getParser(docType);
		parser.parse(parsingFile);
		
		
		System.out.println(" end ");
	}//main
	
	
}//class

interface Parseable {
	void parse(String fileName); //파싱(구문분석)하는 메서드
	
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> XML파일 구문 분석 코딩 .. ");
		
	}
	public void print(String fileName) {
		System.out.println("> XML파일 구문 분석 후 인쇄 코딩 .. ");
		
	}
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> HTML파일 구문 분석 코딩 .. ");
		
	}
	
}

class ParseManager{
	public static Parseable getParser(String docType) {
		if (docType.equals("xml")) {
			return new XMLParser();
		} else if (docType.equals("html")) {
			return new HTMLParser();
		}else
			return null;
		
	}
}