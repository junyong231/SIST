package ch01.verify;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	String str = "aBcDeFg";
		System.out.println(solution(str));
    }//main

    //대 -> 소 , 소-> 대 바꾸기
    
	private static String solution(String str) {
		char [] strArr = str.toCharArray();
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i]>= 'A' && strArr[i]<='Z') {
				strArr[i] = Character.toLowerCase(strArr[i]);
			}else {
				strArr[i] = Character.toUpperCase(strArr[i]);
            }
		}
		str = String.valueOf(strArr);
		
		
		return str;
	}
    
    
}//class