package ch01.verify;
import java.util.Arrays;
//"n is even"을, 홀수이면 "n is odd"
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		int s =2 ;
		String my_string="He11oWor1d";
		String overwrite_string ="lloWorl";
		System.out.println(solution(my_string,overwrite_string,s));
	}

	public static String solution(String my_string, String overwrite_string, int s) {
		
		char [] my = my_string.toCharArray();
		char [] over = overwrite_string.toCharArray();
		for (int i = s; i-s < overwrite_string.length(); i++) {
			my[i] = over[i-s];
	
		}
		
		
		String answer = new String(my);
		
		
		return answer;

	}
}