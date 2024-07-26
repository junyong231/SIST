//package days20;
//
//import java.lang.management.BufferPoolMXBean;
//
//import days20.Button.OnClickListener;
//
///**
// * @author JUNYONG
// * @Date 2024. 7. 26.=오후 2:01:17
// * @subject
// * @content 미완 // 봐두는걸로 ㅇㅋ
// *
// */
//public class Ex06 {
//
//	public static void main(String[] args) {
//		Button callButton = new Button(new CallListener());
//		callButton.touch();
//		
//		Button messageButton = new Button();
//		messageButton
//		
//		
//	}//main
//
//}//class
//
////버튼 - 클릭 이벤트 발생 -> 처리
//class Button {
//	//필드
//	OnClickListener listener;
//	
//	Button(){}
//	
//	public void touch() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	Button(OnClickListener listener){
//		this.listener = listener; //엔진과 같은 상황 (주입)
//	}
//	
//	public void setListener(OnClickListener listener) {
//		this.listener = listener;
//	}
//
//	interface OnClickListener {
//		void onClick(); // 추상메서드
//
//	}
//
//}//Button class
//
//
//
////Button.OnClickListener 구현 클래스
//class CallListener implements Button.OnClickListener {
//	@Override
//	public void onClick() {
//		System.out.println("전화를 건다");
//
//	}
//}
//class MessageListener implements Button.OnClickListener {
//	@Override
//	public void onClick() {
//		System.out.println("전화를 건다");
//
//	}
//}
//
//
//
//
