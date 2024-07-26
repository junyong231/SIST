package days20;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author JUNYONG
 * @Date 2024. 7. 26.=오전 10:45:44
 * @subject ** Properties 컬렉션 클래스 예제
 * @content	1.키(스트링) 밸류(스트링)로 저장하는 map계열
 * 					2.환경설정 값들을 저장하고 읽어올 때 사용
 * 					3.setProperty() /get..
 * 					4.파일(.properties) 저장
 * 						p.store(라이터, 주석문)
 * 						p.storeToXML(아웃풋스트림, 주석문) 
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Map : HashMap , HashTable Properties 컬렌션 클래스
		 * 1. Hashtable<String, String> = Properties
		 * 2. key + value = entry
		 * 3/환경 설정 값들을 파일로 쓰기, 읽기 (put(),get(),setProperties()/getProperties)
		 * 4. 저장되는 파일 확장자 : .properties, .store
		 * 
		 */

		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";   
		
		Properties p = new Properties();
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver"); //put, add와 같은 느낌, 프로퍼티즈 객체에 저장..
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		//파일 읽을 때 FileReader , BufferedReader 썼었음
		//쓸 때는 FileWriter
		
		try(FileWriter writer = new FileWriter(fileName)) {
			//p.store(writer, "jdbc config sample"); //라이터랑 주석쓸거 넣음
			
			System.out.println("  SAVE END  ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
	}//main

}//class
