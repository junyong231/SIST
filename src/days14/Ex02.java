package days14;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오전 10:15:43
 * @subject static예제
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document("Sample.txt");
		Document doc3 = new Document();
		Document doc4 = new Document();
		

	}//main


	
	
}//class

class Document {
	String fileName = "Noname"; // 명시적 초기화
	static int count = 1;
	
	public Document(String fileName) {
		this.fileName = "fileName";
		System.out.printf(" \"%s\" 문서가 생성되었습니다\n",this.fileName);
		
	}

	public Document() {
		this ("Noname\n" + count++);
	}
}