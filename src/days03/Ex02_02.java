package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오전 11:34:09
 * @subject 이름과 나이 입력받아 출력하기
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//ctrl space 계속 쓰면 오타도 안남
		
		String name;
		byte age = 20;
		
		
		System.out.print("이름: ? ");
	    name = bufferedReader.readLine(); //두줄씩 잡아서도 컨알방향키로 복사가능
	    
	    System.out.print("나이: ?(숫자만 입력) ");
	    age =Byte.parseByte(bufferedReader.readLine()) ; 
	    
	    //String strAge =bufferedReader.readLine();
	    //age = Byte.parseByte(strAge);  이게 가독성은 좋다
	    
	    //bufferedReader.readLine() 그대로 적으면
	    //Type mismatch: cannot convert from String to byte 이게 나옴
	    //readLine()은 String받는데 age는 byte라서 안되는거임 [타입(형) 변환] 필요
	    //"20"을 20으로 변환해야함
	    //Byte(클래스).parseByte() (메소드) : 스트링을 바이트로 바꿔주는 메소드 컨스페하면 다 나옴
	    
	    //나이를 숫자만 입력하지 않고 다른거 넣으면  java.lang.NumberFormatException 발생
	    
	    
	    System.out.printf("당신의 이름은 \"%s\" , 나이는 %d", name, age );
	}

}
 