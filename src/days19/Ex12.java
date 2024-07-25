package days19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 4:29:55
 * @subject	Map
 * @content	1.key+value 한쌍 관리 == Entry
 * 						ㄴ key 중복X value 중복O
 * 
 * 					2. HashMap (신) - 사용 권장 / HashTable(구) 사용법은 같음..
 * 					3. 해싱(Hashing) : 해시함수를 이용하여 데이터를 해시 테이블에 저장하고 검색하는 기법
 * 							ㄴ해시 함수? 데이터를 저장하는 곳을 알려주는 함수. 데이터를 빠르게 검색할 수 있다
 * 							
 * 
 * 						년도 일기		달...
 *					예) [2020] - [1][2]..[12]
 *						이렇게 정리해두면 찾아가기 쉬움 -> 많은 양의 데이터를 검색할 때 성능 좋음
 *
 *
 *
 *
 */					
public class Ex12 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("park", "박준용");
//		System.out.println(hm);
//		System.out.println(hm.size()); //엔트리의 갯수

		Set<Entry<String, String>> es = hm.entrySet(); //키-밸류 한 쌍이 엔트리 : 키,밸류 얻어오자 (이거 많이씀.)
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			System.out.printf("%s=%s\n",entry.getKey(),entry.getValue());
		}
		
		/*	
		//모든 키값만 필요하다?
		//System.out.println(hm.keySet()); //Set으로 돌려준다: 중복X

		//모든 키값2
		Set<String> keys = hm.keySet();
		Iterator<String> ir = keys.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.println(key);
		}

		//모든 밸류
		Collection<String> values = hm.values();
		Iterator<String> ir2 = values.iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
			System.out.printf("%s\n",value);
		}
		 */	

	}//main

}//class
