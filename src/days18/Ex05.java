package days18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

/**
 * @author JUNYONG
 * @Date 2024. 7. 24.=오후 4:49:51
 * @subject 30명 성적처리 JCF
 * @content ArrayList + Student 요소 사용..
 *
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		String name;                                            
		int kor, eng, mat, tot, rank;                           
		double avg;                                             

		final int STUDENT_COUNT = 30;                                                     

		ArrayList list = new ArrayList(STUDENT_COUNT);

		Scanner scanner = new Scanner(System.in);                                       
		char con = 'y';                                         


		do {                                                                  
			System.out.printf("> %d번 학생 이,국,영,수 입력 ? ", list.size()+1);             

			name =getName(); //scanner.next();                                
			kor =getScore(); //scanner.nextInt();                             
			eng =getScore(); //scanner.nextInt();                             
			mat =getScore(); //scanner.nextInt();                             
			tot = kor + eng + mat;                                            
			avg = (double)tot / 3;                                            
			rank = 1;                                                         


			Student s = new Student(name, kor, eng, mat, tot, rank, avg);
			
			list.add(s); //Student 객체가 하나씩 리스트에 찬다

			// 입력 계속 ?                                                        
			System.out.print("> 학생 입력 계속 ? ");                                
			con = (char)System.in.read();                                     
			System.in.skip(System.in.available());                            
			// } while ( con == 'Y' || con == 'y');                           
		} while ( Character.toUpperCase(con) == 'Y'   );                      
		
		System.out.printf("총 학생수 : %d\n", list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
                                                 
	}//main
	private static String getName() {                                                                                              
		Random rnd = new Random();                                                                                                 
		String [] lastNames = {"김","이","박","최","권"};                                                                               
		int index = rnd.nextInt(lastNames.length); //인덱스 랜덤 발생                                                                     
		String name = lastNames[index];                                                                                            
		char  [] firstNames = new char[2]; //이름 :2문자 가정                                                                            
		for (int i = 0; i < firstNames.length; i++) {                                                                              
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1)+'가'); //괄호 안은 한글 갯수에 관한 문제,,  +'가'를 함으로써 가~ (갯수만큼의 범위)를 돌림              
		}                                                                                                                          
		String firstName =String.valueOf(firstNames);                                                                              
		name += firstName;                                                                                                         
		return name;                                                                                                               
	}                                                                                                                              

	public static int getScore() {                                                                                                 
		return (int)(Math.random()*101+1);                                                                                         
	}                                                                                                                              
}//class
