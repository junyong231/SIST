package days12;

import java.util.Scanner;

public class Student {

	//필드
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	//메서도
	public void dispInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\t%d\n",
				name,kor,eng,mat,tot,avg,rank,wrank);
	}

}
