package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author JUNYONG
 * @Date 2024. 7. 29.=오후 3:44:06
 * @subject
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		//PipedReader/PipedWriter
		//		스레드 간에 데이터 입출력 시 사용하는 스트림..

		//RandomAcessFile
		// ㄴ 파일의 어느 위치에나 읽/쓰 가능한 장점이 있다..!
		// ㄴ getFilePoint() 파일 포인트 (위치값)
		//     ㄴ seek(위치)
		//		ㄴ readXXX(), writeXXX() 메서드 사용 가능.!	


		String s = "I Love normal Java";
		String q = "javabook"; 

		String name = ".\\src\\days21\\random.txt"; //읽으려는 파일 이름
		String mode = "rw"; //읽기 쓰기 전용

		try (RandomAccessFile raf = new RandomAccessFile(name , mode)){
			long fp = raf.getFilePointer();
			System.out.println("현재 파일 포인트 위치 : " + fp);
			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거

		try (RandomAccessFile raf = new RandomAccessFile(name , mode)){
			raf.seek(7); //이동
			raf.writeBytes(q); //이동 후 q 작성
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거
		
		try (RandomAccessFile raf = new RandomAccessFile(name , mode)){
			raf.seek(2); //이동
			String line = raf.readLine(); //인덱스 2부터 읽을 수도 있구나
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END");
		
		
	}//main

}//class
