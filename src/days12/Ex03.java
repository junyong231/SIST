package days12;

import java.util.Scanner;

/**
 * @author JUNYONG
 * @Date 2024. 7. 16.=오후 12:17:39
 * @subject 
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		//public int age = 10;  지역변수에는 접근지정자 쓰지 않음 (public없어야됨)
		//클래스: 객체의 설계도 , 객체: 클래스를 자료형으로 하는 '참조변수'★
		Tv t1;//t1은 객체(참조변수. 주소값 받는 역할)
		
		//인스턴스:  t1이 가리키고 있는 주소 []
		// [power][channel][color][power()][channelup,down()]...
		
		//인스턴스(=생성된 객체)화 실제Tv생김
		t1 = new Tv(); //객체 생성 또는 인스턴스화 라고 칭함 		new Tv()는 인스턴스화 시키는 코드		t1은 참조변수(객체)  new Tv()로 인스턴스됨
		System.out.println(t1);
		t1 = new Tv(); //이 둘은 같지 않다?! (참조하는 주소가 다름)
		System.out.println(t1);

		//멤버에 접근하는법 : 객체명.필드명	객체명.메서드명
		// Tv. :안됨 클래스명. 한거라서
		t1.power(); //켜기 (초기화값이 false였음)
		System.out.println(t1.power ? "0" : "X");
		t1.power(); // 끄기
		System.out.println(t1.power ? "0" : "X");
		
		t1.channel =10; //채널 변경
		System.out.println(t1.channel); //지금 보고있는 채널?
		
		t1.channelDown(); //9번이 되어야함
		System.out.println(t1.channel);
	}//main

}//class
