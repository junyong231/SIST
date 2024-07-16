package days07;

import java.util.Iterator;
import java.util.Random;

/**
 * @author JUNYONG
 * @date 2024. 7. 9. -오후 5:05:52
 * @subject
 * @content
 */
public class Ex_07 {

	public static void main(String[] args) {
		//[로또6/45 게임]

		// 1 <= (int) double Math.random()*45+1 <46


		//Random rnd = new Random();
		//rnd.nextInt(45)+1;

		int lottoNumber;

		int [] lotto = new int[6];

		fillLotto(lotto);

		printLotto(lotto);

		//		for (int i = 1; i <= 6; i++) {
		//			lottoNumber = (int) (Math.random()*45+1);
		//			System.out.printf("[%d]",lottoNumber);
		//		}//중복 제거는 어떻게 할까
		//		System.out.println(); 

	}//main

	public static void fillLotto(int[] lotto) { //lotto라는 배열을 채우기 위한 메소드
		int lottoNumber;
		for (int i = 0; i < lotto.length; i++) {
			lottoNumber = (int) (Math.random()*45)+1;
			lotto[i] = lottoNumber;
		}
	}

	public static void printLotto(int[] lotto) {//로또라는 배열을 하나씩 까보는 메소드
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}//for i
		System.out.println();
	}

	
//	private static void fillLotto(int[] lotto) {
//		int lottoNumber;
//		/*
//		for (int i = 0; i < lotto.length; i++) {
//			lottoNumber = (int)(Math.random()*45)+1;
//			lotto[i] = lottoNumber;
//		}
//		*/
//	}
//
//	private static void dispLotto(int[] lotto) {
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.printf("[%d]",lotto[i]);
//		}
//		System.out.println();
//	}
}//class
