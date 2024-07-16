package com.util;

public class Draw2D {
	public static void drawLine() {
		System.out.println("-----------");
	}
	
	public static void drawLine(int length) {
		for (int i = 1; i < length; i++) {
			System.out.print("*");
		}
	}
	
	public static void drawLine(char a , int b) {
		for (int i = 1; i < b; i++) {
			System.out.print(a);
		}
	}
	
//	public static void drawLine() {
//	System.out.println("~~~~~~~");//유지 보수도 여기만 조지면 됨
//}
//
//// 오버로딩 overloading = 같은 함수명으로 중복선언 = 중복함수 /매개변수만 달라도 ㅇㅋ
//public static void drawLine(int length) {
//	for (int i = 1; i < length; i++) {	
//		System.out.print("-");//유지 보수도 여기만 조지면 됨
//	}
//	System.out.println();
//}
////'세'번째 중복함수
//public static void drawLine(char style, int length) {
//	for (int i = 1; i < length; i++) {	
//		System.out.print(style);//유지 보수도 여기만 조지면 됨
//	}
//	System.out.println();
//}
	
	
	
}
