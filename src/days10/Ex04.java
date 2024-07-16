package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오전 11:27:18
 * @subject 배열 단점 ( 컬렉션 클래스를 쓰게되는 이유   JCF자바컬렉션프레임워크)
 * @content 배열 크기가 다 찼을 때 자동으로 크기가 늘어나지 않는 것.
 *
 */
public class Ex04 {

	static int index = 0;
	static char con = 'y';
	static Scanner sc = new Scanner(System.in);
	static int [] m = new int [3];
	static int selectedNumber ;//선택된 메뉴 번호를 저장할 변수
	static String [] menus = {"추가","수정","삭제","검색","조회","종료",};
	
	
	public static void main(String[] args) throws IOException {
		while (true) {
			
			dispMenus();
			selectMenus();
			processMenu();
			
			
			
//			if (index ==0 ) {
//				con = (char) System.in.read();
//				System.in.skip(System.in.available());
//				}
		}//6번눌러서 종료 않는 한 무한루프
		
		
		
	}//main
		static final int ADD = 1 ;
		static final int EDIT = 2 ;

	public static void processMenu() throws IOException {
	//	[enum] 열거형 선언

		
		switch (selectedNumber) {
		case ADD: // 추가
			add();
			break;
		case EDIT: // 수정
			break;
		case 3: // 삭제
			//index값 받아서 삭제하고 나머지 한칸씩 땡기기
			delete();
			break;
		case 4: // 검색
			search();
			break;
		case 5: // 조회
			list();
			break;
		case 6: // 종료
			exit();
			break;
		default:
			break;
		}
		일시정지();
	}


	private static void search() {
		
		
	}


	public static void delete() {
		System.out.println("[3. 삭제]");
		int deleteIndex; //삭제할 인덱스 받기
		
		String regex = String.format("[0-%d]", index-1); // 
		
		String inputData;
		do {
			System.out.println(">삭제할 index 입력 ? ");
			inputData = sc.next();
			
		} while (!inputData.matches(regex));
		deleteIndex = Integer.parseInt(inputData);		
		
		m[deleteIndex] = 0;
		for (int i = deleteIndex; i < m.length-1; i++) {
			m[i] =m[i+1];
		}
		System.out.println(Arrays.toString(m));
	}


	public static void 일시정지() {
		System.out.println("> Enter를 누르면 계속합니다");

		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n\n\n");
		

	}


	public static void list() {
		System.out.println("[5.조회]");
		if (index==0) { //index++이 된적 없다는 소리니까 추가x임
			System.out.println("\t 추가된 요소가 없습니다");
			return ; //빠져나가기
		}
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d\t",i , m[i]);
		}
		
		
	}


	public static void add() throws IOException {
		//
		System.out.println("[1. 추가]");
		
		do {
			if (index == m.length) { // >= 일 수가 없으니 > 자체가 필요없음..
//				System.out.println("\t 풀방..");
//				return; 
				increaseArrayM(); // m을 늘려서 방을 키우겠다는 함수
			}
			System.out.println("> 정수입력 ? ");
			int n = sc.nextInt();
			m[index++] =n;
			
			System.out.println("\t 요소 추가 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
	}


	public static void increaseArrayM() {
		int []  temp = new int[m.length+3]; //정수를 넣는게 아니라 계속 늘어나게끔 넣어야댐
//		for (int i = 0; i < m.length; i++) { 
//			temp[i] = m[i];
//		}// 배열 요소들 복사 완료
		
		
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp; //m은 이제 temp의 주소를 참조한다.
	}


	public static void exit() {
		System.out.println("\n\n 프로그램 종료합니다. ~");
		System.exit(-1); //아무값);
		
	}


	public static void selectMenus() {
		String regex = "[1-6]";
		String inputData;
		do {
			System.out.println("> 메뉴를 선택하세요 ?"); //1~6
			inputData = sc.next();
			
		} while (!inputData.matches(regex));
		selectedNumber = Integer.parseInt(inputData);		
	}


	public static void dispMenus() {
		System.out.println("\t\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]%s\t", i+1, menus[i]);
		}
		System.out.println();
	}

}//class
