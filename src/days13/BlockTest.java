package days13;

public class BlockTest {
//클래스 초기화 블럭은 프로그램과 동시에 출발 (1회)
//인스턴스화 될 때마다 인스턴스 초기화 블럭은 매번 출발
	
	static double rate = 0.0; //명시적 초기화
	String name;
	int age;
	
	BlockTest() {
		//this.name = "익명";
		System.out.println("디폴트 생성자 호출됨");
	}
	BlockTest(int age) {
		//this.name = "익명";
		System.out.println("디폴트ㄴ 생성자 호출됨");
	}
	
	//인스턴스 초기화 블럭
	{	
		System.out.println("인스턴스 초기화 블럭 {}.");
		this.name = "익명";
		//생성자가 오버로딩 되어져 있을 경우 중복되는 초기화 코딩이 있다면
		//그 중복되는 초기화 코딩을 인스턴스 초기화 블럭을 선언해서 사용한다.
	}

	//클래스 초기화 블럭
	static{
		//클래스 변수를 초기화하기 위한 블럭
		//**객체 생성과 상관없이 프로그램 시작할 때 한 번 초기화
		//여기서 인스턴스 변수는 초기화 할 수 없다. (제일 먼저 되니까)
		System.out.println("클래스(static)초기화 블럭 {}.");
		
		rate =0.04; //static 붙은 애들 여기서 다시 초기화 됨
	}
	
	
		public static void main(String[] args) {
			
			System.out.println("1");
			BlockTest bt1 = new BlockTest();
			
			System.out.println("2");
			BlockTest bt2 = new BlockTest(3);
			
			System.out.println(rate);
			
			
		}//main
		

	}//class
