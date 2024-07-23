package days17;

import java.util.Arrays;

public class Ex00_02 {

	public static void main(String[] args) {
		String[] answer =  solution("abc1Addfggg4556b",   6);
		System.out.println( Arrays.toString( answer));
		answer =  solution("abcdef123", 9);
		System.out.println( Arrays.toString( answer));

	}//main

	private static String[] solution(String my_str, int n) {
	    int strLength = (int) Math.ceil((double)my_str.length()/n);
		String[] answer = new String[strLength];
	    
		int begin = 0;
		int end = n;
		
	        for (int i = 0; i <strLength; i++) {
				if (end > my_str.length()) {
					end = my_str.length();
					answer[i] = my_str.substring(begin, end);
					break;
				}
				answer[i] = my_str.substring(begin,end);
				begin+=n;
				end+=n;
				
			}
	        
	        
	        return answer;
	    }

}//class
