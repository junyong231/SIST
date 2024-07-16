package days03;

/**
 * @author JUNYONG
 * @date 2024. 7. 3. -오후 5:16:39
 * @subject [증감연산자]
 * @content += , -=, ++ ,--
 */
public class Ex05_06 {

	public static void main(String[] args) {
		//어떤 기억공간의 값을 1증가 시키는 코딩
		int n = 10;
		//n =11; 도 됨
		//n=n+1;도 됨
		//n +=1; 
		// n++; //후위형 증감 연산자
		++n;	//전위형 증감 연산자
		//단독으로 쓰일 때는 차이가 없다
		
		System.out.println(n);
		//쓰는게 좋은 이유
		//this.txtName.value = this.txtName.value + "안녕~";
		//this.txtName.value += "안녕~";
		//
	}

}
