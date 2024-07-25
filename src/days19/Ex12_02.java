package days19;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author JUNYONG
 * @Date 2024. 7. 25.=오후 4:29:55
 * @subject	Table
 * @content	
 *
 *
 *
 *
 */					
public class Ex12_02 {

	public static void main(String[] args) {

		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("park", "박준용");
		System.out.println(hm);
		System.out.println(hm.size()); //엔트리의 갯수

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
