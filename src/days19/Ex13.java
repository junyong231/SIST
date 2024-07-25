package days19;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 5:11:03
 * @subject 파일 읽고 막대그래프 응용
 * @content
 *
 */
public class Ex13 {

	public static void main(String[] args) {
		// 읽어들인 문자, 갯수
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = '0'; i <= 'z' ; i++) {
			if (Character.isDigit(i) || Character.isAlphabetic(i) ) {
				hm.put((char) i , 0);
			}//if
		}//for i

		//
		String fileName = "Ex01.java";
		String dir = "user.dir"; //javaPro까지나옴
		String userDir = System.getProperty(dir);      
		String path = String.format("%s\\src\\days19\\%s", userDir, fileName);
		
		try (FileReader reader = new FileReader(path)) {
			int code ;
			char one;
			while( ( code = reader.read())!= -1 ){
				one = (char)code;
				if (hm.containsKey(one)) {
					int count =  hm.get(one);
					hm.put(one, count+1);
				}
			}
		} catch (Exception e) {
			
		}
		
		//출력
		Set<Entry<Character, Integer>> es = hm.entrySet(); //키-밸류 한 쌍이 엔트리 : 키,밸류 얻어오자 (이거 많이씀.)
		Iterator<Entry<Character, Integer>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = ir.next();
			System.out.printf("'%c'=%d %s\n",entry.getKey(),entry.getValue(),"■".repeat(entry.getValue()));
		}
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
		}

	}//main

}//class
