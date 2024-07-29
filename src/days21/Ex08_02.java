package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;

public class Ex08_02 {

	public static void main(String[] args) {
		/*
		String name = "홍길동" ;
		int kor = 98, eng = 89, mat =20;
		int tot = kor+eng+mat;
		double avg = tot/3;
		boolean gender = true;
		
		
		String fileName = ".\\src\\days21\\student.txt";
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {
			String info = br.readLine();
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			String formattedMessage = MessageFormat.format(pattern, name, kor,eng,mat,tot,avg,gender);
			System.out.println(formattedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		String fileName = ".\\src\\days21\\student.txt";
	      
	      try (FileReader reader = new FileReader(fileName);
	          BufferedReader br = new BufferedReader(reader);   ){
	         // "홍길동,98,89,20,207,69.000000,true"
	         String info = br.readLine();
	         
	         System.out.println( info );

	         String pattern ="{0},{1},{2},{3},{4},{5},{6}";
	         MessageFormat mf = new MessageFormat(pattern );
	         Object [] datas = mf.parse(info);
	         String name = (String) datas[0];
	         int kor = (int) datas[1];
	         int eng = (int) datas[2];
	         int mat = (int) datas[3];
	         int tot = (int) datas[4];
	         double avg = (double) datas[5];
	         boolean gender = (boolean) datas[6];

	         System.out.printf("%s %d %d %d %f %b\n"
	               , name , kor, eng, mat, avg, gender);

	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }





	}//main

}//class
