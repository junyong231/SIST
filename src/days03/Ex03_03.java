package days03;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 12:42:25
 * @subject 타입(형) 변환
 * @content  	1) 자동 형 변환
 * 							- 큰 자료형 = 작은 자료형의 값
 * 							
 * 					  	2) 강제 형 변환
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//f 안붙이면 기본double로 잡히는 3.14는 타입이 안맞아 에러남 (더블이 더 크니까)
		//float pi = (float)3.14;  이것도 되고
		float pi = 3.14f; //이것도 됨
		int no = 15;
		System.out.printf("%d\n",no);
		System.out.printf("%4d\n",no);
		System.out.printf("%04d\n",no);
		System.out.println("-".repeat(20));
		String name ="홍길동";
		System.out.printf("[%10s]\n",name); //총너비 10칸 오른쪽 정렬
		System.out.printf("[%-10s]\n",name);//총너비 10칸 왼쪽 정렬
		
		
		int i = 100;
		long l = i; // (자동 형 변환 첫번째 예시)
		
		long k = l + i ; //큰 자료형 + 작은 자료형 => 큰 자료형 (자동형변환 두번째 예시)
		
		
		//강제 형변환 - (변환하고자 하는 타입) cast 연산자
		//cast 강제 형 변환
		i = (int) 100L;
		
		// () 최우선 연산자
		
		
	}

}
