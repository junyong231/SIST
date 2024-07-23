package days17;

import java.io.IOException;
import java.util.Objects;

import days13.Point;

public class Ex05 {

	public static void main(String[] args) {
		//Arrays  클래스 : toString() sort() binarySearch()이진검색
		//Objects 클래스 : 모든 메서드 static
		//						Objects.메서드()
		//						객체의 비교 또는 Null체크 유용

		Point p1  = null;
		if (p1 == null) {
		}
		// 같은 코드
		if (Objects.isNull(p1)) {
			
		}
		
		
		if (p1 != null) {
			
		}
		//같은 코드
		if (Objects.nonNull(p1)) {
			
		}
		

		if (p1 ==null) {
			new IOException("예외 메세지를 적고");
		}
		Point pCopy = p1;
		//같은 코드
		Point pCopy2 = Objects.requireNonNull(p1, "예외 메세지를 적고");
		
		
		if (p1 != null && p1.equals(pCopy)) {
			
		}
		//같은 코드
		if (Objects.equals(p1, pCopy)) {
			
		}
		
		
	}

}
