package days03;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 12:15:46
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(Integer.toBinaryString(i)); 
		System.out.println(Integer.toOctalString(i));  //8진수로 변환
		System.out.println(Integer.toHexString(i));  //16진수로 변환
		
		/*  시험
		
		System.out.printf("%d\n",i);
		System.out.printf("%#o\n",i); //진법 맞는 형식으로 출력됨
		System.out.printf("%#x\n",i);
		
		int money = 23535790;
		System.out.printf("%,d\n",money); //오 세자리마다 컴마 찍힌다
		*/ 
	}

}
