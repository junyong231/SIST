package days04;

/**
 * @author JUNYONG
 * @date 2024. 7. 4. -오후 2:51:29
 * @subject while문
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		int i =1 ;
		
		while (i <= 10) {
			System.out.println("박준용"+i);
			
			//System.out.println("박준용"+ ++i); //10번 이지만 '증가시키고' 출력이라 2~ 11 찍힘 (밑에 i++없어야됨) 
			
			i++;  //이거 없으면 무한루프
		}//while
	}

}
