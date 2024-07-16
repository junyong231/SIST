package days06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author JUNYONG
 * @date 2024. 7. 8. -오후 2:40:19
 * @subject 암기...
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

		//람다식과 스트림

		// 1~100 까지의 임의의 정수      10개 배열 m
		// 합
		// 갯수
		// 평균
		// 최대값
		// 최소값
/*
		IntStream istream = new Random().ints(1, 101).limit(10); //10개짜리 랜덤(1~100) 만듬
		long count = istream.count(); //방 개수
		int sum = istream.sum();// 합
		OptionalDouble odAvg = istream.average();//평균을 od로 반환
		double avg = odAvg.getAsDouble();
		OptionalInt oiMax =    istream.max();
		int max = oiMax.getAsInt();
*/
		
		//이제까지 정수  중 최대값 찾기 했었는데.. 쉽게도 가능(맛보기)
		IntStream.of(3,5,4,2,1,10).max().ifPresent(System.out::println);
	// 인트스트림(빨대) 생성 .최댓값찾기(옵셔널인트형).옵셔널개체가 값(nonNull)을 가지고 있다면 어쩌구저쩌구 

		
		
		
		//1. 이제까지 방법
		int [] m = new int [10]; 
		for (int i = 0; i < m.length; i++) { 
			m[i] = (int)((Math.random()*100)+1); 
		}
		System.out.println(Arrays.toString(m));
		// int[] m에서 75보다 큰 값만 얻어오려면
		for (int i = 0; i < m.length; i++) { 
			if (m[i] > 75) {
				//실행 코드
			}
		}
		
		//2. 람다 (소개목적)
		int [] n = IntStream.of(m).filter(i->i>75).toArray();
		System.out.println(Arrays.toString(n));
		

	}//main

}//class
