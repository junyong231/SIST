package days11;

public class Hukushu {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 71, 37 };
		int n = 71;
		
		int index = 0;
		int beginIndex = 0;
		
		while ( (index = indexOf(m,n,beginIndex)) != -1) {
			if (m[index]==n) {
				System.out.println(index);
			}
			beginIndex=index+1;
		}
		

	}//main

	private static int indexOf(int[] m, int n, int beginIndex) {
		for (int i = beginIndex; i < m.length; i++) {
			if (m[i]==n) {
				return i;
			}
		}
		return -1;
	}

}//class
