package days21;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex09 {
//파일로 저장하기
	public static void main(String[] args) {
		String name = "홍길동" ;
		int kor = 98, eng = 89, mat =20;
		int tot = kor+eng+mat;
		double avg = tot/3;
		boolean gender = true;
		
		// student.txt 파일로 저장 ?
		
		String fileName = ".\\src\\days21\\student.dat";
		
		
		try (FileOutputStream fos = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(fos) ){ //매개변수로 OutputStream 달라고 하니 위에도 writer가 아닌 스트림으로 변경
			
			dos.writeUTF("홍길동");
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END");

	}//main

}//class
