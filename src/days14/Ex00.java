package days14;

import java.util.Arrays;
import java.util.Iterator;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Ex00 {

	static int countOfK=0;
	static int countOfE=0;
	static int countOfN=0;
	static int countOfI=0;
	static int countOfK2=0;
	static int countOfE2=0;
	static int countOfN2=0;
	static int countOfI2=0;

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";   


		n = n.toUpperCase();
		m = m.toUpperCase();

		char [] n2 = n.toCharArray();
		char [] m2 = m.toCharArray();


		/*
		int [] countN = new int[n.length()] ;
		int [] countM = new int[m.length()] ;


		for (int i = 0; i < n2.length; i++) {
			if (n2[i]=='K') {
				countOfK++;
				countN[0] = countOfK;
			}
			else if (n2[i]=='E') {
				countOfE++;
				countN[1] = countOfE;
			}
			else if (n2[i]=='N') {
				countOfN++;
				countN[2] =countOfN;
			}
			else if (n2[i]=='I') {
				countOfI++;
				countN[3] = countOfI;
			}
		}
		System.out.println(countOfK);
		System.out.println(countOfE);
		System.out.println(countOfN);
		System.out.println(countOfI);




		for (int i = 0; i < m2.length; i++) {
			if (m2[i]=='K') {
				countOfK2++;
				countM[0] = countOfK2;
			}
			else if (m2[i]=='E') {
				countOfE2++;
				countM[1] =  countOfE2;
			}
			else if (m2[i]=='N') {
				countOfN2++;
				countM[2] = countOfN2;
			}
			else if (m2[i]=='I') {
				countOfI2++;
				countM[3] = countOfI2;
			}
		}

		System.out.println(countOfK2);
		System.out.println(countOfE2);
		System.out.println(countOfN2);
		System.out.println(countOfI2);


		for (int i = 0; i < n2.length; i++) {
			if (countM[i] != countN[i]) System.out.println("false");

		} 
		System.out.println("true");
		 */



		if (n.length() != m.length()) {
			System.out.println("false");
		}


		char [] nArr = n.toUpperCase().toCharArray();
		char [] mArr = m.toUpperCase().toCharArray();

		Arrays.sort(mArr);
		Arrays.sort(nArr);

		System.out.println(nArr);
		System.out.println(mArr);

		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] != nArr[i]) System.out.println("false");;
		}
		System.out.println("true");


		// char [] -> String
		// String -> char[]
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);

		System.out.println( n.equals(m) );



	}//main

}//class
