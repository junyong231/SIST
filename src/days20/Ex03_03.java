package days20;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오전 10:45:44
 * @subject ** Properties 컬렉션 클래스 예제 *(읽어오기)
 * @content	환경설정값 가져오는 예제
 */
public class Ex03_03 {

	public static void main(String[] args) {

		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className ;            
		String url ;                  
		String user ;                                                                   
		String password ;   

		Properties p = new Properties();
		//		p.setProperty("className", "oracle.jdbc.driver.OracleDriver"); //put, add와 같은 느낌, 프로퍼티즈 객체에 저장..
		//		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		//		p.setProperty("user", "scott");
		//		p.setProperty("password", "tiger");

		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		//파일 읽을 때 FileReader , BufferedReader 썼었음
		//쓸 때는 FileWriter




		try(FileReader reader = new FileReader(fileName)) {
			//p.store(writer, "jdbc config sample"); //라이터랑 주석쓸거 넣음
			p.load(reader);
			Set<Object> ks = p.keySet();
			Iterator<Object> ir = ks.iterator();
			while (ir.hasNext()) {
				String key = (String) ir.next();
	            String value = p.getProperty(key);
	            System.out.printf("key=%s, value=%s\n", key, value);
			}

			System.out.println("  SAVE END  ");
		} catch (Exception e) {
			e.printStackTrace();
		}










	}//main

}//class
