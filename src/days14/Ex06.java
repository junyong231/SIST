package days14;

import days12.Tv;

/**
 * @author JUNYONG
 * @Date 2024. 7. 18.=오후 12:20:05
 * @subject
 * @content	days12 Tv.java
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		//days12 Tv를 상속받아서 자막 기능있는 새로운 Tv작성..
		
		
		CaptionTv ctv= new CaptionTv();
		ctv.power();
		
		//채널 초기값 1
		ctv.channelDown();
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.caption = true;
		ctv.dispCaption("Tv 자막");
		ctv.dispCaption("Tv 자막2");
		
		ctv.power();
		System.out.println("END");
	}//main

}//class

class CaptionTv extends Tv {
	
	boolean caption; //자막 on/off표현
	
	void dispCaption(String message) {
		if (caption) System.out.println(message); //자막 기능 On일때 출력..
	}
	
	
}