package days21;

import java.io.FileWriter;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오후 2:28:43
 * @subject DataInputStream,DataOutputStream..
 * @content 바이트 스트림이다
 * 					기본형 8가지를 읽기/쓰기
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = "홍길동" ;
		int kor = 98, eng = 89, mat =20;
		int tot = kor+eng+mat;
		double avg = tot/3;
		boolean gender = true;
		
		// student.txt 파일로 저장 ?
		
		String fileName = ".\\src\\days21\\student.txt";
		try (FileWriter writer = new FileWriter(fileName)){
			String info = String.format("%s,%d,%d,%d,%d,%.2f,%B", name,kor,eng,mat,tot,avg,gender);
			writer.append(info); //writer.write()와 같음
			writer.flush();
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END");
		
	}//main

}//class
