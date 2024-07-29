package ch01.verify;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		String [] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};



		System.out.println(Arrays.toString(solution(players, callings)));

	}//main

	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		String temp = "";
		for (int i = 0; i < callings.length; i++) {

			for (int j = 0; j < players.length; j++) {
				if (callings[i].equals(players[j])) {
					temp = players[j];
					players[j] = players[j-1];
					players[j-1] = temp;
				}
			}

		}
		answer = players;


		return answer;
	}



}//class

