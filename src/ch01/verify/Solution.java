package ch01.verify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		String [] players = {"mumu", "soe", "poe", "kai", "mine"}; // 현재 등수
		String[] callings = {"kai", "kai", "mine", "mine"};



		solution(players, callings);

	}//main

	public static void solution(String[] players, String[] callings) {
		String[] answer = {};
		HashMap<String, Integer> runner = new HashMap<String, Integer>();
		
		for (int i = 0; i < players.length; i++) {
			runner.put(players[i], i+1);
		}
		System.out.println(runner); //맵 완성
		System.out.println(runner.get(players[3])); //플레이어즈의 인덱스 3인 카이의 현재 등수가 뽑힘
		System.out.println(runner.get(callings[0])); //콜링스의 인덱스 0인 카이의 현재 등수 뽑힘
		
		for (int i = 0; i < callings.length; i++) {
			
		}
		
	
	
	}//solution
	



}//class




