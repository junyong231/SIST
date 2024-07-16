package days11;

public class Test0715 {

	public static void main(String[] args) {
		
		int[][]m=new int[5][5];
		
		//fillM(m); // 정배열
		//fillM2(m); //역배열
		//fillM3(m); //세로역배열
		//fillM4(m); //지그재그
		fillM5(m); //대각선
		
		
		printM(m);
		

	}//main
	
private static void fillM5(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = m.length ;
			}
		}
		
	}

//	private static void fillM4(int[][] m) {
//		for (int i = 0; i < m.length; i++) {//행조건 
//			for (int j = 0; j < m.length; j++) {//열조건
//				m[i][j]= (i+1)*(m.length)-4+j;
//			}//for j
//		}//for i
//		
//	}

//	private static void fillM3(int[][] m) {
//		for (int i = 0; i < m.length; i++) {//행조건 
//		for (int j = 0; j < m.length; j++) {//열조건
//			m[i][j]= (m.length-i)*(j+1)+j*(i);
//		}//for j
//	}//for i
//		
	

//	private static void fillM2(int[][] m) {
//		for (int i = 0; i < m.length; i++) { 
//			for (int j = 0; j < m.length; j++) {
//				m[i][j]= 25 - (i*5) - j;
//			}//for j
//		}//for i
//		
//	}




	private static void printM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
		
	}

	/*
	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m.length; j++) {
				m[i][j]= m.length*i +j+1;
			}//for j
		}//for i
	}//fillM
*/
	
	
	
}//class
