package days16;

/**
 * @author JUNYONG
 * @Date 2024. 7. 22.=오후 3:46:46
 * @subject
 * @content
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {

		/*
		String todo = "   홍길동    ";
		System.out.printf("[%s]\n",todo);
		System.out.printf("[%s]\n",todo.trim());
		System.out.printf("[%s]\n",todo.strip());
		System.out.printf("[%s]\n",todo.stripLeading()); //앞쪽 공백 제거
		System.out.printf("[%s]\n",todo.stripTrailing()); //뒤쪽 공백 제거
		*/
		
		String [] names = {"이시훈","원충희","김준석"};
		String content = String.join("</li><li>", names);
		System.out.println("<ol><li>"+content+"</li></ol>");
		//html로 보면 리스트로 나옴
		
	}//main

}//class
